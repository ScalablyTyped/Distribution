package typings.activexWia.WIA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
  * using "WIA.Rational" in a call to CreateObject.
  */
trait Rational extends js.Object {
  /** Returns/Sets the Rational Value Denominator */
  var Denominator: Double
  /** Returns/Sets the Rational Value Numerator */
  var Numerator: Double
  /** Returns the Rational Value as a Double */
  val Value: Double
  @JSName("WIA.Rational_typekey")
  var WIADotRational_typekey: Rational
}

object Rational {
  @scala.inline
  def apply(Denominator: Double, Numerator: Double, Value: Double, WIADotRational_typekey: Rational): Rational = {
    val __obj = js.Dynamic.literal(Denominator = Denominator.asInstanceOf[js.Any], Numerator = Numerator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Rational_typekey")(WIADotRational_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rational]
  }
}

