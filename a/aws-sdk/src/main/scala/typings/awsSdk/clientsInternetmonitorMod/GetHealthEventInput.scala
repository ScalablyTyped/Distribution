package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthEventInput extends StObject {
  
  /**
    * The internally generated identifier of a health event. Because EventID contains the forward slash (“/”) character, you must URL-encode the EventID field in the request URL.
    */
  var EventId: HealthEventName
  
  /**
    * The name of the monitor.
    */
  var MonitorName: ResourceName
}
object GetHealthEventInput {
  
  inline def apply(EventId: HealthEventName, MonitorName: ResourceName): GetHealthEventInput = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], MonitorName = MonitorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthEventInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHealthEventInput] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: HealthEventName): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
  }
}
