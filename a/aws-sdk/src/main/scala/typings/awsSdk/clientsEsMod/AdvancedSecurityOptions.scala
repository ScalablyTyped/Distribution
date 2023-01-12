package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedSecurityOptions extends StObject {
  
  /**
    * Specifies the Anonymous Auth Disable Date when Anonymous Auth is enabled.
    */
  var AnonymousAuthDisableDate: js.UndefOr[js.Date] = js.undefined
  
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
    * Describes the SAML application configured for a domain.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsOutput] = js.undefined
}
object AdvancedSecurityOptions {
  
  inline def apply(): AdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedSecurityOptions] (val x: Self) extends AnyVal {
    
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
