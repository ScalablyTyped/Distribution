package typings.antDesignProLayout.typingsMod

import typings.antDesignProLayout.anon.Pathname
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.StaticContext
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
@js.native
trait RouterTypes[P] extends js.Object {
  
  var computedMatch: js.UndefOr[`match`[P]] = js.native
  
  var history: History[LocationState] = js.native
  
  var location: Location[LocationState] | Pathname = js.native
  
  var `match`: typings.reactRouter.mod.`match`[js.Object] = js.native
  
  var route: js.UndefOr[Route] = js.native
  
  var staticContext: js.UndefOr[StaticContext] = js.native
}
object RouterTypes {
  
  @scala.inline
  def apply[P](
    history: History[LocationState],
    location: Location[LocationState] | Pathname,
    `match`: `match`[js.Object]
  ): RouterTypes[P] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterTypes[P]]
  }
  
  @scala.inline
  implicit class RouterTypesOps[Self <: RouterTypes[_], P] (val x: Self with RouterTypes[P]) extends AnyVal {
    
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: `match`[js.Object]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedMatch(value: `match`[P]): Self = this.set("computedMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputedMatch: Self = this.set("computedMatch", js.undefined)
    
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
