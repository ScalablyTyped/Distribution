package typings.antdMobile.flexFlexMod

import typings.antdMobile.antdMobileStrings.around
import typings.antdMobile.antdMobileStrings.between
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.end
import typings.antdMobile.antdMobileStrings.start
import typings.antdMobile.antdMobileStrings.stretch
import typings.antdMobile.flexPropsTypeMod.FlexPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexProps extends FlexPropsType {
  var alignContent: js.UndefOr[start | end | center | between | around | stretch] = js.native
  var className: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object FlexProps {
  @scala.inline
  def apply(): FlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps]
  }
  @scala.inline
  implicit class FlexPropsOps[Self <: FlexProps] (val x: Self) extends AnyVal {
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
    def setAlignContent(value: start | end | center | between | around | stretch): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

