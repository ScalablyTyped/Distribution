package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlowLogsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more flow log IDs. Constraint: Maximum of 1000 flow log IDs.
    */
  var FlowLogIds: FlowLogIdList
}
object DeleteFlowLogsRequest {
  
  inline def apply(FlowLogIds: FlowLogIdList): DeleteFlowLogsRequest = {
    val __obj = js.Dynamic.literal(FlowLogIds = FlowLogIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowLogsRequest]
  }
  
  extension [Self <: DeleteFlowLogsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFlowLogIds(value: FlowLogIdList): Self = StObject.set(x, "FlowLogIds", value.asInstanceOf[js.Any])
    
    inline def setFlowLogIdsVarargs(value: VpcFlowLogId*): Self = StObject.set(x, "FlowLogIds", js.Array(value*))
  }
}
