package typings
package atAngularRouterLib.srcRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTransition extends js.Object {
  var currentRawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  var currentRouterState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState
  var currentSnapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot
  var currentUrlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  var extractedUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  var extras: NavigationExtras
  var guards: atAngularRouterLib.srcUtilsPreactivationMod.Checks
  var guardsResult: scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree | scala.Null
  var id: scala.Double
  var promise: js.Promise[scala.Boolean]
  var rawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  var reject: js.Any
  var resolve: js.Any
  var restoredState: RestoredState | scala.Null
  var source: atAngularRouterLib.srcEventsMod.NavigationTrigger
  var targetRouterState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState | scala.Null
  var targetSnapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot | scala.Null
  var urlAfterRedirects: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
}

object NavigationTransition {
  @scala.inline
  def apply(
    currentRawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    currentRouterState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState,
    currentSnapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot,
    currentUrlTree: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    extractedUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    extras: NavigationExtras,
    guards: atAngularRouterLib.srcUtilsPreactivationMod.Checks,
    id: scala.Double,
    promise: js.Promise[scala.Boolean],
    rawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    reject: js.Any,
    resolve: js.Any,
    source: atAngularRouterLib.srcEventsMod.NavigationTrigger,
    urlAfterRedirects: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree,
    guardsResult: scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = null,
    restoredState: RestoredState = null,
    targetRouterState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState = null,
    targetSnapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot = null
  ): NavigationTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentRawUrl")(currentRawUrl)
    __obj.updateDynamic("currentRouterState")(currentRouterState)
    __obj.updateDynamic("currentSnapshot")(currentSnapshot)
    __obj.updateDynamic("currentUrlTree")(currentUrlTree)
    __obj.updateDynamic("extractedUrl")(extractedUrl)
    __obj.updateDynamic("extras")(extras)
    __obj.updateDynamic("guards")(guards)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("promise")(promise)
    __obj.updateDynamic("rawUrl")(rawUrl)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("urlAfterRedirects")(urlAfterRedirects)
    if (guardsResult != null) __obj.updateDynamic("guardsResult")(guardsResult.asInstanceOf[js.Any])
    if (restoredState != null) __obj.updateDynamic("restoredState")(restoredState)
    if (targetRouterState != null) __obj.updateDynamic("targetRouterState")(targetRouterState)
    if (targetSnapshot != null) __obj.updateDynamic("targetSnapshot")(targetSnapshot)
    __obj.asInstanceOf[NavigationTransition]
  }
}

