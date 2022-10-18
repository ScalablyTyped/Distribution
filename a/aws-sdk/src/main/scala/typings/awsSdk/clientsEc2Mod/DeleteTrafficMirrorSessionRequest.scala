package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorSessionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Traffic Mirror session.
    */
  var TrafficMirrorSessionId: typings.awsSdk.clientsEc2Mod.TrafficMirrorSessionId
}
object DeleteTrafficMirrorSessionRequest {
  
  inline def apply(TrafficMirrorSessionId: TrafficMirrorSessionId): DeleteTrafficMirrorSessionRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorSessionId = TrafficMirrorSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorSessionRequest]
  }
  
  extension [Self <: DeleteTrafficMirrorSessionRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setTrafficMirrorSessionId(value: TrafficMirrorSessionId): Self = StObject.set(x, "TrafficMirrorSessionId", value.asInstanceOf[js.Any])
  }
}
