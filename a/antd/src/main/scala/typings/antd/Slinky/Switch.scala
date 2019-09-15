package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esSwitchMod.SwitchProps
import typings.antd.esSwitchMod.SwitchSize
import typings.antd.esSwitchMod.default
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: checked, style, autoFocus, className, disabled, defaultChecked, title */
object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esSwitchMod.default].asInstanceOf[String | js.Object]
  def apply(
    checkedChildren: TagMod[Any] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    onClick: (/* checked */ Boolean, /* event */ MouseEvent) => Unit = null,
    prefixCls: String = null,
    size: SwitchSize = null,
    unCheckedChildren: TagMod[Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checkedChildren != null) __obj.updateDynamic("checkedChildren")(checkedChildren)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (unCheckedChildren != null) __obj.updateDynamic("unCheckedChildren")(unCheckedChildren)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchProps
}

