package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOptionsInput extends StObject {
  
  /**
    * True to enable a 30-day migration period during which administrators can create role mappings. Only necessary when enabling fine-grained access control on an existing domain.
    */
  var AnonymousAuthEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True to enable fine-grained access control.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True to enable the internal user database.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Container for information about the master user.
    */
  var MasterUserOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MasterUserOptions] = js.undefined
  
  /**
    * Container for information about the SAML configuration for OpenSearch Dashboards.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsInput] = js.undefined
}
object AdvancedSecurityOptionsInput {
  
  inline def apply(): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
  
  extension [Self <: AdvancedSecurityOptionsInput](x: Self) {
    
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
