package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
trait XItemEventBroadcaster
  extends StObject
     with XInterface {
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
}
object XItemEventBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit
  ): XItemEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener))
    __obj.asInstanceOf[XItemEventBroadcaster]
  }
  
  extension [Self <: XItemEventBroadcaster](x: Self) {
    
    inline def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    inline def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
  }
}
