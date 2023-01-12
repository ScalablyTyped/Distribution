package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryServiceAuthenticationRequest extends StObject {
  
  /**
    * The ID of the Active Directory to be used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.undefined
}
object DirectoryServiceAuthenticationRequest {
  
  inline def apply(): DirectoryServiceAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryServiceAuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectoryServiceAuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
