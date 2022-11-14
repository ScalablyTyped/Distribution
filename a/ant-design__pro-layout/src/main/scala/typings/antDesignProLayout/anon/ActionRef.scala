package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutStrings.group
import typings.antDesignProLayout.antDesignProLayoutStrings.sub
import typings.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typings.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typings.antDesignProLayout.esGetPageTitleMod.GetPageTitleProps
import typings.antDesignProLayout.esLocalesMod.LocaleType
import typings.antDesignProLayout.esProLayoutMod.LayoutBreadcrumbProps
import typings.antDesignProLayout.esTypingMod.MenuDataItem
import typings.antDesignProLayout.esTypingMod.MessageDescriptor
import typings.antDesignProLayout.esTypingMod.WithFalse
import typings.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typings.antd.libBreadcrumbBreadcrumbMod.Route
import typings.react.mod.CSSProperties
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRef extends StObject {
  
  /**
    * @name 错误处理组件
    *
    * @example ErrorBoundary={<MyErrorBoundary/>}
    */
  var ErrorBoundary: js.UndefOr[Any] = js.undefined
  
  /**
    * @name 操作菜单重新刷新
    *
    * @example  重新获取菜单 actionRef.current.reload();
    * */
  var actionRef: js.UndefOr[MutableRefObject[js.UndefOr[Reload]]] = js.undefined
  
  /** Layout 的品牌配置，表现为一张背景图片 */
  var bgLayoutImgList: js.UndefOr[js.Array[Bottom]] = js.undefined
  
  /** PageHeader 的 BreadcrumbProps 配置，会透传下去 */
  var breadcrumbProps: js.UndefOr[BreadcrumbProps & LayoutBreadcrumbProps] = js.undefined
  
  /**
    * @name 设置 PageHeader 的面包屑，只能处理数据
    *
    * @example 手动设置 breadcrumbRender={(routers = []) => [ { path: '/', breadcrumbName: '主页'} ]
    * @example 增加一项 breadcrumbRender={(routers = []) => { return [{ path: '/', breadcrumbName: '主页'} ,...routers ]}
    * @example 删除首页 breadcrumbRender={(routers = []) => { return routers.filter(item => item.path !== '/')}
    * @example 不显示面包屑 breadcrumbRender={false}
    */
  var breadcrumbRender: js.UndefOr[
    WithFalse[
      js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
    ]
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * @name 是否收起 layout 是严格受控的，可以 设置为 true，一直收起
    *
    * @example collapsed={true}
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * content 的样式
    *
    * @example 背景颜色为红色 contentStyle={{ backgroundColor: 'red '}}
    */
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /** @name 是否禁用移动端模式
    *
    * @see 有的管理系统不需要移动端模式，此属性设置为true即可
    * @example disableMobile={true}
    *  */
  var disableMobile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 页脚的配置
    *
    * @example 不展示dom footerRender={false}
    * @example 使用 layout 的  DefaultFooter   footerRender={() => (<DefaultFooter copyright="这是一条测试文案"/>}
    */
  var footerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 处理每个面包屑的配置，需要直接返回 dom
    * @description (route: Route, params: any, routes: Array<Route>, paths: Array<string>) => React.ReactNode
    *
    * @example 设置 disabled： itemRender={(route, params, routes, paths) => { return <Button disabled>{route.breadcrumbName}</Button> }}
    * @example 拼接 path： itemRender={(route, params, routes, paths) => { return <a href={paths.join('/')}>{route.breadcrumbName}</Button> }}
    */
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.undefined
  
  /**
    * @name layout 的 loading 效果，设置完成之后只展示一个 loading
    *
    * @example loading={true}
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name layout
    *
    * @description "zh-CN" | "zh-TW" | "en-US" | "it-IT" | "ko-KR"
    * @example 中文 layout="zh-CN"
    * @example 英文 layout="en-US"
    */
  var locale: js.UndefOr[LocaleType] = js.undefined
  
  /**
    * @name logo 的配置，可以配置url，React 组件 和 false
    *
    * @example 设置 logo 为网络地址  logo="https://avatars1.githubusercontent.com/u/8186664?s=460&v=4"
    * @example 设置 logo 为组件  logo={<img src="https://avatars1.githubusercontent.com/u/8186664?s=460&v=4"/>}
    * @example 设置 logo 为 false 不显示 logo  logo={false}
    * @example 设置 logo 为 方法  logo={()=> <img src="https://avatars1.githubusercontent.com/u/8186664?s=460&v=4"/> }
    * */
  var logo: js.UndefOr[ReactNode | Element | (WithFalse[js.Function0[ReactNode | Element]])] = js.undefined
  
  /**
    * @name 处理 menuData 的数据，可以动态的控制数据
    * @see 尽量不要用异步数据来处理，否则可能造成更新不及时，如果异步数据推荐使用 menu.request 和 params。
    *
    * @example 删除一些菜单 menuDataRender=((menuData) => { return menuData.filter(item => item.name !== 'test') })
    * @example 增加一些菜单 menuDataRender={(menuData) => { return menuData.concat({ path: '/test', name: '测试', icon: 'smile' }) }}
    * @example 修改菜单 menuDataRender={(menuData) => { return menuData.map(item => { if (item.name === 'test') { item.name = '测试' } return item }) }}
    * @example 打平数据 menuDataRender={(menuData) => { return menuData.reduce((pre, item) => { return pre.concat(item.children || []) }, []) }}
    */
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.undefined
  
  /**
    * @name 收起和展开的时候触发事件
    *
    * @example onCollapse=(collapsed)=>{ setCollapsed(collapsed) };
    */
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  
  /**
    * @name 页面切换的时候触发
    *
    * @example 获取切换的页面地址 onPageChange={(location) => { console.log("切换到："+location.pathname) }}
    *
    * */
  var onPageChange: js.UndefOr[
    js.Function1[
      /* location */ js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/typing.BasicRouteProps<std.Record<string, any>, @ant-design/pro-layout.@ant-design/pro-layout/es/typing.StaticContext, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationState * / any>['location'] */ js.Any) | Pathname
      ], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * @name 设置页面的标题
    * @example 根据页面的路由设置标题 pageTitleRender={(props) => { return props.location.pathname }}
    * @example 不显示标题 pageTitleRender={false}
    * @example 根据默认的标题设置 pageTitleRender={(props,defaultPageTitle) => { return defaultPageTitle + '这是一个测试标题' }}
    * @example 根据 info 来自己组合标题 pageTitleRender={(props,defaultPageTitle,info) => { return info.title + "-" + info.pageName }
    */
  var pageTitleRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ]
  ] = js.undefined
  
  /**
    * @name 简约模式，设置了之后不渲染的任何 layout 的东西，但是会有 context，可以获取到当前菜单。
    *
    * @example pure={true}
    */
  var pure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name  侧边菜单的类型, menu.type 的快捷方式
    * @type "sub" | "group"
    * @example group
    */
  var siderMenuType: js.UndefOr[sub | group] = js.undefined
  
  /** @name 水印的相关配置 */
  var waterMarkProps: js.UndefOr[WaterMarkProps] = js.undefined
}
object ActionRef {
  
  inline def apply(): ActionRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionRef]
  }
  
  extension [Self <: ActionRef](x: Self) {
    
    inline def setActionRef(value: MutableRefObject[js.UndefOr[Reload]]): Self = StObject.set(x, "actionRef", value.asInstanceOf[js.Any])
    
    inline def setActionRefUndefined: Self = StObject.set(x, "actionRef", js.undefined)
    
    inline def setBgLayoutImgList(value: js.Array[Bottom]): Self = StObject.set(x, "bgLayoutImgList", value.asInstanceOf[js.Any])
    
    inline def setBgLayoutImgListUndefined: Self = StObject.set(x, "bgLayoutImgList", js.undefined)
    
    inline def setBgLayoutImgListVarargs(value: Bottom*): Self = StObject.set(x, "bgLayoutImgList", js.Array(value*))
    
    inline def setBreadcrumbProps(value: BreadcrumbProps & LayoutBreadcrumbProps): Self = StObject.set(x, "breadcrumbProps", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbPropsUndefined: Self = StObject.set(x, "breadcrumbProps", js.undefined)
    
    inline def setBreadcrumbRender(
      value: WithFalse[
          js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
        ]
    ): Self = StObject.set(x, "breadcrumbRender", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbRenderFunction1(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction1(value))
    
    inline def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
    
    inline def setErrorBoundary(value: Any): Self = StObject.set(x, "ErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def setErrorBoundaryUndefined: Self = StObject.set(x, "ErrorBoundary", js.undefined)
    
    inline def setFooterRender(value: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
    
    inline def setFooterRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
    
    inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
    
    inline def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
    
    inline def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    inline def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    inline def setItemRender(
      value: (/* route */ Route, /* params */ Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
    ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
    
    inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLocale(value: LocaleType): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogo(value: ReactNode | Element | (WithFalse[js.Function0[ReactNode | Element]])): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoFunction0(value: () => ReactNode | Element): Self = StObject.set(x, "logo", js.Any.fromFunction0(value))
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setMenuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): Self = StObject.set(x, "menuDataRender", js.Any.fromFunction1(value))
    
    inline def setMenuDataRenderUndefined: Self = StObject.set(x, "menuDataRender", js.undefined)
    
    inline def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
    
    inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
    
    inline def setOnPageChange(
      value: /* location */ js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/es/typing.BasicRouteProps<std.Record<string, any>, @ant-design/pro-layout.@ant-design/pro-layout/es/typing.StaticContext, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationState * / any>['location'] */ js.Any) | Pathname
        ] => Unit
    ): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
    
    inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
    
    inline def setPageTitleRender(
      value: WithFalse[
          js.Function3[
            /* props */ GetPageTitleProps, 
            /* defaultPageTitle */ js.UndefOr[String], 
            /* info */ js.UndefOr[Id], 
            String
          ]
        ]
    ): Self = StObject.set(x, "pageTitleRender", value.asInstanceOf[js.Any])
    
    inline def setPageTitleRenderFunction3(
      value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
    ): Self = StObject.set(x, "pageTitleRender", js.Any.fromFunction3(value))
    
    inline def setPageTitleRenderUndefined: Self = StObject.set(x, "pageTitleRender", js.undefined)
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setSiderMenuType(value: sub | group): Self = StObject.set(x, "siderMenuType", value.asInstanceOf[js.Any])
    
    inline def setSiderMenuTypeUndefined: Self = StObject.set(x, "siderMenuType", js.undefined)
    
    inline def setWaterMarkProps(value: WaterMarkProps): Self = StObject.set(x, "waterMarkProps", value.asInstanceOf[js.Any])
    
    inline def setWaterMarkPropsUndefined: Self = StObject.set(x, "waterMarkProps", js.undefined)
  }
}
