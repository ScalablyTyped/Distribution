package typings.antd.gridColMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColProps extends HTMLAttributes[HTMLDivElement] {
  var flex: js.UndefOr[FlexType] = js.native
  var lg: js.UndefOr[ColSpanType | ColSize] = js.native
  var md: js.UndefOr[ColSpanType | ColSize] = js.native
  var offset: js.UndefOr[ColSpanType] = js.native
  var order: js.UndefOr[ColSpanType] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var pull: js.UndefOr[ColSpanType] = js.native
  var push: js.UndefOr[ColSpanType] = js.native
  var sm: js.UndefOr[ColSpanType | ColSize] = js.native
  var span: js.UndefOr[ColSpanType] = js.native
  var xl: js.UndefOr[ColSpanType | ColSize] = js.native
  var xs: js.UndefOr[ColSpanType | ColSize] = js.native
  var xxl: js.UndefOr[ColSpanType | ColSize] = js.native
}

object ColProps {
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
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
    def setFlex(value: FlexType): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setLg(value: ColSpanType | ColSize): Self = this.set("lg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    @scala.inline
    def setMd(value: ColSpanType | ColSize): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    @scala.inline
    def setOffset(value: ColSpanType): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrder(value: ColSpanType): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPull(value: ColSpanType): Self = this.set("pull", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    @scala.inline
    def setPush(value: ColSpanType): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setSm(value: ColSpanType | ColSize): Self = this.set("sm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    @scala.inline
    def setSpan(value: ColSpanType): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setXl(value: ColSpanType | ColSize): Self = this.set("xl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    @scala.inline
    def setXs(value: ColSpanType | ColSize): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    @scala.inline
    def setXxl(value: ColSpanType | ColSize): Self = this.set("xxl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXxl: Self = this.set("xxl", js.undefined)
  }
  
}

