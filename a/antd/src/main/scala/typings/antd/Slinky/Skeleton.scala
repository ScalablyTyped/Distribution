package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esSkeletonAvatarMod.SkeletonAvatarProps
import typings.antd.esSkeletonMod.SkeletonProps
import typings.antd.esSkeletonMod.default
import typings.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import typings.antd.esSkeletonTitleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object Skeleton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esSkeletonMod.default].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    avatar: SkeletonAvatarProps | Boolean = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    paragraph: SkeletonParagraphProps | Boolean = null,
    prefixCls: String = null,
    title: SkeletonTitleProps | Boolean = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SkeletonProps
}

