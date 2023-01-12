package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRuleRequest extends StObject {
  
  /**
    * The ID of the Resolver rule that you want to get information about.
    */
  var ResolverRuleId: ResourceId
}
object GetResolverRuleRequest {
  
  inline def apply(ResolverRuleId: ResourceId): GetResolverRuleRequest = {
    val __obj = js.Dynamic.literal(ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResolverRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setResolverRuleId(value: ResourceId): Self = StObject.set(x, "ResolverRuleId", value.asInstanceOf[js.Any])
  }
}
