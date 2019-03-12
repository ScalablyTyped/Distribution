package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseBrowserFlow extends Flow {
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def asanaBaseUrl(): java.lang.String
  /**
    * @return {Promise<Object>} Credentials returned from Oauth.
    * @param state
    */
  def finishAuthorization(state: java.lang.String): scala.Unit
  /**
    * @returns {String} Generate a new unique state parameter for a request.
    * @return
    */
  def getStateParam(): java.lang.String
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def receiverUrl(): java.lang.String
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
  def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any
}

object BaseBrowserFlow {
  @scala.inline
  def apply(
    asanaBaseUrl: () => java.lang.String,
    authorizeUrl: () => java.lang.String,
    finishAuthorization: java.lang.String => scala.Unit,
    getStateParam: () => java.lang.String,
    receiverUrl: () => java.lang.String,
    run: () => scala.Unit,
    startAuthorization: (java.lang.String, java.lang.String) => js.Any
  ): BaseBrowserFlow = {
    val __obj = js.Dynamic.literal(asanaBaseUrl = js.Any.fromFunction0(asanaBaseUrl), authorizeUrl = js.Any.fromFunction0(authorizeUrl), finishAuthorization = js.Any.fromFunction1(finishAuthorization), getStateParam = js.Any.fromFunction0(getStateParam), receiverUrl = js.Any.fromFunction0(receiverUrl), run = js.Any.fromFunction0(run), startAuthorization = js.Any.fromFunction2(startAuthorization))
  
    __obj.asInstanceOf[BaseBrowserFlow]
  }
}

