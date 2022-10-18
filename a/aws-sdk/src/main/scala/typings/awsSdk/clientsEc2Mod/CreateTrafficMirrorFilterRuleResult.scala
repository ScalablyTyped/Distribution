package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficMirrorFilterRule] = js.undefined
}
object CreateTrafficMirrorFilterRuleResult {
  
  inline def apply(): CreateTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleResult]
  }
  
  extension [Self <: CreateTrafficMirrorFilterRuleResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = StObject.set(x, "TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterRuleUndefined: Self = StObject.set(x, "TrafficMirrorFilterRule", js.undefined)
  }
}
