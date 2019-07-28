package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrencyCode extends js.Object {
  /** Currency code of price. */
  var currencyCode: String
  /** Partial unit count of price. */
  var nanos: js.UndefOr[Double] = js.undefined
  /** Unit count of price. */
  var units: Double
}

object Anon_CurrencyCode {
  @scala.inline
  def apply(currencyCode: String, units: Double, nanos: Int | Double = null): Anon_CurrencyCode = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode, units = units)
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrencyCode]
  }
}

