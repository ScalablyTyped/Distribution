package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esResultMod.ResultProps
import typings.antd.esResultMod.ResultStatusType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Result
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esResultMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    extra: TagMod[Any] = null,
    icon: TagMod[Any] = null,
    prefixCls: String = null,
    status: ResultStatusType = null,
    subTitle: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ResultProps
}

