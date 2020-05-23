package typings.ansiEscapes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationOptions extends js.Object {
  /**
  		Create a "hidden" annotation.
  		Annotations created this way can be shown using the "Show Annotations" iTerm command.
  		*/
  val isHidden: js.UndefOr[Boolean] = js.undefined
  /**
  		Nonzero number of columns to annotate.
  		Default: The remainder of the line.
  		*/
  val length: js.UndefOr[Double] = js.undefined
  /**
  		Starting X coordinate.
  		Must be used with `y` and `length`.
  		Default: The cursor position
  		*/
  val x: js.UndefOr[Double] = js.undefined
  /**
  		Starting Y coordinate.
  		Must be used with `x` and `length`.
  		Default: Cursor position.
  		*/
  val y: js.UndefOr[Double] = js.undefined
}

object AnnotationOptions {
  @scala.inline
  def apply(
    isHidden: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): AnnotationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOptions]
  }
}

