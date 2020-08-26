package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link LineDash} defines a non-continuous line. */
@js.native
trait LineDash extends js.Object {
  /** This is the length of a single dash. */
  var DashLen: Double = js.native
  /** This is the number of dashes. */
  var Dashes: Double = js.native
  /** This is the distance between the dots. */
  var Distance: Double = js.native
  /** This is the length of a dot. */
  var DotLen: Double = js.native
  /** This is the number of dots in this {@link LineDash} . */
  var Dots: Double = js.native
  /** This sets the style of this {@link LineDash} . */
  var Style: DashStyle = js.native
}

object LineDash {
  @scala.inline
  def apply(DashLen: Double, Dashes: Double, Distance: Double, DotLen: Double, Dots: Double, Style: DashStyle): LineDash = {
    val __obj = js.Dynamic.literal(DashLen = DashLen.asInstanceOf[js.Any], Dashes = Dashes.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], DotLen = DotLen.asInstanceOf[js.Any], Dots = Dots.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDash]
  }
  @scala.inline
  implicit class LineDashOps[Self <: LineDash] (val x: Self) extends AnyVal {
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
    def setDashLen(value: Double): Self = this.set("DashLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashes(value: Double): Self = this.set("Dashes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("Distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotLen(value: Double): Self = this.set("DotLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: Double): Self = this.set("Dots", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: DashStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
  }
  
}

