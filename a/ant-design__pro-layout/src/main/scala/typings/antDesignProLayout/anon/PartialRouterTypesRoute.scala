package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typingsMod.Route
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>> */
@js.native
trait PartialRouterTypesRoute extends js.Object {
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
  implicit class PartialRouterTypesRouteOps[Self <: PartialRouterTypesRoute] (val x: Self) extends AnyVal {
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
    def setComputedMatch(value: `match`[Route]): Self = this.set("computedMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputedMatch: Self = this.set("computedMatch", js.undefined)
    @scala.inline
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMatch(value: `match`[js.Object]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setRoute(value: Route): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    @scala.inline
    def setStaticContext(value: StaticContext): Self = this.set("staticContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticContext: Self = this.set("staticContext", js.undefined)
  }
  
}

