package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesResponse extends StObject {
  
  /**
    * Summary of devices.
    */
  var DeviceSummaries: typings.awsSdk.clientsSagemakerMod.DeviceSummaries
  
  /**
    * The response from the last list when returning a list large enough to need tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListDevicesResponse {
  
  inline def apply(DeviceSummaries: DeviceSummaries): ListDevicesResponse = {
    val __obj = js.Dynamic.literal(DeviceSummaries = DeviceSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesResponse]
  }
  
  extension [Self <: ListDevicesResponse](x: Self) {
    
    inline def setDeviceSummaries(value: DeviceSummaries): Self = StObject.set(x, "DeviceSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceSummariesVarargs(value: DeviceSummary*): Self = StObject.set(x, "DeviceSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
