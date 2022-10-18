package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsoleOutputRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * When enabled, retrieves the latest console output for the instance. Default: disabled (false)
    */
  var Latest: js.UndefOr[Boolean] = js.undefined
}
object GetConsoleOutputRequest {
  
  inline def apply(InstanceId: InstanceId): GetConsoleOutputRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleOutputRequest]
  }
  
  extension [Self <: GetConsoleOutputRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLatest(value: Boolean): Self = StObject.set(x, "Latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "Latest", js.undefined)
  }
}
