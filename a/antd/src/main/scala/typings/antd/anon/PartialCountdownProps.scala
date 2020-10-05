package typings.antd.anon

import typings.antd.statisticUtilsMod.FormatConfig
import typings.antd.statisticUtilsMod.Formatter
import typings.antd.statisticUtilsMod.countdownValueType
import typings.antd.statisticUtilsMod.valueType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/statistic/Countdown.CountdownProps> */
@js.native
trait PartialCountdownProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var decimalSeparator: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[Formatter] = js.native
  var groupSeparator: js.UndefOr[String] = js.native
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[ReactNode] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var suffix: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var value: js.UndefOr[countdownValueType] = js.native
  var valueRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.native
  var valueStyle: js.UndefOr[CSSProperties] = js.native
}

object PartialCountdownProps {
  @scala.inline
  def apply(): PartialCountdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCountdownProps]
  }
  @scala.inline
  implicit class PartialCountdownPropsOps[Self <: PartialCountdownProps] (val x: Self) extends AnyVal {
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
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactNode): Self = this.set("formatter", js.Any.fromFunction2(value))
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    @scala.inline
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setPrefix(value: ReactNode): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffix(value: ReactNode): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: countdownValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueRender(value: /* node */ ReactNode => ReactNode): Self = this.set("valueRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValueRender: Self = this.set("valueRender", js.undefined)
    @scala.inline
    def setValueStyle(value: CSSProperties): Self = this.set("valueStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueStyle: Self = this.set("valueStyle", js.undefined)
  }
  
}

