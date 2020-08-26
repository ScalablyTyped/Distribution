package typings.antd.tagMod

import typings.antd.colorsMod.PresetColorType
import typings.antd.colorsMod.PresetStatusColorType
import typings.antd.typeMod.LiteralUnion
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagProps extends HTMLAttributes[HTMLSpanElement] {
  var closable: js.UndefOr[Boolean] = js.native
  var closeIcon: js.UndefOr[ReactNode] = js.native
  @JSName("color")
  var color_TagProps: js.UndefOr[LiteralUnion[PresetColorType | PresetStatusColorType, String]] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var onClose: js.UndefOr[js.Function] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object TagProps {
  @scala.inline
  def apply(): TagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagProps]
  }
  @scala.inline
  implicit class TagPropsOps[Self <: TagProps] (val x: Self) extends AnyVal {
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
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseIcon(value: ReactNode): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setColor(value: LiteralUnion[PresetColorType | PresetStatusColorType, String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnClose(value: js.Function): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

