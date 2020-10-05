package typings.antd.sliderMod

import typings.antd.tooltipMod.TooltipPlacement
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderBaseProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var id: js.UndefOr[String] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var marks: js.UndefOr[SliderMarks] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var step: js.UndefOr[Double | Null] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tipFormatter: js.UndefOr[Null | (js.Function1[/* value */ js.UndefOr[Double], ReactNode])] = js.native
  var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.native
  var tooltipPrefixCls: js.UndefOr[String] = js.native
  var tooltipVisible: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object SliderBaseProps {
  @scala.inline
  def apply(): SliderBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderBaseProps]
  }
  @scala.inline
  implicit class SliderBasePropsOps[Self <: SliderBaseProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setGetTooltipPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getTooltipPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTooltipPopupContainer: Self = this.set("getTooltipPopupContainer", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    @scala.inline
    def setMarks(value: SliderMarks): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTipFormatter: Self = this.set("tipFormatter", js.undefined)
    @scala.inline
    def setTipFormatterNull: Self = this.set("tipFormatter", null)
    @scala.inline
    def setTooltipPlacement(value: TooltipPlacement): Self = this.set("tooltipPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPlacement: Self = this.set("tooltipPlacement", js.undefined)
    @scala.inline
    def setTooltipPrefixCls(value: String): Self = this.set("tooltipPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPrefixCls: Self = this.set("tooltipPrefixCls", js.undefined)
    @scala.inline
    def setTooltipVisible(value: Boolean): Self = this.set("tooltipVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipVisible: Self = this.set("tooltipVisible", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

