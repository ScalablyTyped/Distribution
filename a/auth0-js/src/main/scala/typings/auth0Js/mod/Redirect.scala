package typings.auth0Js.mod

import typings.auth0Js.anon.ResponseMode
import typings.auth0Js.anon.emailstringpasswordstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-js", "Redirect")
@js.native
open class Redirect protected () extends StObject {
  def this(client: Any, options: Any) = this()
  
  /**
    * Performs authentication with username/email and password with a database connection
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link login}.
    */
  def loginWithCredentials(options: ResponseMode, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Signs up a new user and automatically logs the user in after the signup.
    */
  def signupAndLogin(options: emailstringpasswordstring, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
}
