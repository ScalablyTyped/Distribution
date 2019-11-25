package typings.atAntDashDesignProDashLayout.libTypingsMod

import typings.atAntDashDesignProDashLayout.Anon_Pathname
import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
trait RouterTypes[P] extends js.Object {
  var computedMatch: js.UndefOr[`match`[P]] = js.undefined
  var history: History[LocationState]
  var location: Location[LocationState] | Anon_Pathname
  var `match`: typings.reactDashRouter.reactDashRouterMod.`match`[js.Object]
  var route: js.UndefOr[Route] = js.undefined
  var staticContext: js.UndefOr[StaticContext] = js.undefined
}

object RouterTypes {
  @scala.inline
  def apply[P](
    history: History[LocationState],
    location: Location[LocationState] | Anon_Pathname,
    `match`: `match`[js.Object],
    computedMatch: `match`[P] = null,
    route: Route = null,
    staticContext: StaticContext = null
  ): RouterTypes[P] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterTypes[P]]
  }
}

