package typings.antd.siderMod

import typings.antd.antdStrings.lg
import typings.antd.antdStrings.md
import typings.antd.antdStrings.sm
import typings.antd.antdStrings.xl
import typings.antd.antdStrings.xs
import typings.antd.antdStrings.xxl
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiderProps extends HTMLAttributes[HTMLDivElement] {
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedWidth: js.UndefOr[Double | String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var defaultCollapsed: js.UndefOr[Boolean] = js.native
  var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.native
  var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var reverseArrow: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[SiderTheme] = js.native
  var trigger: js.UndefOr[ReactNode] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.native
}

object SiderProps {
  @scala.inline
  def apply(): SiderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderProps]
  }
  @scala.inline
  implicit class SiderPropsOps[Self <: SiderProps] (val x: Self) extends AnyVal {
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
    def setBreakpoint(value: xs | sm | md | lg | xl | xxl): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setCollapsedWidth(value: Double | String): Self = this.set("collapsedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedWidth: Self = this.set("collapsedWidth", js.undefined)
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    @scala.inline
    def setDefaultCollapsed(value: Boolean): Self = this.set("defaultCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCollapsed: Self = this.set("defaultCollapsed", js.undefined)
    @scala.inline
    def setOnBreakpoint(value: /* broken */ Boolean => Unit): Self = this.set("onBreakpoint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBreakpoint: Self = this.set("onBreakpoint", js.undefined)
    @scala.inline
    def setOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit): Self = this.set("onCollapse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setReverseArrow(value: Boolean): Self = this.set("reverseArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseArrow: Self = this.set("reverseArrow", js.undefined)
    @scala.inline
    def setTheme(value: SiderTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTrigger(value: ReactNode): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZeroWidthTriggerStyle(value: CSSProperties): Self = this.set("zeroWidthTriggerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroWidthTriggerStyle: Self = this.set("zeroWidthTriggerStyle", js.undefined)
  }
  
}

