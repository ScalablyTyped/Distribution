package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCardMetaMod.CardMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Meta
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esCardMetaMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    avatar: TagMod[Any] = null,
    description: TagMod[Any] = null,
    prefixCls: String = null,
    title: TagMod[Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (description != null) __obj.updateDynamic("description")(description)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CardMetaProps
}

