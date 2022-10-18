package typings.antDesignProLayout.anon

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.antDesignProLayoutStrings.group
import typings.antDesignProLayout.antDesignProLayoutStrings.sub
import typings.std.Record
import typings.umijsRouteUtils.distTypesMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClose extends StObject {
  
  /**
    * @name 取消自动关闭菜单
    */
  var autoClose: js.UndefOr[`false`] = js.undefined
  
  /**
    * 收起时也展示 分组菜单的标题
    */
  var collapsedShowGroupTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 收起时也展示标题
    */
  var collapsedShowTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 默认打开所有的菜单
    */
  var defaultOpenAll: js.UndefOr[Boolean] = js.undefined
  
  var hideMenuWhenCollapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 是否忽略用户手动折叠过的菜单状态，如选择忽略，折叠按钮切换之后也可实现展开所有菜单
    */
  var ignoreFlatMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 菜单的 loading 配置
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 菜单国际化的配置
    */
  var locale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @name 菜单的 loading 发生改变
    */
  var onLoadingChange: js.UndefOr[js.Function1[/* loading */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /**
    * @name 菜单远程请求时用的参数，只有 params 变化才会重新触发 request
    *
    */
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * @name 菜单远程请求的方法，只有 params 变化才会重新触发 request
    */
  var request: js.UndefOr[
    js.Function2[
      /* params */ Record[String, Any], 
      /* defaultMenuData */ js.Array[MenuDataItem], 
      js.Promise[js.Array[MenuDataItem]]
    ]
  ] = js.undefined
  
  /**
    * @name 菜单聚合的模式
    */
  var `type`: js.UndefOr[sub | group] = js.undefined
}
object AutoClose {
  
  inline def apply(): AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClose]
  }
  
  extension [Self <: AutoClose](x: Self) {
    
    inline def setAutoClose(value: `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setCollapsedShowGroupTitle(value: Boolean): Self = StObject.set(x, "collapsedShowGroupTitle", value.asInstanceOf[js.Any])
    
    inline def setCollapsedShowGroupTitleUndefined: Self = StObject.set(x, "collapsedShowGroupTitle", js.undefined)
    
    inline def setCollapsedShowTitle(value: Boolean): Self = StObject.set(x, "collapsedShowTitle", value.asInstanceOf[js.Any])
    
    inline def setCollapsedShowTitleUndefined: Self = StObject.set(x, "collapsedShowTitle", js.undefined)
    
    inline def setDefaultOpenAll(value: Boolean): Self = StObject.set(x, "defaultOpenAll", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenAllUndefined: Self = StObject.set(x, "defaultOpenAll", js.undefined)
    
    inline def setHideMenuWhenCollapsed(value: Boolean): Self = StObject.set(x, "hideMenuWhenCollapsed", value.asInstanceOf[js.Any])
    
    inline def setHideMenuWhenCollapsedUndefined: Self = StObject.set(x, "hideMenuWhenCollapsed", js.undefined)
    
    inline def setIgnoreFlatMenu(value: Boolean): Self = StObject.set(x, "ignoreFlatMenu", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFlatMenuUndefined: Self = StObject.set(x, "ignoreFlatMenu", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLocale(value: Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOnLoadingChange(value: /* loading */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onLoadingChange", js.Any.fromFunction1(value))
    
    inline def setOnLoadingChangeUndefined: Self = StObject.set(x, "onLoadingChange", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequest(
      value: (/* params */ Record[String, Any], /* defaultMenuData */ js.Array[MenuDataItem]) => js.Promise[js.Array[MenuDataItem]]
    ): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setType(value: sub | group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
