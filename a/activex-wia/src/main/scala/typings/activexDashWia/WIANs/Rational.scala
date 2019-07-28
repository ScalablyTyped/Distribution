package typings.activexDashWia.WIANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created
  * using "WIA.Rational" in a call to CreateObject.
  */
@JSGlobal("WIA.Rational")
@js.native
class Rational protected () extends js.Object {
  /** Returns/Sets the Rational Value Denominator */
  var Denominator: Double = js.native
  /** Returns/Sets the Rational Value Numerator */
  var Numerator: Double = js.native
  /** Returns the Rational Value as a Double */
  val Value: Double = js.native
  var `WIA.Rational_typekey`: Rational = js.native
}

