package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOptionsInput extends StObject {
  
  /**
    * True if Anonymous auth is enabled. Anonymous auth can be enabled only when AdvancedSecurity is enabled on existing domains.
    */
  var AnonymousAuthEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  var MasterUserOptions: js.UndefOr[typings.awsSdk.clientsEsMod.MasterUserOptions] = js.undefined
  
  /**
    * Specifies the SAML application configuration for the domain.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsInput] = js.undefined
}
object AdvancedSecurityOptionsInput {
  
  inline def apply(): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedSecurityOptionsInput] (val x: Self) extends AnyVal {
    
    inline def setAnonymousAuthEnabled(value: Boolean): Self = StObject.set(x, "AnonymousAuthEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnonymousAuthEnabledUndefined: Self = StObject.set(x, "AnonymousAuthEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "InternalUserDatabaseEnabled", js.undefined)
    
    inline def setMasterUserOptions(value: MasterUserOptions): Self = StObject.set(x, "MasterUserOptions", value.asInstanceOf[js.Any])
    
    inline def setMasterUserOptionsUndefined: Self = StObject.set(x, "MasterUserOptions", js.undefined)
    
    inline def setSAMLOptions(value: SAMLOptionsInput): Self = StObject.set(x, "SAMLOptions", value.asInstanceOf[js.Any])
    
    inline def setSAMLOptionsUndefined: Self = StObject.set(x, "SAMLOptions", js.undefined)
  }
}
