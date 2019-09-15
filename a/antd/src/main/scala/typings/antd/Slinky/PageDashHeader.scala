package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.esAvatarMod.AvatarProps
import typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.esPageDashHeaderMod.PageHeaderProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object PageDashHeader
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.antd.esPageDashHeaderMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    title: TagMod[Any],
    avatar: AvatarProps = null,
    backIcon: TagMod[Any] = null,
    breadcrumb: BreadcrumbProps = null,
    extra: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    onBack: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    subTitle: TagMod[Any] = null,
    tags: ReactElement | js.Array[ReactElement] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(title = title)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon)
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PageHeaderProps
}

