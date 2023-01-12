package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirewallConfigsResponse extends StObject {
  
  /**
    * The configurations for the firewall behavior provided by DNS Firewall for VPCs from Amazon Virtual Private Cloud (Amazon VPC). 
    */
  var FirewallConfigs: js.UndefOr[FirewallConfigList] = js.undefined
  
  /**
    * If objects are still available for retrieval, Resolver returns this token in the response. To retrieve the next batch of objects, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
}
object ListFirewallConfigsResponse {
  
  inline def apply(): ListFirewallConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirewallConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFirewallConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallConfigs(value: FirewallConfigList): Self = StObject.set(x, "FirewallConfigs", value.asInstanceOf[js.Any])
    
    inline def setFirewallConfigsUndefined: Self = StObject.set(x, "FirewallConfigs", js.undefined)
    
    inline def setFirewallConfigsVarargs(value: FirewallConfig*): Self = StObject.set(x, "FirewallConfigs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
