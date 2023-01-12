package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerTlsPolicy extends StObject {
  
  /**
    * The ciphers used by the TLS security policy. The ciphers are listed in order of preference.
    */
  var ciphers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The description of the TLS security policy.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value that indicates whether the TLS security policy is the default.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the TLS security policy.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The protocols used in a given TLS security policy.
    */
  var protocols: js.UndefOr[StringList] = js.undefined
}
object LoadBalancerTlsPolicy {
  
  inline def apply(): LoadBalancerTlsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadBalancerTlsPolicy] (val x: Self) extends AnyVal {
    
    inline def setCiphers(value: StringList): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    inline def setCiphersVarargs(value: String*): Self = StObject.set(x, "ciphers", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocols(value: StringList): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}
