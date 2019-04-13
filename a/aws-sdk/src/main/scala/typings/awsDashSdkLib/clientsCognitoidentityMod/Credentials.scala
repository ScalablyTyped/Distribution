package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[DateType] = js.undefined
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.undefined
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: AccessKeyString = null,
    Expiration: DateType = null,
    SecretKey: SecretKeyString = null,
    SessionToken: SessionTokenString = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (SecretKey != null) __obj.updateDynamic("SecretKey")(SecretKey)
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken)
    __obj.asInstanceOf[Credentials]
  }
}

