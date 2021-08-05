package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports quick access to the information if a container currently contains elements.
  *
  * The {@link XContainer} interface is provided for containers which need to broadcast changes within the container; that means the actions of adding or
  * removing elements are broadcast to the listeners.
  *
  * This can be useful for UI to enable/disable some functions without actually accessing the data.
  * @see XContent
  * @see XIndexAccess
  * @see XNameAccess
  * @see XEnumerationAccess
  */
trait XContainer
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive events when elements are inserted or removed.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XContainerListener
    */
  def addContainerListener(xListener: XContainerListener): Unit
  
  /**
    * removes the specified listener so it does not receive any events from this container.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XContainerListener
    */
  def removeContainerListener(xListener: XContainerListener): Unit
}
object XContainer {
  
  inline def apply(
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit
  ): XContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener))
    __obj.asInstanceOf[XContainer]
  }
  
  extension [Self <: XContainer](x: Self) {
    
    inline def setAddContainerListener(value: XContainerListener => Unit): Self = StObject.set(x, "addContainerListener", js.Any.fromFunction1(value))
    
    inline def setRemoveContainerListener(value: XContainerListener => Unit): Self = StObject.set(x, "removeContainerListener", js.Any.fromFunction1(value))
  }
}
