package typings.antDesignIcons.iconMod

import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconComponentProps extends IconBaseProps {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object IconComponentProps {
  @scala.inline
  def apply(
    IconBaseProps: IconBaseProps = null,
    ariaLabel: String = null,
    component: ComponentType[CustomIconComponentProps | SVGProps[SVGSVGElement]] = null,
    viewBox: String = null
  ): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    if (IconBaseProps != null) js.Dynamic.global.Object.assign(__obj, IconBaseProps)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconComponentProps]
  }
}

