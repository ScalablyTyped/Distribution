package typings.antDesignProLayout.pageContainerMod

import typings.antDesignProLayout.anon.PageHeaderPropschildrenRe
import typings.antDesignProLayout.anon.TabPanePropskeyReactTextu
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.antd.affixMod.AffixProps
import typings.antd.avatarAvatarMod.AvatarProps
import typings.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.tabsMod.TabsProps
import typings.rcTabs.interfaceMod.TabBarExtraContent
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/PageContainer.PageHeaderTabConfig */
/* Inlined parent std.Omit<antd.antd/lib/page-header.PageHeaderProps, 'title'> */
@js.native
trait PageContainerProps extends js.Object {
  
  /**
    * @name 固钉的配置
    * @description 与 antd 完全相同
    */
  var affixProps: js.UndefOr[AffixProps] = js.native
  
  var avatar: js.UndefOr[AvatarProps] = js.native
  
  var backIcon: js.UndefOr[ReactNode] = js.native
  
  var breadcrumb: js.UndefOr[BreadcrumbProps] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[ReactNode] = js.native
  
  var extra: js.UndefOr[ReactNode] = js.native
  
  var extraContent: js.UndefOr[ReactNode] = js.native
  
  /**
    * @name 固定 PageHeader 到页面顶部
    * @deprecated 请使用 fixedHeader
    */
  var fixHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * @name 固定 PageHeader 到页面顶部
    */
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[js.Array[ReactNode]] = js.native
  
  /**
    * @name 是否显示背景色
    */
  var ghost: js.UndefOr[Boolean] = js.native
  
  /**
    * @name PageHeader 的配置
    * @description 与 antd 完全相同
    */
  var header: js.UndefOr[PageHeaderPropschildrenRe] = js.native
  
  /**
    * @name 是否加载
    * @description 只加载内容区域
    */
  var loading: js.UndefOr[Boolean] = js.native
  
  var onBack: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  
  /**
    * @name tab 修改时触发
    */
  var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.native
  
  /**
    * @name 自定义 pageHeader
    */
  var pageHeaderRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var subTitle: js.UndefOr[ReactNode] = js.native
  
  /**
    * @name 当前选中 tab 的 key
    */
  var tabActiveKey: js.UndefOr[String] = js.native
  
  /**
    * @name tab 上多余的区域
    */
  var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.native
  
  /**
    * @name tabs 的列表
    */
  var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.native
  
  /**
    * @name tabs 的其他配置
    */
  var tabProps: js.UndefOr[TabsProps] = js.native
  
  var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  
  var title: js.UndefOr[ReactNode | `false`] = js.native
}
object PageContainerProps {
  
  @scala.inline
  def apply(): PageContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContainerProps]
  }
  
  @scala.inline
  implicit class PageContainerPropsOps[Self <: PageContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAffixProps(value: AffixProps): Self = this.set("affixProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffixProps: Self = this.set("affixProps", js.undefined)
    
    @scala.inline
    def setAvatar(value: AvatarProps): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setBackIcon(value: ReactNode): Self = this.set("backIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackIcon: Self = this.set("backIcon", js.undefined)
    
    @scala.inline
    def setBreadcrumb(value: BreadcrumbProps): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumb: Self = this.set("breadcrumb", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setExtraContent(value: ReactNode): Self = this.set("extraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraContent: Self = this.set("extraContent", js.undefined)
    
    @scala.inline
    def setFixHeader(value: Boolean): Self = this.set("fixHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixHeader: Self = this.set("fixHeader", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setFooterVarargs(value: ReactNode*): Self = this.set("footer", js.Array(value :_*))
    
    @scala.inline
    def setFooter(value: js.Array[ReactNode]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setGhost(value: Boolean): Self = this.set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    
    @scala.inline
    def setHeader(value: PageHeaderPropschildrenRe): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnBack(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onBack", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBack: Self = this.set("onBack", js.undefined)
    
    @scala.inline
    def setOnTabChange(value: /* activeKey */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    
    @scala.inline
    def setPageHeaderRenderFunction1(value: PageContainerProps => ReactNode): Self = this.set("pageHeaderRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, ReactNode]]): Self = this.set("pageHeaderRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeaderRender: Self = this.set("pageHeaderRender", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubTitle(value: ReactNode): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitle: Self = this.set("subTitle", js.undefined)
    
    @scala.inline
    def setTabActiveKey(value: String): Self = this.set("tabActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabActiveKey: Self = this.set("tabActiveKey", js.undefined)
    
    @scala.inline
    def setTabBarExtraContent(value: TabBarExtraContent): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarExtraContent: Self = this.set("tabBarExtraContent", js.undefined)
    
    @scala.inline
    def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = this.set("tabList", js.Array(value :_*))
    
    @scala.inline
    def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = this.set("tabList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabList: Self = this.set("tabList", js.undefined)
    
    @scala.inline
    def setTabProps(value: TabsProps): Self = this.set("tabProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabProps: Self = this.set("tabProps", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: ReactElement*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: ReactElement | js.Array[ReactElement]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
