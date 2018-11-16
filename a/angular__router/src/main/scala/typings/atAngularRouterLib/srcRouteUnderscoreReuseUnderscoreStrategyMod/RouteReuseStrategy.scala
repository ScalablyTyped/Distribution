package typings
package atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/route_reuse_strategy", "RouteReuseStrategy")
@js.native
abstract class RouteReuseStrategy () extends js.Object {
  /** Retrieves the previously stored route */
  def retrieve(route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot): DetachedRouteHandle | scala.Null = js.native
  /** Determines if this route (and its subtree) should be reattached */
  def shouldAttach(route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot): scala.Boolean = js.native
  /** Determines if this route (and its subtree) should be detached to be reused later */
  def shouldDetach(route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot): scala.Boolean = js.native
  /** Determines if a route should be reused */
  def shouldReuseRoute(
    future: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    curr: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot
  ): scala.Boolean = js.native
  /**
       * Stores the detached route.
       *
       * Storing a `null` value should erase the previously stored value.
       */
  def store(route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot): scala.Unit = js.native
  /**
       * Stores the detached route.
       *
       * Storing a `null` value should erase the previously stored value.
       */
  def store(
    route: atAngularRouterLib.srcRouterUnderscoreStateMod.ActivatedRouteSnapshot,
    handle: DetachedRouteHandle
  ): scala.Unit = js.native
}

