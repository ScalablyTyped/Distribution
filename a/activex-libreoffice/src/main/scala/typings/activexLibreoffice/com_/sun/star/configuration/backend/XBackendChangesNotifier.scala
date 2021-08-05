package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes when data from backend sources has changed.
  * @see XBackendChangesListener
  */
trait XBackendChangesNotifier
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive events when changes occurred.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def addChangesListener(aListener: XBackendChangesListener, component: String): Unit
  
  /**
    * removes the specified listener.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def removeChangesListener(aListener: XBackendChangesListener, component: String): Unit
}
object XBackendChangesNotifier {
  
  inline def apply(
    acquire: () => Unit,
    addChangesListener: (XBackendChangesListener, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: (XBackendChangesListener, String) => Unit
  ): XBackendChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction2(addChangesListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction2(removeChangesListener))
    __obj.asInstanceOf[XBackendChangesNotifier]
  }
  
  extension [Self <: XBackendChangesNotifier](x: Self) {
    
    inline def setAddChangesListener(value: (XBackendChangesListener, String) => Unit): Self = StObject.set(x, "addChangesListener", js.Any.fromFunction2(value))
    
    inline def setRemoveChangesListener(value: (XBackendChangesListener, String) => Unit): Self = StObject.set(x, "removeChangesListener", js.Any.fromFunction2(value))
  }
}
