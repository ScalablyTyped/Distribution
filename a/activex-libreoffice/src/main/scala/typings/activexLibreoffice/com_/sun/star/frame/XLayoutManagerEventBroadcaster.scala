package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a layout manager.
  * @see com.sun.star.frame.LayoutManager
  * @since OOo 2.0
  */
trait XLayoutManagerEventBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds a layout manager event listener to the object's listener list.
    * @param aLayoutManagerListener a listener that wants to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def addLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
  
  /**
    * removes a layout manager event listener from the object's listener list.
    * @param aLayoutManagerListener a listener that don't want to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def removeLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): Unit
}
object XLayoutManagerEventBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addLayoutManagerEventListener: XLayoutManagerListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLayoutManagerEventListener: XLayoutManagerListener => Unit
  ): XLayoutManagerEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLayoutManagerEventListener = js.Any.fromFunction1(addLayoutManagerEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLayoutManagerEventListener = js.Any.fromFunction1(removeLayoutManagerEventListener))
    __obj.asInstanceOf[XLayoutManagerEventBroadcaster]
  }
  
  extension [Self <: XLayoutManagerEventBroadcaster](x: Self) {
    
    inline def setAddLayoutManagerEventListener(value: XLayoutManagerListener => Unit): Self = StObject.set(x, "addLayoutManagerEventListener", js.Any.fromFunction1(value))
    
    inline def setRemoveLayoutManagerEventListener(value: XLayoutManagerListener => Unit): Self = StObject.set(x, "removeLayoutManagerEventListener", js.Any.fromFunction1(value))
  }
}
