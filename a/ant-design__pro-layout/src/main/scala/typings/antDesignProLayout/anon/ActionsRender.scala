package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.lg
import typings.antDesignProLayout.antDesignProLayoutStrings.md
import typings.antDesignProLayout.antDesignProLayoutStrings.sm
import typings.antDesignProLayout.antDesignProLayoutStrings.xl
import typings.antDesignProLayout.antDesignProLayoutStrings.xs
import typings.antDesignProLayout.antDesignProLayoutStrings.xxl
import typings.antDesignProLayout.esComponentsAppsLogoComponentsMod.AppsLogoComponentsAppList
import typings.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typings.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.SiderMenuProps
import typings.antDesignProLayout.esTypingMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsRender extends StObject {
  
  /** Layout的操作功能列表，不同的 layout 会放到不同的位置 */
  var actionsRender: js.UndefOr[WithFalse[js.Function1[/* props */ HeaderViewProps, js.Array[ReactNode]]]] = js.undefined
  
  /** 相关品牌的列表 */
  var appList: js.UndefOr[AppsLogoComponentsAppList] = js.undefined
  
  /** 头像的设置 */
  var avatarProps: js.UndefOr[WithFalse[AvatarPropstitleReactNode]] = js.undefined
  
  /**
    * @name 菜单是否收起的断点，设置成false 可以禁用
    *
    * @example 禁用断点  breakpoint={false}
    * @example 最小的屏幕再收起 breakpoint={"xs"}
    */
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl | `false`] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * @name 自定义展开收起按钮的渲染
    *
    * @example 使用文字渲染 collapsedButtonRender={(collapsed)=>collapsed?"展开":"收起"})}
    * @example 使用icon渲染 collapsedButtonRender={(collapsed)=>collapsed?<MenuUnfoldOutlined />:<MenuFoldOutlined />}
    * @example 不渲染按钮 collapsedButtonRender={false}
    */
  var collapsedButtonRender: js.UndefOr[
    WithFalse[
      js.Function2[
        /* collapsed */ js.UndefOr[Boolean], 
        /* defaultDom */ js.UndefOr[ReactNode], 
        ReactNode
      ]
    ]
  ] = js.undefined
  
  var getContainer: js.UndefOr[`false`] = js.undefined
  
  var hide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 侧边菜单底部的一些快捷链接
    *
    * @example links={[<a href="ant.design"> 访问官网 </a>,<a href="help.ant.design"> 帮助 </a>]}
    */
  var links: js.UndefOr[js.Array[ReactNode]] = js.undefined
  
  /** 品牌logo的标识 */
  var logo: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * @name 侧边菜单的logo的样式，可以调整下大小
    *
    * @example 设置logo的大小为 42px logoStyle={{width: '42px', height: '42px'}}
    */
  var logoStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * @name  侧边菜单，菜单区域的处理,可以单独处理菜单的dom
    *
    * @example 增加菜单区域的背景颜色 menuContentRender={(props,defaultDom)=><div style={{backgroundColor:"red"}}>{defaultDom}</div>}
    * @example 某些情况下不显示菜单 menuContentRender={(props)=> return <div>不显示菜单</div>}
    */
  var menuContentRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ SiderMenuProps, /* defaultDom */ ReactNode, ReactNode]]
  ] = js.undefined
  
  /**
    * @name 侧边菜单 title 和 logo 下面区域的渲染，一般会增加个搜索框
    *
    * @example  增加一个搜索框 menuExtraRender={()=>(<Search placeholder="请输入" />)}
    * @example  根据收起展开配置不同的 dom： menuExtraRender={()=>collapsed? null : <Search placeholder="请输入" />}
    */
  var menuExtraRender: js.UndefOr[WithFalse[js.Function1[/* props */ SiderMenuProps, ReactNode]]] = js.undefined
  
  /**
    * @name 侧边菜单底部的配置，可以增加一些底部操作
    *
    * @example 底部增加超链接 menuFooterRender={()=><a href="https://pro.ant.design">pro.ant.design</a>}
    * @example 根据收起展开配置不同的 dom  menuFooterRender={()=>collapsed? null :<a href="https://pro.ant.design">pro.ant.design</a>}
    */
  var menuFooterRender: js.UndefOr[WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactNode]]] = js.undefined
  
  /**
    * @name  菜单 logo 和 title 区域的渲染
    *
    * @example 不要logo : menuHeaderRender={(logo,title)=> title}
    * @example 不要title : menuHeaderRender={(logo,title)=> logo}
    * @example 展开的时候显示title,收起显示 logo： menuHeaderRender={(logo,title,props)=> props.collapsed ? logo : title}
    * @example 不要这个区域了 : menuHeaderRender={false}
    */
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[SiderMenuProps], 
        ReactNode
      ]
    ]
  ] = js.undefined
  
  /**
    * @name 菜单顶部logo 和 title 区域的点击事件
    *
    * @example 点击跳转到首页 onMenuHeaderClick={()=>{ history.push('/') }}
    */
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.undefined
  
  /**
    * @deprecated
    * 使用 actionsRender 和 avatarProps 代替
    */
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]] = js.undefined
  
  /** 菜单的宽度 */
  var siderWidth: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ActionsRender {
  
  inline def apply(): ActionsRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsRender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionsRender] (val x: Self) extends AnyVal {
    
    inline def setActionsRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, js.Array[ReactNode]]]): Self = StObject.set(x, "actionsRender", value.asInstanceOf[js.Any])
    
    inline def setActionsRenderFunction1(value: /* props */ HeaderViewProps => js.Array[ReactNode]): Self = StObject.set(x, "actionsRender", js.Any.fromFunction1(value))
    
    inline def setActionsRenderUndefined: Self = StObject.set(x, "actionsRender", js.undefined)
    
    inline def setAppList(value: AppsLogoComponentsAppList): Self = StObject.set(x, "appList", value.asInstanceOf[js.Any])
    
    inline def setAppListUndefined: Self = StObject.set(x, "appList", js.undefined)
    
    inline def setAppListVarargs(value: Desc*): Self = StObject.set(x, "appList", js.Array(value*))
    
    inline def setAvatarProps(value: WithFalse[AvatarPropstitleReactNode]): Self = StObject.set(x, "avatarProps", value.asInstanceOf[js.Any])
    
    inline def setAvatarPropsUndefined: Self = StObject.set(x, "avatarProps", js.undefined)
    
    inline def setBreakpoint(value: xs | sm | md | lg | xl | xxl | `false`): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapsedButtonRender(
      value: WithFalse[
          js.Function2[
            /* collapsed */ js.UndefOr[Boolean], 
            /* defaultDom */ js.UndefOr[ReactNode], 
            ReactNode
          ]
        ]
    ): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
    
    inline def setCollapsedButtonRenderFunction2(value: (/* collapsed */ js.UndefOr[Boolean], /* defaultDom */ js.UndefOr[ReactNode]) => ReactNode): Self = StObject.set(x, "collapsedButtonRender", js.Any.fromFunction2(value))
    
    inline def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
    
    inline def setGetContainer(value: `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
    
    inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLinks(value: js.Array[ReactNode]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: ReactNode*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setLogo(value: ReactNode): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoStyle(value: CSSProperties): Self = StObject.set(x, "logoStyle", value.asInstanceOf[js.Any])
    
    inline def setLogoStyleUndefined: Self = StObject.set(x, "logoStyle", js.undefined)
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setMenuContentRender(value: WithFalse[js.Function2[/* props */ SiderMenuProps, /* defaultDom */ ReactNode, ReactNode]]): Self = StObject.set(x, "menuContentRender", value.asInstanceOf[js.Any])
    
    inline def setMenuContentRenderFunction2(value: (/* props */ SiderMenuProps, /* defaultDom */ ReactNode) => ReactNode): Self = StObject.set(x, "menuContentRender", js.Any.fromFunction2(value))
    
    inline def setMenuContentRenderUndefined: Self = StObject.set(x, "menuContentRender", js.undefined)
    
    inline def setMenuExtraRender(value: WithFalse[js.Function1[/* props */ SiderMenuProps, ReactNode]]): Self = StObject.set(x, "menuExtraRender", value.asInstanceOf[js.Any])
    
    inline def setMenuExtraRenderFunction1(value: /* props */ SiderMenuProps => ReactNode): Self = StObject.set(x, "menuExtraRender", js.Any.fromFunction1(value))
    
    inline def setMenuExtraRenderUndefined: Self = StObject.set(x, "menuExtraRender", js.undefined)
    
    inline def setMenuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactNode]]): Self = StObject.set(x, "menuFooterRender", value.asInstanceOf[js.Any])
    
    inline def setMenuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => ReactNode): Self = StObject.set(x, "menuFooterRender", js.Any.fromFunction1(value))
    
    inline def setMenuFooterRenderUndefined: Self = StObject.set(x, "menuFooterRender", js.undefined)
    
    inline def setMenuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ ReactNode, 
            /* title */ ReactNode, 
            /* props */ js.UndefOr[SiderMenuProps], 
            ReactNode
          ]
        ]
    ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
    
    inline def setMenuHeaderRenderFunction3(
      value: (/* logo */ ReactNode, /* title */ ReactNode, /* props */ js.UndefOr[SiderMenuProps]) => ReactNode
    ): Self = StObject.set(x, "menuHeaderRender", js.Any.fromFunction3(value))
    
    inline def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
    
    inline def setOnMenuHeaderClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1(value))
    
    inline def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
    
    inline def setOnOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
    
    inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    inline def setRightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, ReactNode]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
    
    inline def setRightContentRenderFunction1(value: /* props */ HeaderViewProps => ReactNode): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
    
    inline def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
    
    inline def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
    
    inline def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
