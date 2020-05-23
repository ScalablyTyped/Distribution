package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type `DECIMAL` .
  * @since OOo 1.1.2
  */
trait Decimal extends js.Object {
  /** corresponds to `DECIMAL.Hi32` . */
  var HighValue: Double
  /** corresponds to `DECIMAL.Lo32` . */
  var LowValue: Double
  /** corresponds to `DECIMAL.Mid32` . */
  var MiddleValue: Double
  /** corresponds to `DECIMAL.scale` . */
  var Scale: Double
  /** corresponds to `DECIMAL.sign` . */
  var Sign: Double
}

object Decimal {
  @scala.inline
  def apply(HighValue: Double, LowValue: Double, MiddleValue: Double, Scale: Double, Sign: Double): Decimal = {
    val __obj = js.Dynamic.literal(HighValue = HighValue.asInstanceOf[js.Any], LowValue = LowValue.asInstanceOf[js.Any], MiddleValue = MiddleValue.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
}

