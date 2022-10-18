package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSpotFleetRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The configuration for the Spot Fleet request.
    */
  var SpotFleetRequestConfig: SpotFleetRequestConfigData
}
object RequestSpotFleetRequest {
  
  inline def apply(SpotFleetRequestConfig: SpotFleetRequestConfigData): RequestSpotFleetRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestConfig = SpotFleetRequestConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSpotFleetRequest]
  }
  
  extension [Self <: RequestSpotFleetRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSpotFleetRequestConfig(value: SpotFleetRequestConfigData): Self = StObject.set(x, "SpotFleetRequestConfig", value.asInstanceOf[js.Any])
  }
}
