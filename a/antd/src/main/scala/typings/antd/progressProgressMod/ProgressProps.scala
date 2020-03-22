package typings.antd.progressProgressMod

import typings.antd.antdStrings.active
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.butt
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.left
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.right
import typings.antd.antdStrings.round
import typings.antd.antdStrings.square
import typings.antd.antdStrings.success
import typings.antd.antdStrings.top
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[
    js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
  ] = js.undefined
  var gapDegree: js.UndefOr[Double] = js.undefined
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInfo: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[ProgressSize] = js.undefined
  var status: js.UndefOr[normal | exception | active | success] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String | ProgressGradient] = js.undefined
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var successPercent: js.UndefOr[Double] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ProgressType] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    className: String = null,
    format: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode = null,
    gapDegree: Int | Double = null,
    gapPosition: top | bottom | left | right = null,
    percent: Int | Double = null,
    prefixCls: String = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    size: ProgressSize = null,
    status: normal | exception | active | success = null,
    steps: Int | Double = null,
    strokeColor: String | ProgressGradient = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null,
    successPercent: Int | Double = null,
    trailColor: String = null,
    `type`: ProgressType = null,
    width: Int | Double = null
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (successPercent != null) __obj.updateDynamic("successPercent")(successPercent.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
}

