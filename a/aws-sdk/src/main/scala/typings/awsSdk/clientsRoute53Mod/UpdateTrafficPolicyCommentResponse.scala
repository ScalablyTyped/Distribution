package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrafficPolicyCommentResponse extends StObject {
  
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.clientsRoute53Mod.TrafficPolicy
}
object UpdateTrafficPolicyCommentResponse {
  
  inline def apply(TrafficPolicy: TrafficPolicy): UpdateTrafficPolicyCommentResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyCommentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTrafficPolicyCommentResponse] (val x: Self) extends AnyVal {
    
    inline def setTrafficPolicy(value: TrafficPolicy): Self = StObject.set(x, "TrafficPolicy", value.asInstanceOf[js.Any])
  }
}
