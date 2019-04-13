package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * An access token generated for a federated user to access Amazon Connect
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.undefined
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect
    */
  var AccessTokenExpiration: js.UndefOr[timestamp] = js.undefined
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.undefined
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined
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
    if (AccessToken != null) __obj.updateDynamic("AccessToken")(AccessToken)
    if (AccessTokenExpiration != null) __obj.updateDynamic("AccessTokenExpiration")(AccessTokenExpiration)
    if (RefreshToken != null) __obj.updateDynamic("RefreshToken")(RefreshToken)
    if (RefreshTokenExpiration != null) __obj.updateDynamic("RefreshTokenExpiration")(RefreshTokenExpiration)
    __obj.asInstanceOf[Credentials]
  }
}

