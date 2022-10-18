package typings.auth0Js.mod

import typings.auth0Js.anon.Audience
import typings.auth0Js.anon.Connection
import typings.auth0Js.anon.Email
import typings.auth0Js.anon.Hash
import typings.auth0Js.anon.RedirectUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-js", "Popup")
@js.native
open class Popup protected () extends StObject {
  def this(client: Any, options: Any) = this()
  
  /**
    * Shows inside a new window the hosted login page (`/authorize`) in order to start a new authN/authZ transaction and post its result using `postMessage`.
    * @see {@link https://auth0.com/docs/api/authentication#authorize-client}
    */
  def authorize(options: Audience, callback: Auth0Callback[Auth0Result, Auth0Error]): Unit = js.native
  
  /**
    * Returns a new instance of the popup handler
    */
  /* private */ def buildPopupHandler(): Any = js.native
  
  /**
    * Handles the popup logic for the callback page.
    * @see {@link parseHash}
    */
  def callback(options: Hash): Unit = js.native
  
  /**
    * Performs authentication with username/email and password with a database connection inside a new window
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link login}.
    */
  def loginWithCredentials(options: RedirectUri, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Verifies the passwordless TOTP and returns the requested token
    */
  def passwordlessVerify(options: Connection, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Initializes the popup window and returns the instance to be used later in order to avoid being blocked by the browser.
    *
    * @param options: receives the window height and width and any other window feature to be sent to window.open
    */
  def preload(options: Any): Any = js.native
  
  /**
    * Signs up a new user and automatically logs the user in after the signup.
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link signupAndAuthorize}.
    */
  def signupAndLogin(options: Email, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
}
