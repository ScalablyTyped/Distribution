package typings.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSettings extends js.Object {
  var decimal: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
    // default precision on numbers is 0
  var thousand: js.UndefOr[String] = js.undefined
}

object NumberSettings {
  @scala.inline
  def apply(decimal: String = null, precision: Int | Double = null, thousand: String = null): NumberSettings = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSettings]
  }
}

