package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverDnssecConfigsResponse extends StObject {
  
  /**
    * If a response includes the last of the DNSSEC configurations that are associated with the current Amazon Web Services account, NextToken doesn't appear in the response. If a response doesn't include the last of the configurations, you can get more configurations by submitting another ListResolverDnssecConfigs request. Get the value of NextToken that Amazon Route 53 returned in the previous response and include it in NextToken in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * An array that contains one ResolverDnssecConfig element for each configuration for DNSSEC validation that is associated with the current Amazon Web Services account.
    */
  var ResolverDnssecConfigs: js.UndefOr[ResolverDnssecConfigList] = js.undefined
}
object ListResolverDnssecConfigsResponse {
  
  inline def apply(): ListResolverDnssecConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverDnssecConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResolverDnssecConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverDnssecConfigs(value: ResolverDnssecConfigList): Self = StObject.set(x, "ResolverDnssecConfigs", value.asInstanceOf[js.Any])
    
    inline def setResolverDnssecConfigsUndefined: Self = StObject.set(x, "ResolverDnssecConfigs", js.undefined)
    
    inline def setResolverDnssecConfigsVarargs(value: ResolverDnssecConfig*): Self = StObject.set(x, "ResolverDnssecConfigs", js.Array(value*))
  }
}
