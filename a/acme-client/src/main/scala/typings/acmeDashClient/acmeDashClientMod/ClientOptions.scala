package typings.acmeDashClient.acmeDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var accountKey: PrivateKeyBuffer | PrivateKeyString
  var accountUrl: js.UndefOr[String] = js.undefined
  var backoffAttempts: js.UndefOr[Double] = js.undefined
  var backoffMax: js.UndefOr[Double] = js.undefined
  var backoffMin: js.UndefOr[Double] = js.undefined
  var directoryUrl: String
}

object ClientOptions {
  @scala.inline
  def apply(
    accountKey: PrivateKeyBuffer | PrivateKeyString,
    directoryUrl: String,
    accountUrl: String = null,
    backoffAttempts: Int | Double = null,
    backoffMax: Int | Double = null,
    backoffMin: Int | Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
    if (accountUrl != null) __obj.updateDynamic("accountUrl")(accountUrl.asInstanceOf[js.Any])
    if (backoffAttempts != null) __obj.updateDynamic("backoffAttempts")(backoffAttempts.asInstanceOf[js.Any])
    if (backoffMax != null) __obj.updateDynamic("backoffMax")(backoffMax.asInstanceOf[js.Any])
    if (backoffMin != null) __obj.updateDynamic("backoffMin")(backoffMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

