package typings.antDesignPro.avatarItemMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var src: String = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tips: ReactNode = js.native
}

object AvatarItemProps {
  @scala.inline
  def apply(src: String): AvatarItemProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarItemProps]
  }
  @scala.inline
  implicit class AvatarItemPropsOps[Self <: AvatarItemProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTips(value: ReactNode): Self = this.set("tips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
  }
  
}

