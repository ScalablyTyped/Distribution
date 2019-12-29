package typings.antDashDesignDashPro.libEllipsisMod

import typings.react.reactMod.CSSProperties
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
    length: Int | Double = null,
    lines: Int | Double = null,
    style: CSSProperties = null,
    tooltip: Boolean | EllipsisTooltipProps = null
  ): EllipsisProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidthRecognition)) __obj.updateDynamic("fullWidthRecognition")(fullWidthRecognition.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisProps]
  }
}

