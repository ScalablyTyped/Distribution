package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Must be implemented by dispatch objects which want to get notifications about control events.
  * @since OOo 2.0.3
  */
trait XControlNotificationListener
  extends StObject
     with XInterface {
  
  /**
    * notifies that a control event has happened
    * @param Event contains the event information
    */
  def controlEvent(Event: ControlEvent): Unit
}
object XControlNotificationListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    controlEvent: ControlEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlNotificationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlEvent = js.Any.fromFunction1(controlEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XControlNotificationListener]
  }
  
  @scala.inline
  implicit class XControlNotificationListenerMutableBuilder[Self <: XControlNotificationListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlEvent(value: ControlEvent => Unit): Self = StObject.set(x, "controlEvent", js.Any.fromFunction1(value))
  }
}
