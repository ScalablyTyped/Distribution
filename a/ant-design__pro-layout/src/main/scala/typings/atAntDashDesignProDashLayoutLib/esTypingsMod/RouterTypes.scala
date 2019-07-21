package typings
package atAntDashDesignProDashLayoutLib.esTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
trait RouterTypes[P] extends js.Object {
  var computedMatch: js.UndefOr[reactDashRouterLib.reactDashRouterMod.`match`[P]] = js.undefined
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname
  var `match`: reactDashRouterLib.reactDashRouterMod.`match`[js.Object]
  var route: js.UndefOr[Route] = js.undefined
  var staticContext: js.UndefOr[reactDashRouterLib.reactDashRouterMod.StaticContext] = js.undefined
}

object RouterTypes {
  @scala.inline
  def apply[P](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname,
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[js.Object],
    computedMatch: reactDashRouterLib.reactDashRouterMod.`match`[P] = null,
    route: Route = null,
    staticContext: reactDashRouterLib.reactDashRouterMod.StaticContext = null
  ): RouterTypes[P] = {
    val __obj = js.Dynamic.literal(history = history, location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`)
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch)
    if (route != null) __obj.updateDynamic("route")(route)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    __obj.asInstanceOf[RouterTypes[P]]
  }
}

