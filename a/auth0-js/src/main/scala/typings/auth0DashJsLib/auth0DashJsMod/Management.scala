package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "Management")
@js.native
class Management protected () extends js.Object {
  /**
    * Initialize your client class, by using a Non Interactive Client to fetch an access_token via the Client Credentials Grant.
    */
  def this(options: ManagementOptions) = this()
  /**
    * Returns the user profile. https://auth0.com/docs/api/management/v2#!/Users/get_users_by_id
    *
    */
  def getUser(userId: java.lang.String, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): scala.Unit = js.native
  /**
    * Link two users. https://auth0.com/docs/api/management/v2#!/Users/post_identities
    *
    */
  def linkUser(
    userId: java.lang.String,
    secondaryUserToken: java.lang.String,
    callback: Auth0Callback[_, Auth0Error]
  ): scala.Unit = js.native
  /**
    * Updates the user metdata. It will patch the user metdata with the attributes sent.
    * https://auth0.com/docs/api/management/v2#!/Users/patch_users_by_id
    *
    */
  def patchUserMetadata(
    userId: java.lang.String,
    userMetadata: js.Any,
    callback: Auth0Callback[Auth0UserProfile, Auth0Error]
  ): scala.Unit = js.native
}

