package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * An access token generated for a federated user to access Amazon Connect.
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.native
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect.
    */
  var AccessTokenExpiration: js.UndefOr[timestamp] = js.native
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.native
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[timestamp] = js.native
}

object Credentials {
  @scala.inline
  def apply(
    AccessToken: SecurityToken = null,
    AccessTokenExpiration: timestamp = null,
    RefreshToken: SecurityToken = null,
    RefreshTokenExpiration: timestamp = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken.asInstanceOf[js.Any])
    if (AccessTokenExpiration != null) __obj.updateDynamic("AccessTokenExpiration")(AccessTokenExpiration.asInstanceOf[js.Any])
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken.asInstanceOf[js.Any])
    if (RefreshTokenExpiration != null) __obj.updateDynamic("RefreshTokenExpiration")(RefreshTokenExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

