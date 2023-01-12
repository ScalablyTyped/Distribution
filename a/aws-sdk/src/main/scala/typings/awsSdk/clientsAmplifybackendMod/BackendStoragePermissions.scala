package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendStoragePermissions extends StObject {
  
  /**
    * Lists all authenticated user read, write, and delete permissions for your S3 bucket.
    */
  var Authenticated: ListOfAuthenticatedElement
  
  /**
    * Lists all unauthenticated user read, write, and delete permissions for your S3 bucket.
    */
  var UnAuthenticated: js.UndefOr[ListOfUnAuthenticatedElement] = js.undefined
}
object BackendStoragePermissions {
  
  inline def apply(Authenticated: ListOfAuthenticatedElement): BackendStoragePermissions = {
    val __obj = js.Dynamic.literal(Authenticated = Authenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendStoragePermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendStoragePermissions] (val x: Self) extends AnyVal {
    
    inline def setAuthenticated(value: ListOfAuthenticatedElement): Self = StObject.set(x, "Authenticated", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatedVarargs(value: AuthenticatedElement*): Self = StObject.set(x, "Authenticated", js.Array(value*))
    
    inline def setUnAuthenticated(value: ListOfUnAuthenticatedElement): Self = StObject.set(x, "UnAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setUnAuthenticatedUndefined: Self = StObject.set(x, "UnAuthenticated", js.undefined)
    
    inline def setUnAuthenticatedVarargs(value: UnAuthenticatedElement*): Self = StObject.set(x, "UnAuthenticated", js.Array(value*))
  }
}
