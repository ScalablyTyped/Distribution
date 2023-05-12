package typings.asana.mod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "auth.RedirectFlow")
@js.native
open class RedirectFlowCls protected ()
  extends StObject
     with BaseBrowserFlow {
  /**
    * An Oauth flow that runs in the browser and requests user authorization by
    * redirecting to an authorization page on Asana, and redirecting back with
    * the credentials.
    * @param {Object} options See `BaseBrowserFlow` for options.
    */
  def this(options: Any) = this()
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  /* CompleteClass */
  override def asanaBaseUrl(): String = js.native
  
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  /* CompleteClass */
  override def authorizeUrl(): String = js.native
  
  /**
    * @return {Promise<Object>} Credentials returned from Oauth.
    * @param state
    */
  /* CompleteClass */
  override def finishAuthorization(state: String): Unit = js.native
  
  /**
    * @returns {String} Generate a new unique state parameter for a request.
    * @return
    */
  /* CompleteClass */
  override def getStateParam(): String = js.native
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  /* CompleteClass */
  override def receiverUrl(): String = js.native
  
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  /* CompleteClass */
  override def run(): Unit = js.native
  
  /**
    * @param {String} authUrl The URL the user should be navigated to in order
    *     to authorize the app.
    * @param {String} state   The unique state generated for this auth request.
    * @return {Promise} Resolved when authorization has successfully started,
    *     i.e. the user has been navigated to a page requesting authorization.
    * @param authUrl
    * @param state
    * @return
    */
  /* CompleteClass */
  override def startAuthorization(authUrl: String, state: String): Any = js.native
}
