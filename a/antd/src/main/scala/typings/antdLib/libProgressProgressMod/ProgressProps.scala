package typings
package antdLib.libProgressProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[
    js.Function2[
      /* percent */ js.UndefOr[scala.Double], 
      /* successPercent */ js.UndefOr[scala.Double], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var gapDegree: js.UndefOr[scala.Double] = js.undefined
  var gapPosition: js.UndefOr[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right
  ] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showInfo: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[ProgressSize] = js.undefined
  var status: js.UndefOr[
    antdLib.antdLibStrings.normal | antdLib.antdLibStrings.exception | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success
  ] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String | ProgressGradient] = js.undefined
  var strokeLinecap: js.UndefOr[
    antdLib.antdLibStrings.butt | antdLib.antdLibStrings.square | antdLib.antdLibStrings.round
  ] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var successPercent: js.UndefOr[scala.Double] = js.undefined
  var trailColor: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ProgressType] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    format: (/* percent */ js.UndefOr[scala.Double], /* successPercent */ js.UndefOr[scala.Double]) => reactLib.reactMod.ReactNode = null,
    gapDegree: scala.Int | scala.Double = null,
    gapPosition: antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.left | antdLib.antdLibStrings.right = null,
    percent: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    showInfo: js.UndefOr[scala.Boolean] = js.undefined,
    size: ProgressSize = null,
    status: antdLib.antdLibStrings.normal | antdLib.antdLibStrings.exception | antdLib.antdLibStrings.active | antdLib.antdLibStrings.success = null,
    strokeColor: java.lang.String | ProgressGradient = null,
    strokeLinecap: antdLib.antdLibStrings.butt | antdLib.antdLibStrings.square | antdLib.antdLibStrings.round = null,
    strokeWidth: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    successPercent: scala.Int | scala.Double = null,
    trailColor: java.lang.String = null,
    `type`: ProgressType = null,
    width: scala.Int | scala.Double = null
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo)
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (successPercent != null) __obj.updateDynamic("successPercent")(successPercent.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
}

