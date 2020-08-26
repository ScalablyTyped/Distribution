package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type `DECIMAL` .
  * @since OOo 1.1.2
  */
@js.native
trait Decimal extends js.Object {
  /** corresponds to `DECIMAL.Hi32` . */
  var HighValue: Double = js.native
  /** corresponds to `DECIMAL.Lo32` . */
  var LowValue: Double = js.native
  /** corresponds to `DECIMAL.Mid32` . */
  var MiddleValue: Double = js.native
  /** corresponds to `DECIMAL.scale` . */
  var Scale: Double = js.native
  /** corresponds to `DECIMAL.sign` . */
  var Sign: Double = js.native
}

object Decimal {
  @scala.inline
  def apply(HighValue: Double, LowValue: Double, MiddleValue: Double, Scale: Double, Sign: Double): Decimal = {
    val __obj = js.Dynamic.literal(HighValue = HighValue.asInstanceOf[js.Any], LowValue = LowValue.asInstanceOf[js.Any], MiddleValue = MiddleValue.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighValue(value: Double): Self = this.set("HighValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowValue(value: Double): Self = this.set("LowValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddleValue(value: Double): Self = this.set("MiddleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("Scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: Double): Self = this.set("Sign", value.asInstanceOf[js.Any])
  }
  
}

