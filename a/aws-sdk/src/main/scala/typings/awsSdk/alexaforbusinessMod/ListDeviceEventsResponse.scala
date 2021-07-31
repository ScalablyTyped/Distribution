package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceEventsResponse extends StObject {
  
  /**
    * The device events requested for the device ARN.
    */
  var DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
}
object ListDeviceEventsResponse {
  
  @scala.inline
  def apply(): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
  
  @scala.inline
  implicit class ListDeviceEventsResponseMutableBuilder[Self <: ListDeviceEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceEvents(value: DeviceEventList): Self = StObject.set(x, "DeviceEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceEventsUndefined: Self = StObject.set(x, "DeviceEvents", js.undefined)
    
    @scala.inline
    def setDeviceEventsVarargs(value: DeviceEvent*): Self = StObject.set(x, "DeviceEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
