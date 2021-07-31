package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-js", "Management")
@js.native
class Management protected () extends StObject {
  /**
    * Initialize your client class, by using a Non Interactive Client to fetch an access_token via the Client Credentials Grant.
    */
  def this(options: ManagementOptions) = this()
  
  /**
    * Returns the user profile. https://auth0.com/docs/api/management/v2#!/Users/get_users_by_id
    *
    */
  def getUser(userId: String, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): Unit = js.native
  
  /**
    * Link two users. https://auth0.com/docs/api/management/v2#!/Users/post_identities
    *
    */
  def linkUser(userId: String, secondaryUserToken: String, callback: Auth0Callback[js.Any, Auth0Error]): Unit = js.native
  
  /**
    * Updates the user attributes.
    * It will patch the root attributes that the server allows it.
    * {@link https://auth0.com/docs/api/management/v2#!/Users/patch_users_by_id}
    */
  def patchUserAttributes(userId: String, user: Auth0UserProfile, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): Unit = js.native
  
  /**
    * Updates the user metadata. It will patch the user metadata with the attributes sent.
    * https://auth0.com/docs/api/management/v2#!/Users/patch_users_by_id
    *
    */
  def patchUserMetadata(userId: String, userMetadata: js.Any, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): Unit = js.native
}
