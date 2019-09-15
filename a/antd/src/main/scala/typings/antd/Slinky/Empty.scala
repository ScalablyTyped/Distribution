package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esEmptyMod.EmptyProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Empty
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esEmptyMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    description: TagMod[Any] = null,
    image: TagMod[Any] = null,
    imageStyle: CSSProperties = null,
    prefixCls: String = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EmptyProps
}

