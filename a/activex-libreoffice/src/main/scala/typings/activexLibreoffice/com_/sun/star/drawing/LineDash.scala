package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link LineDash} defines a non-continuous line. */
trait LineDash extends js.Object {
  /** This is the length of a single dash. */
  var DashLen: Double
  /** This is the number of dashes. */
  var Dashes: Double
  /** This is the distance between the dots. */
  var Distance: Double
  /** This is the length of a dot. */
  var DotLen: Double
  /** This is the number of dots in this {@link LineDash} . */
  var Dots: Double
  /** This sets the style of this {@link LineDash} . */
  var Style: DashStyle
}

object LineDash {
  @scala.inline
  def apply(DashLen: Double, Dashes: Double, Distance: Double, DotLen: Double, Dots: Double, Style: DashStyle): LineDash = {
    val __obj = js.Dynamic.literal(DashLen = DashLen.asInstanceOf[js.Any], Dashes = Dashes.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], DotLen = DotLen.asInstanceOf[js.Any], Dots = Dots.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDash]
  }
}

