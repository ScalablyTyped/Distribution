package typings
package atAntDashDesignProDashLayoutLib.libTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> ]: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>[P]} */ trait RouterTypes[P] extends js.Object {
  var computedMatch: js.UndefOr[reactDashRouterLib.reactDashRouterMod.`match`[P]] = js.undefined
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname
  var route: js.UndefOr[Route] = js.undefined
}

object RouterTypes {
  @scala.inline
  def apply[P](
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | atAntDashDesignProDashLayoutLib.Anon_Pathname,
    computedMatch: reactDashRouterLib.reactDashRouterMod.`match`[P] = null,
    route: Route = null
  ): RouterTypes[P] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (computedMatch != null) __obj.updateDynamic("computedMatch")(computedMatch)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[RouterTypes[P]]
  }
}

