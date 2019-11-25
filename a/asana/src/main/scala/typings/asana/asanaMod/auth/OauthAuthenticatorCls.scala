package typings.asana.asanaMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "auth.OauthAuthenticator")
@js.native
class OauthAuthenticatorCls protected () extends OauthAuthenticator {
  /**
    * Creates an authenticator that uses Oauth for authentication.
    *
    * @param {Object} options Configure the authenticator; must specify one
    *     of `flow` or `credentials`.
    * @option {App}           app           The app being authenticated for.
    * @option {OauthFlow}     [flow]        The flow to use to get credentials
    *     when needed.
    * @option {String|Object} [credentials] Initial credentials to use. This can
    *     be either the object returned from an access token request (which
    *     contains the token and some other metadata) or just the `access_token`
    *     field.
    * @constructor
    */
  def this(options: OauthAuthenticatorOptions) = this()
  /**
    * @param {Object} request The request to modify, for the `request` library.
    * @return {Object} The `request` parameter, modified to include authentication
    *     information using the stored credentials.
    * @param request
    * @return
    */
  /* CompleteClass */
  override def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest = js.native
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  /* CompleteClass */
  override def establishCredentials(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  /* CompleteClass */
  override def refreshCredentials(): typings.bluebird.bluebirdMod.^[Boolean] = js.native
}

