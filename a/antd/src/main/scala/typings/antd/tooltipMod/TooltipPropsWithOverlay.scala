package typings.antd.tooltipMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipPropsWithOverlay
  extends AbstractTooltipProps
     with TooltipProps {
  @JSName("overlay")
  var overlay_TooltipPropsWithOverlay: ReactNode | RenderFunction = js.native
  var title: js.UndefOr[ReactNode | RenderFunction] = js.native
}

object TooltipPropsWithOverlay {
  @scala.inline
  def apply(): TooltipPropsWithOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipPropsWithOverlay]
  }
  @scala.inline
  implicit class TooltipPropsWithOverlayOps[Self <: TooltipPropsWithOverlay] (val x: Self) extends AnyVal {
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
    def setOverlay(value: ReactNode | RenderFunction): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setTitleFunction0(value: () => ReactNode): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: ReactNode | RenderFunction): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

