package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs.oleautomationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type `DECIMAL` .
  * @since OOo 1.1.2
  */
trait Decimal extends js.Object {
  /** corresponds to `DECIMAL.Hi32` . */
  var HighValue: scala.Double
  /** corresponds to `DECIMAL.Lo32` . */
  var LowValue: scala.Double
  /** corresponds to `DECIMAL.Mid32` . */
  var MiddleValue: scala.Double
  /** corresponds to `DECIMAL.scale` . */
  var Scale: scala.Double
  /** corresponds to `DECIMAL.sign` . */
  var Sign: scala.Double
}

object Decimal {
  @scala.inline
  def apply(
    HighValue: scala.Double,
    LowValue: scala.Double,
    MiddleValue: scala.Double,
    Scale: scala.Double,
    Sign: scala.Double
  ): Decimal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HighValue")(HighValue)
    __obj.updateDynamic("LowValue")(LowValue)
    __obj.updateDynamic("MiddleValue")(MiddleValue)
    __obj.updateDynamic("Scale")(Scale)
    __obj.updateDynamic("Sign")(Sign)
    __obj.asInstanceOf[Decimal]
  }
}

