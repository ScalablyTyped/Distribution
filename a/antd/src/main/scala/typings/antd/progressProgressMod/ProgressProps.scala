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

@js.native
trait ProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var format: js.UndefOr[
    js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
  ] = js.native
  var gapDegree: js.UndefOr[Double] = js.native
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.native
  var percent: js.UndefOr[Double] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showInfo: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[ProgressSize] = js.native
  var status: js.UndefOr[normal | exception | active | success] = js.native
  var steps: js.UndefOr[Double] = js.native
  var strokeColor: js.UndefOr[String | ProgressGradient] = js.native
  var strokeLinecap: js.UndefOr[butt | square | round] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var success: js.UndefOr[SuccessProps] = js.native
  /** @deprecated Use `success` instead */
  var successPercent: js.UndefOr[Double] = js.native
  var trailColor: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[ProgressType] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ProgressProps {
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGapDegree(value: Double): Self = this.set("gapDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapDegree: Self = this.set("gapDegree", js.undefined)
    @scala.inline
    def setGapPosition(value: top | bottom | left | right): Self = this.set("gapPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapPosition: Self = this.set("gapPosition", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setShowInfo(value: Boolean): Self = this.set("showInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInfo: Self = this.set("showInfo", js.undefined)
    @scala.inline
    def setSize(value: ProgressSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStatus(value: normal | exception | active | success): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setStrokeColor(value: String | ProgressGradient): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: butt | square | round): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuccess(value: SuccessProps): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setSuccessPercent(value: Double): Self = this.set("successPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessPercent: Self = this.set("successPercent", js.undefined)
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
    @scala.inline
    def setType(value: ProgressType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

