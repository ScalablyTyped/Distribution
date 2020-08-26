package typings.antd.baseMod

import typings.antd.typographyTypographyMod.TypographyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockProps extends TypographyProps {
  var code: js.UndefOr[Boolean] = js.native
  var copyable: js.UndefOr[Boolean | CopyConfig] = js.native
  var delete: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean | EditConfig] = js.native
  var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mark: js.UndefOr[Boolean] = js.native
  var strong: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[BaseType] = js.native
  var underline: js.UndefOr[Boolean] = js.native
}

object BlockProps {
  @scala.inline
  def apply(): BlockProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockProps]
  }
  @scala.inline
  implicit class BlockPropsOps[Self <: BlockProps] (val x: Self) extends AnyVal {
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
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCopyable(value: Boolean | CopyConfig): Self = this.set("copyable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyable: Self = this.set("copyable", js.undefined)
    @scala.inline
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | EditConfig): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEllipsis(value: Boolean | EllipsisConfig): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    @scala.inline
    def setStrong(value: Boolean): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: BaseType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
  
}

