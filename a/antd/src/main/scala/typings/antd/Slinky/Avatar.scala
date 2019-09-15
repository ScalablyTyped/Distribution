package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import typings.antd.esAvatarMod.AvatarProps
import typings.antd.esAvatarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, alt, className, src, srcSet */
object Avatar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esAvatarMod.default].asInstanceOf[String | js.Object]
  def apply(
    icon: String = null,
    onError: () => Boolean = null,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | typings.antd.antdStrings.default | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AvatarProps
}

