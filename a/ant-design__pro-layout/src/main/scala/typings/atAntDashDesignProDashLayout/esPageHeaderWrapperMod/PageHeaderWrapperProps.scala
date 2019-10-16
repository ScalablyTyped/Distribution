package typings.atAntDashDesignProDashLayout.esPageHeaderWrapperMod

import typings.antd.esAvatarMod.AvatarProps
import typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.atAntDashDesignProDashLayout.Anon_Key
import typings.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutNumbers.`false`
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/es/PageHeaderWrapper.PageHeaderTabConfig */
/* Inlined parent std.Omit<antd.antd/es/page-header.PageHeaderProps, 'title'> */
trait PageHeaderWrapperProps extends js.Object {
  var avatar: js.UndefOr[AvatarProps] = js.undefined
  var backIcon: js.UndefOr[ReactNode] = js.undefined
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var extraContent: js.UndefOr[ReactNode] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var onBack: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, ReactNode]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  var tabActiveKey: js.UndefOr[String] = js.undefined
  var tabBarExtraContent: js.UndefOr[ReactNode | Null] = js.undefined
  var tabList: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  var title: js.UndefOr[ReactNode | `false`] = js.undefined
}

object PageHeaderWrapperProps {
  @scala.inline
  def apply(
    avatar: AvatarProps = null,
    backIcon: ReactNode = null,
    breadcrumb: BreadcrumbProps = null,
    className: String = null,
    content: ReactNode = null,
    extra: ReactNode = null,
    extraContent: ReactNode = null,
    footer: ReactNode = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    onBack: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onTabChange: /* activeKey */ String => Unit = null,
    pageHeaderRender: /* props */ PageHeaderWrapperProps => ReactNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: ReactNode = null,
    tabActiveKey: String = null,
    tabBarExtraContent: ReactNode = null,
    tabList: js.Array[Anon_Key] = null,
    tags: ReactElement | js.Array[ReactElement] = null,
    title: ReactNode | `false` = null
  ): PageHeaderWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost)
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (pageHeaderRender != null) __obj.updateDynamic("pageHeaderRender")(js.Any.fromFunction1(pageHeaderRender))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey)
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
}

