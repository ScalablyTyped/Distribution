package typings.antd.popoverMod

import typings.antd.getRenderPropValueMod.RenderFunction
import typings.antd.tooltipMod.AbstractTooltipProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverProps extends AbstractTooltipProps {
  var content: js.UndefOr[ReactNode | RenderFunction] = js.native
  var title: js.UndefOr[ReactNode | RenderFunction] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
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
    def setContentFunction0(value: () => ReactNode): Self = this.set("content", js.Any.fromFunction0(value))
    @scala.inline
    def setContent(value: ReactNode | RenderFunction): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setTitleFunction0(value: () => ReactNode): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: ReactNode | RenderFunction): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

