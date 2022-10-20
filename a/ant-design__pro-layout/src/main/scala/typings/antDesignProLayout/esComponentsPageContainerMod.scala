package typings.antDesignProLayout

import typings.antDesignProLayout.anon.OmitAffixPropschildren
import typings.antDesignProLayout.anon.PageContainerPropsprefixe
import typings.antDesignProLayout.anon.PartialPageHeaderPropschi
import typings.antDesignProLayout.anon.TabPanePropskeyKeyundefin
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.esComponentsPageContainerStyleMod.pageContainerToken
import typings.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typings.antDesignProLayout.esTypingsMod.WithFalse
import typings.antd.libAvatarAvatarMod.AvatarProps
import typings.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.libSpinMod.SpinProps
import typings.antd.libTabsMod.TabsProps
import typings.rcTabs.esInterfaceMod.TabBarExtraContent
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPageContainerMod {
  
  @JSImport("@ant-design/pro-layout/es/components/PageContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/PageContainer", "PageContainer")
  @js.native
  val PageContainer: FC[PageContainerProps] = js.native
  
  /**
    * 配置与面包屑相同，只是增加了自动根据路由计算面包屑的功能。此功能必须要在 ProLayout 中使用。
    *
    * @param props
    * @returns
    */
  @JSImport("@ant-design/pro-layout/es/components/PageContainer", "ProBreadcrumb")
  @js.native
  val ProBreadcrumb: FC[BreadcrumbProps] = js.native
  
  inline def ProPageHeader(props: PageContainerPropsprefixe): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ProPageHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  /* Inlined {  title :react.react.ReactNode | false | undefined,   content :react.react.ReactNode | undefined,   extraContent :react.react.ReactNode | undefined,   prefixCls :string | undefined,   footer :std.Array<react.react.ReactNode> | undefined,   token :@ant-design/pro-layout.@ant-design/pro-layout/es/components/PageContainer/style.pageContainerToken | undefined,   header :std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/components/PageHeader.PageHeaderProps> & {  children :react.react.ReactNode | undefined} | undefined,   pageHeaderRender :@ant-design/pro-layout.@ant-design/pro-layout/es/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/es/components/PageContainer.PageContainerProps): react.react.ReactNode> | undefined,   affixProps :std.Omit<antd.antd.AffixProps, 'children'> | undefined,   loading :boolean | antd.antd.SpinProps | react.react.ReactNode | undefined,   breadcrumbRender :@ant-design/pro-layout.@ant-design/pro-layout/es/components/PageHeader.PageHeaderProps['breadcrumbRender'] | false | undefined,   waterMarkProps :@ant-design/pro-layout.@ant-design/pro-layout/es/components/WaterMark.WaterMarkProps | undefined,   breadcrumb :antd.antd.BreadcrumbProps | undefined,   children :react.react.ReactNode | undefined} & @ant-design/pro-layout.@ant-design/pro-layout/es/components/PageContainer.PageHeaderTabConfig & std.Omit<@ant-design/pro-layout.@ant-design/pro-layout/es/components/PageHeader.PageHeaderProps, 'title' | 'footer' | 'breadcrumbRender' | 'breadcrumb'> */
  trait PageContainerProps extends StObject {
    
    /**
      * 与 antd 完全相同
      *
      * @name affixProps 固钉的配置
      */
    var affixProps: js.UndefOr[OmitAffixPropschildren] = js.undefined
    
    var avatar: js.UndefOr[AvatarProps] = js.undefined
    
    var backIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** @name BreadcrumbProps 配置面包屑 */
    var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
    
    /**
      * 自定义 breadcrumb,
      * @name breadcrumbRender 返回false不展示
      */
    var breadcrumbRender: js.UndefOr[
        (js.Function2[/* props */ this.type, /* defaultDom */ ReactNode, ReactNode]) | `false`
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var extraContent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @deprecated 请使用 fixedHeader
      * @name fixHeader 固定 PageHeader 到页面顶部
      */
    var fixHeader: js.UndefOr[Boolean] = js.undefined
    
    /** @name fixedHeader 固定 PageHeader 到页面顶部 */
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 与 antd 完全相同
      *
      * @name PageHeader 的配置
      */
    var header: js.UndefOr[PartialPageHeaderPropschi] = js.undefined
    
    /**
      * 只加载内容区域
      *
      * @name loading 是否加载
      */
    var loading: js.UndefOr[Boolean | SpinProps | ReactNode] = js.undefined
    
    var onBack: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
      ] = js.undefined
    
    /** @name tab 修改时触发 */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
    
    /** @name pageHeaderRender 自定义 pageHeader */
    var pageHeaderRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    /** @name tabActiveKey 当前选中 tab 的 key */
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    /** @name tab 上额外的区域 */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.undefined
    
    /** @name tabs 的列表 */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyKeyundefin]] = js.undefined
    
    /** @name tabs 的其他配置 */
    var tabProps: js.UndefOr[TabsProps] = js.undefined
    
    var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var title: js.UndefOr[ReactNode | `false`] = js.undefined
    
    /**
      * @name token 自定义的 token
      */
    var token: js.UndefOr[pageContainerToken] = js.undefined
    
    /** @name WaterMarkProps 水印的配置 */
    var waterMarkProps: js.UndefOr[WaterMarkProps] = js.undefined
  }
  object PageContainerProps {
    
    inline def apply(): PageContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContainerProps]
    }
    
    extension [Self <: PageContainerProps](x: Self) {
      
      inline def setAffixProps(value: OmitAffixPropschildren): Self = StObject.set(x, "affixProps", value.asInstanceOf[js.Any])
      
      inline def setAffixPropsUndefined: Self = StObject.set(x, "affixProps", js.undefined)
      
      inline def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBackIcon(value: ReactNode): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
      
      inline def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
      
      inline def setBreadcrumb(value: BreadcrumbProps): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbRender(value: (js.Function2[PageContainerProps, /* defaultDom */ ReactNode, ReactNode]) | `false`): Self = StObject.set(x, "breadcrumbRender", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbRenderFunction2(value: (PageContainerProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction2(value))
      
      inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
      
      inline def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraContent(value: ReactNode): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      inline def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFooter(value: js.Array[ReactNode]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: ReactNode*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setHeader(value: PartialPageHeaderPropschi): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLoading(value: Boolean | SpinProps | ReactNode): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnBack(value: /* e */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
      
      inline def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      inline def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setPageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, ReactNode]]): Self = StObject.set(x, "pageHeaderRender", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderRenderFunction1(value: PageContainerProps => ReactNode): Self = StObject.set(x, "pageHeaderRender", js.Any.fromFunction1(value))
      
      inline def setPageHeaderRenderUndefined: Self = StObject.set(x, "pageHeaderRender", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      inline def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      inline def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      inline def setTabList(value: js.Array[TabPanePropskeyKeyundefin]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      inline def setTabListVarargs(value: TabPanePropskeyKeyundefin*): Self = StObject.set(x, "tabList", js.Array(value*))
      
      inline def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      inline def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
      
      inline def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTitle(value: ReactNode | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToken(value: pageContainerToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setWaterMarkProps(value: WaterMarkProps): Self = StObject.set(x, "waterMarkProps", value.asInstanceOf[js.Any])
      
      inline def setWaterMarkPropsUndefined: Self = StObject.set(x, "waterMarkProps", js.undefined)
    }
  }
  
  trait PageHeaderTabConfig extends StObject {
    
    /**
      * @deprecated 请使用 fixedHeader
      * @name fixHeader 固定 PageHeader 到页面顶部
      */
    var fixHeader: js.UndefOr[Boolean] = js.undefined
    
    /** @name fixedHeader 固定 PageHeader 到页面顶部 */
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    /** @name tab 修改时触发 */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
    
    /** @name tabActiveKey 当前选中 tab 的 key */
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    /** @name tab 上额外的区域 */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.undefined
    
    /** @name tabs 的列表 */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyKeyundefin]] = js.undefined
    
    /** @name tabs 的其他配置 */
    var tabProps: js.UndefOr[TabsProps] = js.undefined
  }
  object PageHeaderTabConfig {
    
    inline def apply(): PageHeaderTabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderTabConfig]
    }
    
    extension [Self <: PageHeaderTabConfig](x: Self) {
      
      inline def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      inline def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      inline def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      inline def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      inline def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      inline def setTabList(value: js.Array[TabPanePropskeyKeyundefin]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      inline def setTabListVarargs(value: TabPanePropskeyKeyundefin*): Self = StObject.set(x, "tabList", js.Array(value*))
      
      inline def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      inline def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
    }
  }
}
