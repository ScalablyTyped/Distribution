package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMod {
  
  trait LinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var to: LocationDescriptor[LocationState]
  }
  object LinkProps {
    
    inline def apply(to: LocationDescriptor[LocationState]): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuDataItem
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * @name 子菜单
      */
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    /**
      * @name disable 菜单选项
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 隐藏自己，并且将子节点提升到与自己平级
      */
    var flatMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 在菜单中隐藏子节点
      */
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 在菜单中隐藏自己和子节点
      */
    var hideInMenu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @name 菜单的icon
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * @name 用于标定选中的值，默认是 path
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * @name 自定义菜单的国际化 key
      */
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * @name 菜单的名字
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * @name 自定义父节点
      * @description 当此节点被选中的时候也会选中 parentKeys 的节点
      */
    var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @name 路径
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object MenuDataItem {
    
    inline def apply(): MenuDataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDataItem]
    }
    
    extension [Self <: MenuDataItem](x: Self) {
      
      inline def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlatMenu(value: Boolean): Self = StObject.set(x, "flatMenu", value.asInstanceOf[js.Any])
      
      inline def setFlatMenuUndefined: Self = StObject.set(x, "flatMenu", js.undefined)
      
      inline def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
      
      inline def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
      
      inline def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
      
      inline def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
      
      inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value :_*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: js.Any
  }
  object MessageDescriptor {
    
    inline def apply(id: js.Any): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    extension [Self <: MessageDescriptor](x: Self) {
      
      inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Route
    extends StObject
       with MenuDataItem {
    
    var routes: js.UndefOr[js.Array[Route]] = js.undefined
  }
  object Route {
    
    inline def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  /* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
  trait RouterTypes[P] extends StObject {
    
    var computedMatch: js.UndefOr[`match`[P]] = js.undefined
    
    var history: History[LocationState]
    
    var location: Location[LocationState] | Pathname
    
    var `match`: typings.reactRouter.mod.`match`[js.Object]
    
    var route: js.UndefOr[Route] = js.undefined
    
    var staticContext: js.UndefOr[StaticContext] = js.undefined
  }
  object RouterTypes {
    
    inline def apply[P](
      history: History[LocationState],
      location: Location[LocationState] | Pathname,
      `match`: `match`[js.Object]
    ): RouterTypes[P] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterTypes[P]]
    }
    
    extension [Self <: RouterTypes[?], P](x: Self & RouterTypes[P]) {
      
      inline def setComputedMatch(value: `match`[P]): Self = StObject.set(x, "computedMatch", value.asInstanceOf[js.Any])
      
      inline def setComputedMatchUndefined: Self = StObject.set(x, "computedMatch", js.undefined)
      
      inline def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: `match`[js.Object]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setStaticContext(value: StaticContext): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
      
      inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
    }
  }
  
  type WithFalse[T] = T | `false`
}
