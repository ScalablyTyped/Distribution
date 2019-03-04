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
    asanaBaseUrl: js.Function0[java.lang.String],
    authorizeUrl: js.Function0[java.lang.String],
    finishAuthorization: js.Function1[java.lang.String, scala.Unit],
    getStateParam: js.Function0[java.lang.String],
    receiverUrl: js.Function0[java.lang.String],
    run: js.Function0[scala.Unit],
    startAuthorization: js.Function2[java.lang.String, java.lang.String, js.Any]
  ): BaseBrowserFlow = {
    val __obj = js.Dynamic.literal(asanaBaseUrl = asanaBaseUrl, authorizeUrl = authorizeUrl, finishAuthorization = finishAuthorization, getStateParam = getStateParam, receiverUrl = receiverUrl, run = run, startAuthorization = startAuthorization)
  
    __obj.asInstanceOf[BaseBrowserFlow]
  }
}

