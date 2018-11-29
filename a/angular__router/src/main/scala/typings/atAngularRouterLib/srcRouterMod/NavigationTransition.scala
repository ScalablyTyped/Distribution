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
  var promise: stdLib.Promise[scala.Boolean]
  var rawUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  var reject: js.Any
  var resolve: js.Any
  var source: atAngularRouterLib.srcEventsMod.NavigationTrigger
  var state: atAngularRouterLib.Anon_NavigationId | scala.Null
  var targetRouterState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState | scala.Null
  var targetSnapshot: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot | scala.Null
  var urlAfterRedirects: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
}

