package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceFleetsResponse extends StObject {
  
  /**
    * Summary of the device fleet.
    */
  var DeviceFleetSummaries: typings.awsSdk.clientsSagemakerMod.DeviceFleetSummaries
  
  /**
    * The response from the last list when returning a list large enough to need tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListDeviceFleetsResponse {
  
  inline def apply(DeviceFleetSummaries: DeviceFleetSummaries): ListDeviceFleetsResponse = {
    val __obj = js.Dynamic.literal(DeviceFleetSummaries = DeviceFleetSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceFleetsResponse]
  }
  
  extension [Self <: ListDeviceFleetsResponse](x: Self) {
    
    inline def setDeviceFleetSummaries(value: DeviceFleetSummaries): Self = StObject.set(x, "DeviceFleetSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetSummariesVarargs(value: DeviceFleetSummary*): Self = StObject.set(x, "DeviceFleetSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
