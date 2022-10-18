package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRuleResponse extends StObject {
  
  /**
    * Information about the Resolver rule that you specified in a GetResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRule] = js.undefined
}
object GetResolverRuleResponse {
  
  inline def apply(): GetResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRuleResponse]
  }
  
  extension [Self <: GetResolverRuleResponse](x: Self) {
    
    inline def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
