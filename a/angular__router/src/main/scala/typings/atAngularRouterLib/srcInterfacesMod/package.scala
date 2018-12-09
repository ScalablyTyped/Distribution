package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcInterfacesMod {
  type CanActivateChildFn = js.Function2[
    /* childRoute */ atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
    /* state */ atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, 
    (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  ]
  type CanActivateFn = js.Function2[
    /* route */ atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
    /* state */ atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, 
    (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  ]
  type CanDeactivateFn[T] = js.Function4[
    /* component */ T, 
    /* currentRoute */ atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot, 
    /* currentState */ atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot, 
    /* nextState */ js.UndefOr[atAngularRouterLib.srcRouterUnderscoreStateMod.RouterStateSnapshot], 
    (rxjsLib.rxjsMod.Observable[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | (js.Promise[scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree]) | scala.Boolean | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  ]
  type CanLoadFn = js.Function2[
    /* route */ atAngularRouterLib.srcConfigMod.Route, 
    /* segments */ js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment], 
    rxjsLib.rxjsMod.Observable[scala.Boolean] | js.Promise[scala.Boolean] | scala.Boolean
  ]
}
