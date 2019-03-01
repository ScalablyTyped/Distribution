package typings
package accountingLib.accountingMod.accountingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSettings extends js.Object {
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
    // default precision on numbers is 0
  var thousand: js.UndefOr[java.lang.String] = js.undefined
}

object NumberSettings {
  @scala.inline
  def apply(
    decimal: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    thousand: java.lang.String = null
  ): NumberSettings = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand)
    __obj.asInstanceOf[NumberSettings]
  }
}

