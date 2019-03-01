package typings
package actionsDashOnDashGoogleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrencyCode extends js.Object {
  /** Currency code of price. */
  var currencyCode: java.lang.String
  /** Partial unit count of price. */
  var nanos: js.UndefOr[scala.Double] = js.undefined
  /** Unit count of price. */
  var units: scala.Double
}

object Anon_CurrencyCode {
  @scala.inline
  def apply(currencyCode: java.lang.String, units: scala.Double, nanos: scala.Int | scala.Double = null): Anon_CurrencyCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currencyCode")(currencyCode)
    __obj.updateDynamic("units")(units)
    if (nanos != null) __obj.updateDynamic("nanos")(nanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrencyCode]
  }
}

