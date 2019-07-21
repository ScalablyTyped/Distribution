package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accountKey: js.UndefOr[AccountKey] = js.undefined
  var accountUrl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var backoffAttempts: js.UndefOr[scala.Double] = js.undefined
  var backoffMax: js.UndefOr[scala.Double] = js.undefined
  var backoffMin: js.UndefOr[scala.Double] = js.undefined
  var directoryUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accountKey: AccountKey = null,
    accountUrl: java.lang.String = null,
    backoffAttempts: scala.Int | scala.Double = null,
    backoffMax: scala.Int | scala.Double = null,
    backoffMin: scala.Int | scala.Double = null,
    directoryUrl: java.lang.String = null
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

