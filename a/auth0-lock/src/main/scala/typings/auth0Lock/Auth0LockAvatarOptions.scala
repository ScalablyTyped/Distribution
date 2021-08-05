package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAvatarOptions extends StObject {
  
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit
  
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit
}
object Auth0LockAvatarOptions {
  
  inline def apply(
    displayName: (String, Auth0LockAvatarDisplayNameCallback) => Unit,
    url: (String, Auth0LockAvatarUrlCallback) => Unit
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal(displayName = js.Any.fromFunction2(displayName), url = js.Any.fromFunction2(url))
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
  
  extension [Self <: Auth0LockAvatarOptions](x: Self) {
    
    inline def setDisplayName(value: (String, Auth0LockAvatarDisplayNameCallback) => Unit): Self = StObject.set(x, "displayName", js.Any.fromFunction2(value))
    
    inline def setUrl(value: (String, Auth0LockAvatarUrlCallback) => Unit): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
  }
}
