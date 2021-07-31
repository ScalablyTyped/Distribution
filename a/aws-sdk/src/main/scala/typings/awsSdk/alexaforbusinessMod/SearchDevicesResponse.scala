package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDevicesResponse extends StObject {
  
  /**
    * The devices that meet the specified set of filter criteria, in sort order.
    */
  var Devices: js.UndefOr[DeviceDataList] = js.undefined
  
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The total number of devices returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.undefined
}
object SearchDevicesResponse {
  
  @scala.inline
  def apply(): SearchDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDevicesResponse]
  }
  
  @scala.inline
  implicit class SearchDevicesResponseMutableBuilder[Self <: SearchDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: DeviceDataList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: DeviceData*): Self = StObject.set(x, "Devices", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
