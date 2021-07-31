package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
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
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageContainerMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/PageContainer", JSImport.Default)
  @js.native
  val default: FC[PageContainerProps] = js.native
  
  /* Inlined parent @ant-design/pro-layout.@ant-design/pro-layout/lib/PageContainer.PageHeaderTabConfig */
  /* Inlined parent std.Omit<antd.antd/lib/page-header.PageHeaderProps, 'title'> */
  trait PageContainerProps extends StObject {
    
    /**
      * @name 固钉的配置
      * @description 与 antd 完全相同
      */
    var affixProps: js.UndefOr[AffixProps] = js.undefined
    
    var avatar: js.UndefOr[AvatarProps] = js.undefined
    
    var backIcon: js.UndefOr[ReactNode] = js.undefined
    
    var breadcrumb: js.UndefOr[BreadcrumbProps] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var extraContent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @name 固定 PageHeader 到页面顶部
      * @deprecated 请使用 fixedHeader
      */
    var fixHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 固定 PageHeader 到页面顶部
      */
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    /**
      * @name 是否显示背景色
      */
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name PageHeader 的配置
      * @description 与 antd 完全相同
      */
    var header: js.UndefOr[PageHeaderPropschildrenRe] = js.undefined
    
    /**
      * @name 是否加载
      * @description 只加载内容区域
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onBack: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    /**
      * @name tab 修改时触发
      */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
    
    /**
      * @name 自定义 pageHeader
      */
    var pageHeaderRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @name 当前选中 tab 的 key
      */
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    /**
      * @name tab 上多余的区域
      */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.undefined
    
    /**
      * @name tabs 的列表
      */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.undefined
    
    /**
      * @name tabs 的其他配置
      */
    var tabProps: js.UndefOr[TabsProps] = js.undefined
    
    var tags: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    var title: js.UndefOr[ReactNode | `false`] = js.undefined
  }
  object PageContainerProps {
    
    @scala.inline
    def apply(): PageContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContainerProps]
    }
    
    @scala.inline
    implicit class PageContainerPropsMutableBuilder[Self <: PageContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixProps(value: AffixProps): Self = StObject.set(x, "affixProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixPropsUndefined: Self = StObject.set(x, "affixProps", js.undefined)
      
      @scala.inline
      def setAvatar(value: AvatarProps): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setBackIcon(value: ReactNode): Self = StObject.set(x, "backIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackIconUndefined: Self = StObject.set(x, "backIcon", js.undefined)
      
      @scala.inline
      def setBreadcrumb(value: BreadcrumbProps): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContent(value: ReactNode): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Array[ReactNode]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFooterVarargs(value: ReactNode*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      @scala.inline
      def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      @scala.inline
      def setHeader(value: PageHeaderPropschildrenRe): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnBack(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setPageHeaderRender(value: WithFalse[js.Function1[PageContainerProps, ReactNode]]): Self = StObject.set(x, "pageHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderRenderFunction1(value: PageContainerProps => ReactNode): Self = StObject.set(x, "pageHeaderRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageHeaderRenderUndefined: Self = StObject.set(x, "pageHeaderRender", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      @scala.inline
      def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      @scala.inline
      def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
      
      @scala.inline
      def setTags(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: ReactElement*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactNode | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PageHeaderTabConfig extends StObject {
    
    /**
      * @name 固定 PageHeader 到页面顶部
      * @deprecated 请使用 fixedHeader
      */
    var fixHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 固定 PageHeader 到页面顶部
      */
    var fixedHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name tab 修改时触发
      */
    var onTabChange: js.UndefOr[js.Function1[/* activeKey */ String, Unit]] = js.undefined
    
    /**
      * @name 当前选中 tab 的 key
      */
    var tabActiveKey: js.UndefOr[String] = js.undefined
    
    /**
      * @name tab 上多余的区域
      */
    var tabBarExtraContent: js.UndefOr[TabBarExtraContent] = js.undefined
    
    /**
      * @name tabs 的列表
      */
    var tabList: js.UndefOr[js.Array[TabPanePropskeyReactTextu]] = js.undefined
    
    /**
      * @name tabs 的其他配置
      */
    var tabProps: js.UndefOr[TabsProps] = js.undefined
  }
  object PageHeaderTabConfig {
    
    @scala.inline
    def apply(): PageHeaderTabConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderTabConfig]
    }
    
    @scala.inline
    implicit class PageHeaderTabConfigMutableBuilder[Self <: PageHeaderTabConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixHeader(value: Boolean): Self = StObject.set(x, "fixHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixHeaderUndefined: Self = StObject.set(x, "fixHeader", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* activeKey */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: TabBarExtraContent): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabList(value: js.Array[TabPanePropskeyReactTextu]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      @scala.inline
      def setTabListVarargs(value: TabPanePropskeyReactTextu*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      @scala.inline
      def setTabProps(value: TabsProps): Self = StObject.set(x, "tabProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPropsUndefined: Self = StObject.set(x, "tabProps", js.undefined)
    }
  }
  
  type _To = FC[PageContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageContainerMod.foo` */
  override def _to: FC[PageContainerProps] = default
}
