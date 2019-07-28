package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accountKey: js.UndefOr[AccountKey] = js.undefined
  var accountUrl: js.UndefOr[String | Null] = js.undefined
  var backoffAttempts: js.UndefOr[Double] = js.undefined
  var backoffMax: js.UndefOr[Double] = js.undefined
  var backoffMin: js.UndefOr[Double] = js.undefined
  var directoryUrl: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accountKey: AccountKey = null,
    accountUrl: String = null,
    backoffAttempts: Int | Double = null,
    backoffMax: Int | Double = null,
    backoffMin: Int | Double = null,
    directoryUrl: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accountKey != null) __obj.updateDynamic("accountKey")(accountKey)
    if (accountUrl != null) __obj.updateDynamic("accountUrl")(accountUrl)
    if (backoffAttempts != null) __obj.updateDynamic("backoffAttempts")(backoffAttempts.asInstanceOf[js.Any])
    if (backoffMax != null) __obj.updateDynamic("backoffMax")(backoffMax.asInstanceOf[js.Any])
    if (backoffMin != null) __obj.updateDynamic("backoffMin")(backoffMin.asInstanceOf[js.Any])
    if (directoryUrl != null) __obj.updateDynamic("directoryUrl")(directoryUrl)
    __obj.asInstanceOf[Options]
  }
}

