package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a control event send by extended user interface controls.
  * @since OOo 2.0.3
  */
trait ControlEvent extends StObject {
  
  /** specifies the event which has occurred. */
  var Event: String
  
  /** specifies a sequence of named values which are used as additional values for the event. The number and types of named values depend on the event. */
  var aInformation: SafeArray[NamedValue]
  
  /** fully parsed URL describing the control that sends this notification. */
  var aURL: URL
}
object ControlEvent {
  
  inline def apply(Event: String, aInformation: SafeArray[NamedValue], aURL: URL): ControlEvent = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], aInformation = aInformation.asInstanceOf[js.Any], aURL = aURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlEvent] (val x: Self) extends AnyVal {
    
    inline def setAInformation(value: SafeArray[NamedValue]): Self = StObject.set(x, "aInformation", value.asInstanceOf[js.Any])
    
    inline def setAURL(value: URL): Self = StObject.set(x, "aURL", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
  }
}
