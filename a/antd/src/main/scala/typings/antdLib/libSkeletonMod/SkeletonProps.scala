package typings
package antdLib.libSkeletonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var avatar: js.UndefOr[antdLib.libSkeletonAvatarMod.SkeletonAvatarProps | scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var paragraph: js.UndefOr[antdLib.libSkeletonParagraphMod.SkeletonParagraphProps | scala.Boolean] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[antdLib.libSkeletonTitleMod.SkeletonTitleProps | scala.Boolean] = js.undefined
}

object SkeletonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    avatar: antdLib.libSkeletonAvatarMod.SkeletonAvatarProps | scala.Boolean = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    paragraph: antdLib.libSkeletonParagraphMod.SkeletonParagraphProps | scala.Boolean = null,
    prefixCls: java.lang.String = null,
    title: antdLib.libSkeletonTitleMod.SkeletonTitleProps | scala.Boolean = null
  ): SkeletonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonProps]
  }
}

