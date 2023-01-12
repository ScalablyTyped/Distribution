package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageDevicesResponse extends StObject {
  
  /**
    * List of summaries of devices allocated to the stage.
    */
  var DeviceDeploymentSummaries: typings.awsSdk.clientsSagemakerMod.DeviceDeploymentSummaries
  
  /**
    * The token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListStageDevicesResponse {
  
  inline def apply(DeviceDeploymentSummaries: DeviceDeploymentSummaries): ListStageDevicesResponse = {
    val __obj = js.Dynamic.literal(DeviceDeploymentSummaries = DeviceDeploymentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageDevicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStageDevicesResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceDeploymentSummaries(value: DeviceDeploymentSummaries): Self = StObject.set(x, "DeviceDeploymentSummaries", value.asInstanceOf[js.Any])
    
    inline def setDeviceDeploymentSummariesVarargs(value: DeviceDeploymentSummary*): Self = StObject.set(x, "DeviceDeploymentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
