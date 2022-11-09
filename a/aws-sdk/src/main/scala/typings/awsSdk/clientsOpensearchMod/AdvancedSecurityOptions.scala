package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOptions extends StObject {
  
  /**
    * Date and time when the migration period will be disabled. Only necessary when enabling fine-grained access control on an existing domain.
    */
  var AnonymousAuthDisableDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * True if a 30-day migration period is enabled, during which administrators can create role mappings. Only necessary when enabling fine-grained access control on an existing domain.
    */
  var AnonymousAuthEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if fine-grained access control is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Container for information about the SAML configuration for OpenSearch Dashboards.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsOutput] = js.undefined
}
object AdvancedSecurityOptions {
  
  inline def apply(): AdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptions]
  }
  
  extension [Self <: AdvancedSecurityOptions](x: Self) {
    
    inline def setAnonymousAuthDisableDate(value: js.Date): Self = StObject.set(x, "AnonymousAuthDisableDate", value.asInstanceOf[js.Any])
    
    inline def setAnonymousAuthDisableDateUndefined: Self = StObject.set(x, "AnonymousAuthDisableDate", js.undefined)
    
    inline def setAnonymousAuthEnabled(value: Boolean): Self = StObject.set(x, "AnonymousAuthEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnonymousAuthEnabledUndefined: Self = StObject.set(x, "AnonymousAuthEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "InternalUserDatabaseEnabled", js.undefined)
    
    inline def setSAMLOptions(value: SAMLOptionsOutput): Self = StObject.set(x, "SAMLOptions", value.asInstanceOf[js.Any])
    
    inline def setSAMLOptionsUndefined: Self = StObject.set(x, "SAMLOptions", js.undefined)
  }
}
