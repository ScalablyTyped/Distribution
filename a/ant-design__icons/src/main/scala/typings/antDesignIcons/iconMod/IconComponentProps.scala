package typings.antDesignIcons.iconMod

import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconComponentProps extends IconBaseProps {
  var ariaLabel: js.UndefOr[String] = js.native
  var component: js.UndefOr[ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.native
  var viewBox: js.UndefOr[String] = js.native
}

object IconComponentProps {
  @scala.inline
  def apply(): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconComponentProps]
  }
  @scala.inline
  implicit class IconComponentPropsOps[Self <: IconComponentProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setComponent(value: ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
  
}

