package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typingsMod.Route
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
@js.native
trait PartialRouterTypesRoute extends StObject {
  
  var computedMatch: js.UndefOr[`match`[Route]] = js.native
  
  var history: js.UndefOr[History[LocationState]] = js.native
  
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.native
  
  var `match`: js.UndefOr[typings.reactRouter.mod.`match`[js.Object]] = js.native
  
  var route: js.UndefOr[Route] = js.native
  
  var staticContext: js.UndefOr[StaticContext] = js.native
}
object PartialRouterTypesRoute {
  
  @scala.inline
  def apply(): PartialRouterTypesRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterTypesRoute]
  }
  
  @scala.inline
  implicit class PartialRouterTypesRouteMutableBuilder[Self <: PartialRouterTypesRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedMatch(value: `match`[Route]): Self = StObject.set(x, "computedMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedMatchUndefined: Self = StObject.set(x, "computedMatch", js.undefined)
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMatch(value: `match`[js.Object]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setStaticContext(value: StaticContext): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
