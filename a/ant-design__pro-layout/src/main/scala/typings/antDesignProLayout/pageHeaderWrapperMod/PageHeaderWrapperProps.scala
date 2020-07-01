package typings.antDesignProLayout.pageHeaderWrapperMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antd.avatarMod.AvatarProps
import typings.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.tabsMod.TabsProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/PageHeaderWrapper.PageHeaderTabConfig */
/* Inlined parent std.Omit<antd.antd/lib/page-header.PageHeaderProps, 'title'> */
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
  var onTabChange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['onChange'] */ js.Any
  ] = js.undefined
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, ReactNode]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  var tabActiveKey: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['activeKey'] */ js.Any
  ] = js.undefined
  var tabBarExtraContent: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['tabBarExtraContent'] */ js.Any
  ] = js.undefined
  var tabList: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ]
  ] = js.undefined
  var tabProps: js.UndefOr[TabsProps] = js.undefined
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
    onTabChange: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['onChange'] */ js.Any = null,
    pageHeaderRender: /* props */ PageHeaderWrapperProps => ReactNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    subTitle: ReactNode = null,
    tabActiveKey: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['activeKey'] */ js.Any = null,
    tabBarExtraContent: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['tabBarExtraContent'] */ js.Any = null,
    tabList: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ] = null,
    tabProps: TabsProps = null,
    tags: ReactElement | js.Array[ReactElement] = null,
    title: ReactNode | `false` = null
  ): PageHeaderWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (backIcon != null) __obj.updateDynamic("backIcon")(backIcon.asInstanceOf[js.Any])
    if (breadcrumb != null) __obj.updateDynamic("breadcrumb")(breadcrumb.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.get.asInstanceOf[js.Any])
    if (onBack != null) __obj.updateDynamic("onBack")(js.Any.fromFunction1(onBack))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange.asInstanceOf[js.Any])
    if (pageHeaderRender != null) __obj.updateDynamic("pageHeaderRender")(js.Any.fromFunction1(pageHeaderRender))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList.asInstanceOf[js.Any])
    if (tabProps != null) __obj.updateDynamic("tabProps")(tabProps.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
}

