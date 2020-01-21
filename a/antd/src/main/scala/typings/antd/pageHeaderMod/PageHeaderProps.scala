package typings.antd.pageHeaderMod

import typings.antd.avatarMod.AvatarProps
import typings.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var avatar: js.UndefOr[AvatarProps] = js.undefined
  var backIcon: js.UndefOr[ReactNode] = js.undefined
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var onBack: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  var title: ReactNode
}

object PageHeaderProps {
  @scala.inline
  def apply(
    avatar: AvatarProps = null,
    backIcon: ReactNode = null,
    breadcrumb: BreadcrumbProps = null,
    className: String = null,
    extra: ReactNode = null,
    footer: ReactNode = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: ReactNode = null,
    tags: ReactElement | js.Array[ReactElement] = null,
    title: ReactNode = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

