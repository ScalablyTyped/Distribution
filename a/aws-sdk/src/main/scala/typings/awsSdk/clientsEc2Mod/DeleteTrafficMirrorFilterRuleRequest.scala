package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorFilterRuleRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: typings.awsSdk.clientsEc2Mod.TrafficMirrorFilterRuleId
}
object DeleteTrafficMirrorFilterRuleRequest {
  
  inline def apply(TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId): DeleteTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleRequest]
  }
  
  extension [Self <: DeleteTrafficMirrorFilterRuleRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
  }
}
