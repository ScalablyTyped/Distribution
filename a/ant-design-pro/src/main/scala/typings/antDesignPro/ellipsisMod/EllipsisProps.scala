package typings.antDesignPro.ellipsisMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsisProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fullWidthRecognition: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[Boolean | EllipsisTooltipProps] = js.undefined
}

object EllipsisProps {
  @scala.inline
  def apply(
    className: String = null,
    fullWidthRecognition: js.UndefOr[Boolean] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    tooltip: Boolean | EllipsisTooltipProps = null
  ): EllipsisProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidthRecognition)) __obj.updateDynamic("fullWidthRecognition")(fullWidthRecognition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisProps]
  }
}

