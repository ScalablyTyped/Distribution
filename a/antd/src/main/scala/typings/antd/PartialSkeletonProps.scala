package typings.antd

import typings.antd.esSkeletonAvatarMod.SkeletonAvatarProps
import typings.antd.esSkeletonParagraphMod.SkeletonParagraphProps
import typings.antd.esSkeletonTitleMod.SkeletonTitleProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/es/skeleton.SkeletonProps> */
trait PartialSkeletonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var avatar: js.UndefOr[SkeletonAvatarProps | Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var paragraph: js.UndefOr[SkeletonParagraphProps | Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.undefined
}

object PartialSkeletonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    avatar: SkeletonAvatarProps | Boolean = null,
    children: ReactNode = null,
    className: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    paragraph: SkeletonParagraphProps | Boolean = null,
    prefixCls: String = null,
    title: SkeletonTitleProps | Boolean = null
  ): PartialSkeletonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSkeletonProps]
  }
}

