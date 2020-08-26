package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
  * using "WIA.Rational" in a call to CreateObject.
  */
@js.native
trait Rational extends js.Object {
  /** Returns/Sets the Rational Value Denominator */
  var Denominator: Double = js.native
  /** Returns/Sets the Rational Value Numerator */
  var Numerator: Double = js.native
  /** Returns the Rational Value as a Double */
  val Value: Double = js.native
  @JSName("WIA.Rational_typekey")
  var WIADotRational_typekey: Rational = js.native
}

object Rational {
  @scala.inline
  def apply(Denominator: Double, Numerator: Double, Value: Double, WIADotRational_typekey: Rational): Rational = {
    val __obj = js.Dynamic.literal(Denominator = Denominator.asInstanceOf[js.Any], Numerator = Numerator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Rational_typekey")(WIADotRational_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rational]
  }
  @scala.inline
  implicit class RationalOps[Self <: Rational] (val x: Self) extends AnyVal {
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
    def setDenominator(value: Double): Self = this.set("Denominator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumerator(value: Double): Self = this.set("Numerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWIADotRational_typekey(value: Rational): Self = this.set("WIA.Rational_typekey", value.asInstanceOf[js.Any])
  }
  
}

