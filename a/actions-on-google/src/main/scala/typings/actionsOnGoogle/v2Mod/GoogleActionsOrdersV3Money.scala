package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3Money extends js.Object {
  /**
    * Amount in micros.
    * For example, this field should be set as 1990000 for $1.99.
    */
  var amountInMicros: js.UndefOr[String] = js.undefined
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3Money {
  @scala.inline
  def apply(amountInMicros: String = null, currencyCode: String = null): GoogleActionsOrdersV3Money = {
    val __obj = js.Dynamic.literal()
    if (amountInMicros != null) __obj.updateDynamic("amountInMicros")(amountInMicros.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3Money]
  }
}

