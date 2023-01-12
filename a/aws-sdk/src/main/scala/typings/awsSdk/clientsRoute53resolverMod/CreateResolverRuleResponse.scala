package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverRuleResponse extends StObject {
  
  /**
    * Information about the CreateResolverRule request, including the status of the request.
    */
  var ResolverRule: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverRule] = js.undefined
}
object CreateResolverRuleResponse {
  
  inline def apply(): CreateResolverRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResolverRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResolverRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setResolverRule(value: ResolverRule): Self = StObject.set(x, "ResolverRule", value.asInstanceOf[js.Any])
    
    inline def setResolverRuleUndefined: Self = StObject.set(x, "ResolverRule", js.undefined)
  }
}
