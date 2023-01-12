package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverConfigsResponse extends StObject {
  
  /**
    * If a response includes the last of the Resolver configurations that are associated with the current Amazon Web Services account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListResolverConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * An array that contains one ResolverConfigs element for each Resolver configuration that is associated with the current Amazon Web Services account.
    */
  var ResolverConfigs: js.UndefOr[ResolverConfigList] = js.undefined
}
object ListResolverConfigsResponse {
  
  inline def apply(): ListResolverConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResolverConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverConfigs(value: ResolverConfigList): Self = StObject.set(x, "ResolverConfigs", value.asInstanceOf[js.Any])
    
    inline def setResolverConfigsUndefined: Self = StObject.set(x, "ResolverConfigs", js.undefined)
    
    inline def setResolverConfigsVarargs(value: ResolverConfig*): Self = StObject.set(x, "ResolverConfigs", js.Array(value*))
  }
}
