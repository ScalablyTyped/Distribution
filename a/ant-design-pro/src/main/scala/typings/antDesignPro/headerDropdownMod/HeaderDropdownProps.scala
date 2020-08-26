package typings.antDesignPro.headerDropdownMod

import typings.antDesignPro.antDesignProStrings.bottomCenter
import typings.antDesignPro.antDesignProStrings.bottomLeft
import typings.antDesignPro.antDesignProStrings.bottomRight
import typings.antDesignPro.antDesignProStrings.topCenter
import typings.antDesignPro.antDesignProStrings.topLeft
import typings.antDesignPro.antDesignProStrings.topRight
import typings.antd.dropdownDropdownMod.DropDownProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderDropdownProps extends DropDownProps {
  @JSName("overlay")
  var overlay_HeaderDropdownProps: ReactNode | OverlayFunc = js.native
  @JSName("placement")
  var placement_HeaderDropdownProps: js.UndefOr[bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter] = js.native
}

object HeaderDropdownProps {
  @scala.inline
  def apply(): HeaderDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderDropdownProps]
  }
  @scala.inline
  implicit class HeaderDropdownPropsOps[Self <: HeaderDropdownProps] (val x: Self) extends AnyVal {
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
    def setOverlayFunction0(value: () => ReactNode): Self = this.set("overlay", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlay(value: ReactNode | OverlayFunc): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPlacement(value: bottomLeft | bottomRight | topLeft | topCenter | topRight | bottomCenter): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
  }
  
}

