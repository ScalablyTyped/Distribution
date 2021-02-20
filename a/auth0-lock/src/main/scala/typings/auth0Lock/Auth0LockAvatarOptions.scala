package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockAvatarOptions extends StObject {
  
  def displayName(email: String, callback: Auth0LockAvatarDisplayNameCallback): Unit = js.native
  
  def url(email: String, callback: Auth0LockAvatarUrlCallback): Unit = js.native
}
object Auth0LockAvatarOptions {
  
  @scala.inline
  def apply(
    displayName: (String, Auth0LockAvatarDisplayNameCallback) => Unit,
    url: (String, Auth0LockAvatarUrlCallback) => Unit
  ): Auth0LockAvatarOptions = {
    val __obj = js.Dynamic.literal(displayName = js.Any.fromFunction2(displayName), url = js.Any.fromFunction2(url))
    __obj.asInstanceOf[Auth0LockAvatarOptions]
  }
  
  @scala.inline
  implicit class Auth0LockAvatarOptionsMutableBuilder[Self <: Auth0LockAvatarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: (String, Auth0LockAvatarDisplayNameCallback) => Unit): Self = StObject.set(x, "displayName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUrl(value: (String, Auth0LockAvatarUrlCallback) => Unit): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
  }
}
