package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficPolicyRequest extends StObject {
  
  /**
    * The ID of the traffic policy that you want to delete.
    */
  var Id: TrafficPolicyId
  
  /**
    * The version number of the traffic policy that you want to delete.
    */
  var Version: TrafficPolicyVersion
}
object DeleteTrafficPolicyRequest {
  
  inline def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): DeleteTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficPolicyRequest]
  }
  
  extension [Self <: DeleteTrafficPolicyRequest](x: Self) {
    
    inline def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
