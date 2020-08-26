package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is used to specify the height of a text line.
  * @see LineSpacingMode
  */
@js.native
trait LineSpacing extends js.Object {
  /** This value specifies the height in regard to **Mode** . */
  var Height: Double = js.native
  /** This value specifies the way the height is specified. */
  var Mode: Double = js.native
}

object LineSpacing {
  @scala.inline
  def apply(Height: Double, Mode: Double): LineSpacing = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSpacing]
  }
  @scala.inline
  implicit class LineSpacingOps[Self <: LineSpacing] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Double): Self = this.set("Mode", value.asInstanceOf[js.Any])
  }
  
}

