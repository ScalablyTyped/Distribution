package typings.antDesignPro.avatarListMod

import typings.antDesignPro.avatarItemMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarListProps extends js.Object {
  var Item: js.UndefOr[ReactElement] = js.native
  var children: ReactElement | js.Array[ReactElement] = js.native
  var excessItemsStyle: js.UndefOr[CSSProperties] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object AvatarListProps {
  @scala.inline
  def apply(children: ReactElement | js.Array[ReactElement]): AvatarListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarListProps]
  }
  @scala.inline
  implicit class AvatarListPropsOps[Self <: AvatarListProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ReactElement): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    @scala.inline
    def setExcessItemsStyle(value: CSSProperties): Self = this.set("excessItemsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcessItemsStyle: Self = this.set("excessItemsStyle", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

