package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the traffic policy instance that you want to get information about.
    */
  var Id: TrafficPolicyInstanceId
}
object GetTrafficPolicyInstanceRequest {
  
  inline def apply(Id: TrafficPolicyInstanceId): GetTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
  }
  
  extension [Self <: GetTrafficPolicyInstanceRequest](x: Self) {
    
    inline def setId(value: TrafficPolicyInstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
