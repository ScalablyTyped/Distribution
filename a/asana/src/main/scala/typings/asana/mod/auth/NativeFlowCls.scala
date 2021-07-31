package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.NativeFlow")
@js.native
class NativeFlowCls protected ()
  extends StObject
     with NativeFlow {
  /**
    * An Oauth flow that can be run from the console or an app that does
    * not have the ability to open and manage a browser on its own.
    * @param {Object} options
    * @option {App} app App to authenticate for
    * @option {String function(String)} [instructions] Function returning the
    *     instructions to output to the user. Passed the authorize url.
    * @option {String function()} [prompt] String to output immediately before
    *     waiting for a line from stdin.
    * @constructor
    */
  def this(options: js.Any) = this()
  
  /**
    * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
    * @return {Promise<Object>} The token, which will include the `access_token`
    *     used for API access, as well as a `refresh_token` which can be stored
    *     to get a new access token without going through the flow again.
    * @param code
    */
  /* CompleteClass */
  override def accessToken(code: String): Unit = js.native
  
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  /* CompleteClass */
  override def authorizeUrl(): String = js.native
  
  /**
    * @return {Promise} The access token, which will include a refresh token
    *     that can be stored in the future to create a client without going
    *     through the Oauth flow.
    * @param url
    * @return
    */
  /* CompleteClass */
  override def promptForCode(url: String): js.Any = js.native
  
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  /* CompleteClass */
  override def run(): Unit = js.native
}
