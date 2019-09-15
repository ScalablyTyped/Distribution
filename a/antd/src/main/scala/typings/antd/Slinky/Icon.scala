package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.antd.esIconMod.CustomIconComponentProps
import typings.antd.esIconMod.IconProps
import typings.antd.esIconMod.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: tabIndex, onClick, role, style, viewBox, onKeyUp, className, title, type */
object Icon
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esIconMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    component: ReactComponentClass[CustomIconComponentProps] = null,
    prefixCls: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeType = null,
    twoToneColor: String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (twoToneColor != null) __obj.updateDynamic("twoToneColor")(twoToneColor)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconProps
}

