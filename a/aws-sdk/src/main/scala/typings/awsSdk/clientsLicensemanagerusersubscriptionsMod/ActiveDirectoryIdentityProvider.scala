package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDirectoryIdentityProvider extends StObject {
  
  /**
    * The directory ID for an Active Directory identity provider.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
}
object ActiveDirectoryIdentityProvider {
  
  inline def apply(): ActiveDirectoryIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryIdentityProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveDirectoryIdentityProvider] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
