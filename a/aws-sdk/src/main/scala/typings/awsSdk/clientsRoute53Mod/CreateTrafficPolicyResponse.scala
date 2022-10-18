package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficPolicyResponse extends StObject {
  
  /**
    * A unique URL that represents a new traffic policy.
    */
  var Location: ResourceURI
  
  /**
    * A complex type that contains settings for the new traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.clientsRoute53Mod.TrafficPolicy
}
object CreateTrafficPolicyResponse {
  
  inline def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyResponse]
  }
  
  extension [Self <: CreateTrafficPolicyResponse](x: Self) {
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicy(value: TrafficPolicy): Self = StObject.set(x, "TrafficPolicy", value.asInstanceOf[js.Any])
  }
}
