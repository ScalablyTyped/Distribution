package typings.acmeClient.mod

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
    backoffAttempts: js.UndefOr[Double] = js.undefined,
    backoffMax: js.UndefOr[Double] = js.undefined,
    backoffMin: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
    if (accountUrl != null) __obj.updateDynamic("accountUrl")(accountUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffAttempts)) __obj.updateDynamic("backoffAttempts")(backoffAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffMax)) __obj.updateDynamic("backoffMax")(backoffMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backoffMin)) __obj.updateDynamic("backoffMin")(backoffMin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

