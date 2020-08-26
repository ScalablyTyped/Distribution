package typings.ansiEscapes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationOptions extends js.Object {
  /**
  		Create a "hidden" annotation.
  		Annotations created this way can be shown using the "Show Annotations" iTerm command.
  		*/
  val isHidden: js.UndefOr[Boolean] = js.native
  /**
  		Nonzero number of columns to annotate.
  		Default: The remainder of the line.
  		*/
  val length: js.UndefOr[Double] = js.native
  /**
  		Starting X coordinate.
  		Must be used with `y` and `length`.
  		Default: The cursor position
  		*/
  val x: js.UndefOr[Double] = js.native
  /**
  		Starting Y coordinate.
  		Must be used with `x` and `length`.
  		Default: Cursor position.
  		*/
  val y: js.UndefOr[Double] = js.native
}

object AnnotationOptions {
  @scala.inline
  def apply(): AnnotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationOptions]
  }
  @scala.inline
  implicit class AnnotationOptionsOps[Self <: AnnotationOptions] (val x: Self) extends AnyVal {
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
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

