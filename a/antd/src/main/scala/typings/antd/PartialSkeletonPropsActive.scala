package typings.antd

import typings.antd.libSkeletonAvatarMod.SkeletonAvatarProps
import typings.antd.libSkeletonParagraphMod.SkeletonParagraphProps
import typings.antd.libSkeletonTitleMod.SkeletonTitleProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/skeleton.SkeletonProps> */
trait PartialSkeletonPropsActive extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var avatar: js.UndefOr[SkeletonAvatarProps | Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var paragraph: js.UndefOr[SkeletonParagraphProps | Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.undefined
}

object PartialSkeletonPropsActive {
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
  ): PartialSkeletonPropsActive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSkeletonPropsActive]
  }
}

