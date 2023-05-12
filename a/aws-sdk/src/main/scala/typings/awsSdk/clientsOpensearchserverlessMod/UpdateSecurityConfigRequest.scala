package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The version of the security configuration to be updated. You can find the most recent version of a security configuration using the GetSecurityPolicy command.
    */
  var configVersion: PolicyVersion
  
  /**
    * A description of the security configuration.
    */
  var description: js.UndefOr[ConfigDescription] = js.undefined
  
  /**
    * The security configuration identifier. For SAML the ID will be saml/&lt;accountId&gt;/&lt;idpProviderName&gt;. For example, saml/123456789123/OKTADev.
    */
  var id: SecurityConfigId
  
  /**
    * SAML options in in the form of a key-value map.
    */
  var samlOptions: js.UndefOr[SamlConfigOptions] = js.undefined
}
object UpdateSecurityConfigRequest {
  
  inline def apply(configVersion: PolicyVersion, id: SecurityConfigId): UpdateSecurityConfigRequest = {
    val __obj = js.Dynamic.literal(configVersion = configVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSecurityConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setConfigVersion(value: PolicyVersion): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConfigDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: SecurityConfigId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSamlOptions(value: SamlConfigOptions): Self = StObject.set(x, "samlOptions", value.asInstanceOf[js.Any])
    
    inline def setSamlOptionsUndefined: Self = StObject.set(x, "samlOptions", js.undefined)
  }
}
