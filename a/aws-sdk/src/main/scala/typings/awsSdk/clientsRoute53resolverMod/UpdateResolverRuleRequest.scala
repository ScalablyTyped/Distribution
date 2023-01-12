package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverRuleRequest extends StObject {
  
  /**
    * The new settings for the Resolver rule.
    */
  var Config: ResolverRuleConfig
  
  /**
    * The ID of the Resolver rule that you want to update.
    */
  var ResolverRuleId: ResourceId
}
object UpdateResolverRuleRequest {
  
  inline def apply(Config: ResolverRuleConfig, ResolverRuleId: ResourceId): UpdateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResolverRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: ResolverRuleConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
