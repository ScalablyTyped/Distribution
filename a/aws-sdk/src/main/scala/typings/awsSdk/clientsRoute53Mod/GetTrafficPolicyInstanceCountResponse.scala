package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyInstanceCountResponse extends StObject {
  
  /**
    * The number of traffic policy instances that are associated with the current Amazon Web Services account.
    */
  var TrafficPolicyInstanceCount: typings.awsSdk.clientsRoute53Mod.TrafficPolicyInstanceCount
}
object GetTrafficPolicyInstanceCountResponse {
  
  inline def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTrafficPolicyInstanceCountResponse] (val x: Self) extends AnyVal {
    
    inline def setTrafficPolicyInstanceCount(value: TrafficPolicyInstanceCount): Self = StObject.set(x, "TrafficPolicyInstanceCount", value.asInstanceOf[js.Any])
  }
}
