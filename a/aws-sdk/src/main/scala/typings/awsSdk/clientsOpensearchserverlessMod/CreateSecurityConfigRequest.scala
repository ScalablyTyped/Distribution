package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityConfigRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier to ensure idempotency of the request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description of the security configuration.
    */
  var description: js.UndefOr[ConfigDescription] = js.undefined
  
  /**
    * The name of the security configuration.
    */
  var name: ConfigName
  
  /**
    * Describes SAML options in in the form of a key-value map. This field is required if you specify saml for the type parameter.
    */
  var samlOptions: js.UndefOr[SamlConfigOptions] = js.undefined
  
  /**
    * The type of security configuration.
    */
  var `type`: SecurityConfigType
}
object CreateSecurityConfigRequest {
  
  inline def apply(name: ConfigName, `type`: SecurityConfigType): CreateSecurityConfigRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSecurityConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: ConfigDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ConfigName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSamlOptions(value: SamlConfigOptions): Self = StObject.set(x, "samlOptions", value.asInstanceOf[js.Any])
    
    inline def setSamlOptionsUndefined: Self = StObject.set(x, "samlOptions", js.undefined)
    
    inline def setType(value: SecurityConfigType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
