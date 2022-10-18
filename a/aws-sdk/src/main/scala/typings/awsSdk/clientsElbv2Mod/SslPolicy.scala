package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslPolicy extends StObject {
  
  /**
    * The ciphers.
    */
  var Ciphers: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Ciphers] = js.undefined
  
  /**
    * The name of the policy.
    */
  var Name: js.UndefOr[SslPolicyName] = js.undefined
  
  /**
    * The protocols.
    */
  var SslProtocols: js.UndefOr[typings.awsSdk.clientsElbv2Mod.SslProtocols] = js.undefined
  
  /**
    *  The supported load balancers. 
    */
  var SupportedLoadBalancerTypes: js.UndefOr[ListOfString] = js.undefined
}
object SslPolicy {
  
  inline def apply(): SslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicy]
  }
  
  extension [Self <: SslPolicy](x: Self) {
    
    inline def setCiphers(value: Ciphers): Self = StObject.set(x, "Ciphers", value.asInstanceOf[js.Any])
    
    inline def setCiphersUndefined: Self = StObject.set(x, "Ciphers", js.undefined)
    
    inline def setCiphersVarargs(value: Cipher*): Self = StObject.set(x, "Ciphers", js.Array(value*))
    
    inline def setName(value: SslPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSslProtocols(value: SslProtocols): Self = StObject.set(x, "SslProtocols", value.asInstanceOf[js.Any])
    
    inline def setSslProtocolsUndefined: Self = StObject.set(x, "SslProtocols", js.undefined)
    
    inline def setSslProtocolsVarargs(value: SslProtocol*): Self = StObject.set(x, "SslProtocols", js.Array(value*))
    
    inline def setSupportedLoadBalancerTypes(value: ListOfString): Self = StObject.set(x, "SupportedLoadBalancerTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedLoadBalancerTypesUndefined: Self = StObject.set(x, "SupportedLoadBalancerTypes", js.undefined)
    
    inline def setSupportedLoadBalancerTypesVarargs(value: StringValue*): Self = StObject.set(x, "SupportedLoadBalancerTypes", js.Array(value*))
  }
}
