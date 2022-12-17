package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.history.mod.History
import typings.history.mod.Location
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLAnchorElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypingMod {
  
  trait BasicRouteProps[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */, C /* <: StaticContext */, S] extends StObject {
    
    var history: History
    
    var location: Location
    
    var `match`: typings.antDesignProLayout.esTypingMod.`match`[Params]
    
    var staticContext: js.UndefOr[C] = js.undefined
  }
  object BasicRouteProps {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */, C /* <: StaticContext */, S](history: History, location: Location, `match`: `match`[Params]): BasicRouteProps[Params, C, S] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicRouteProps[Params, C, S]]
    }
    
    extension [Self <: BasicRouteProps[?, ?, ?], Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */, C /* <: StaticContext */, S](x: Self & (BasicRouteProps[Params, C, S])) {
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: `match`[Params]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setStaticContext(value: C): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
      
      inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
  }
  object LinkProps {
    
    inline def apply(
      to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
    ): LinkProps = {
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
      
      inline def setTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuDataItem
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** @name 子菜单 */
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    /** @name disable 菜单选项 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** @name 隐藏自己，并且将子节点提升到与自己平级 */
    var flatMenu: js.UndefOr[Boolean] = js.undefined
    
    /** @name 在菜单中隐藏子节点 */
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
    
    /** @name 在菜单中隐藏自己和子节点 */
    var hideInMenu: js.UndefOr[Boolean] = js.undefined
    
    /** @name 菜单的icon */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /** @name 用于标定选中的值，默认是 path */
    var key: js.UndefOr[String] = js.undefined
    
    /** @name 自定义菜单的国际化 key */
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    /** @name 菜单的名字 */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * 当此节点被选中的时候也会选中 parentKeys 的节点
      *
      * @name 自定义父节点
      */
    var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @name 路径,可以设定为网页链接 */
    var path: js.UndefOr[String] = js.undefined
    
    var routes: Unit
    
    /** @name 指定外链打开形式，同a标签 */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * menuItem 的 tooltip 显示的路径
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object MenuDataItem {
    
    inline def apply(routes: Unit): MenuDataItem = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuDataItem]
    }
    
    extension [Self <: MenuDataItem](x: Self) {
      
      inline def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value*))
      
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
      
      inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRoutes(value: Unit): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: Any
  }
  object MessageDescriptor {
    
    inline def apply(id: Any): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    extension [Self <: MessageDescriptor](x: Self) {
      
      inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@ant-design/pro-layout.@ant-design/pro-layout/es/typing.MenuDataItem, 'routes'> & {  children :std.Array<@ant-design/pro-layout.@ant-design/pro-layout/es/typing.Route> | undefined} */
  trait Route extends StObject {
    
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var flatMenu: js.UndefOr[Boolean] = js.undefined
    
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.undefined
    
    var hideInMenu: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parentKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object Route {
    
    inline def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value*))
      
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
      
      inline def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* Inlined {  computedMatch :@ant-design/pro-layout.@ant-design/pro-layout/es/typing.match<any> | undefined,   route :@ant-design/pro-layout.@ant-design/pro-layout/es/typing.Route | undefined,   location :@ant-design/pro-layout.@ant-design/pro-layout/es/typing.BasicRouteProps<std.Record<string, any>, @ant-design/pro-layout.@ant-design/pro-layout/es/typing.StaticContext, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationState * / any>['location'] | {  pathname :string | undefined}} & std.Omit<@ant-design/pro-layout.@ant-design/pro-layout/es/typing.BasicRouteProps<std.Record<string, any>, @ant-design/pro-layout.@ant-design/pro-layout/es/typing.StaticContext, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationState * / any>, 'location'> */
  trait RouterTypes extends StObject {
    
    var computedMatch: js.UndefOr[`match`[Any]] = js.undefined
    
    var history: History
    
    var location: Location | Pathname
    
    var `match`: typings.antDesignProLayout.esTypingMod.`match`[Record[String, Any]]
    
    var route: js.UndefOr[Route] = js.undefined
    
    var staticContext: js.UndefOr[StaticContext] = js.undefined
  }
  object RouterTypes {
    
    inline def apply(history: History, location: Location | Pathname, `match`: `match`[Record[String, Any]]): RouterTypes = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterTypes]
    }
    
    extension [Self <: RouterTypes](x: Self) {
      
      inline def setComputedMatch(value: `match`[Any]): Self = StObject.set(x, "computedMatch", value.asInstanceOf[js.Any])
      
      inline def setComputedMatchUndefined: Self = StObject.set(x, "computedMatch", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: `match`[Record[String, Any]]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setStaticContext(value: StaticContext): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
      
      inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
    }
  }
  
  trait StaticContext extends StObject {
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object StaticContext {
    
    inline def apply(): StaticContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticContext]
    }
    
    extension [Self <: StaticContext](x: Self) {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type WithFalse[T] = T | `false`
  
  trait `match`[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */] extends StObject {
    
    var isExact: Boolean
    
    var params: Params
    
    var path: String
    
    var url: String
  }
  object `match` {
    
    inline def apply[Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](isExact: Boolean, params: Params, path: String, url: String): `match`[Params] = {
      val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[`match`[Params]]
    }
    
    extension [Self <: `match`[?], Params /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Params ]:? string} */ js.Any */](x: Self & `match`[Params]) {
      
      inline def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
