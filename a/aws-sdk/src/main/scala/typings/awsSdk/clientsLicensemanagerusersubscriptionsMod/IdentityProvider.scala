package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProvider extends StObject {
  
  /**
    * An object that details an Active Directory identity provider.
    */
  var ActiveDirectoryIdentityProvider: js.UndefOr[
    typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.ActiveDirectoryIdentityProvider
  ] = js.undefined
}
object IdentityProvider {
  
  inline def apply(): IdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProvider] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectoryIdentityProvider(value: ActiveDirectoryIdentityProvider): Self = StObject.set(x, "ActiveDirectoryIdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryIdentityProviderUndefined: Self = StObject.set(x, "ActiveDirectoryIdentityProvider", js.undefined)
  }
}
