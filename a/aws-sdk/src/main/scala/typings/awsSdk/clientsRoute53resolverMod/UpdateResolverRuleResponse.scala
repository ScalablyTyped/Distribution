package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverRuleResponse extends StObject {
  
  /**
    * The response to an UpdateResolverRule request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRule] = js.undefined
}
object UpdateResolverRuleResponse {
  
  inline def apply(): UpdateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverRuleResponse]
  }
  
  extension [Self <: UpdateResolverRuleResponse](x: Self) {
    
    inline def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
