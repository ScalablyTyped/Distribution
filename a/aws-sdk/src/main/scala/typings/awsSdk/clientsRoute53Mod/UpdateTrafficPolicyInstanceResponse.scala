package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrafficPolicyInstanceResponse extends StObject {
  
  /**
    * A complex type that contains settings for the updated traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsSdk.clientsRoute53Mod.TrafficPolicyInstance
}
object UpdateTrafficPolicyInstanceResponse {
  
  inline def apply(TrafficPolicyInstance: TrafficPolicyInstance): UpdateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = StObject.set(x, "TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
}
