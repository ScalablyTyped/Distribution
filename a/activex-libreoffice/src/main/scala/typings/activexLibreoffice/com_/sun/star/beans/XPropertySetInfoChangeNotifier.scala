package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a notifier for changes of XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeListener
  */
trait XPropertySetInfoChangeNotifier
  extends StObject
     with XInterface {
  
  /**
    * registers a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addPropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit
  
  /**
    * removes a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removePropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit
}
object XPropertySetInfoChangeNotifier {
  
  inline def apply(
    acquire: () => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit
  ): XPropertySetInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener))
    __obj.asInstanceOf[XPropertySetInfoChangeNotifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPropertySetInfoChangeNotifier] (val x: Self) extends AnyVal {
    
    inline def setAddPropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = StObject.set(x, "addPropertySetInfoChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemovePropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = StObject.set(x, "removePropertySetInfoChangeListener", js.Any.fromFunction1(value))
  }
}
