package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this struct describes an accessible event, that is broadcasted from the {@link XAccessibleEventBroadcaster} and notified to {@link
  * XAccessibleEventListener} .
  *
  * It is usually implemented by {@link AccessibleContext} .
  * @since OOo 1.1.2
  */
trait AccessibleEventObject
  extends StObject
     with EventObject {
  
  /**
    * specifies the type of this event.
    *
    * For a list of possible events see {@link AccessibleEventId} .
    */
  var EventId: Double
  
  /**
    * for events that specifies a value change, this is the new value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var NewValue: js.Any
  
  /**
    * for events that specifies a value change, this is the old value.
    *
    * Depending on the {@link EventId} , this can be void.
    */
  var OldValue: js.Any
}
object AccessibleEventObject {
  
  @scala.inline
  def apply(EventId: Double, NewValue: js.Any, OldValue: js.Any, Source: XInterface): AccessibleEventObject = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleEventObject]
  }
  
  @scala.inline
  implicit class AccessibleEventObjectMutableBuilder[Self <: AccessibleEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: Double): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
  }
}
