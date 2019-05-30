package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouteReuseStrategy")
@js.native
abstract class RouteReuseStrategy () extends js.Object {
  /** Retrieves the previously stored route */
  def retrieve(route: ActivatedRouteSnapshot): DetachedRouteHandle | scala.Null = js.native
  /** Determines if this route (and its subtree) should be reattached */
  def shouldAttach(route: ActivatedRouteSnapshot): scala.Boolean = js.native
  /** Determines if this route (and its subtree) should be detached to be reused later */
  def shouldDetach(route: ActivatedRouteSnapshot): scala.Boolean = js.native
  /** Determines if a route should be reused */
  def shouldReuseRoute(future: ActivatedRouteSnapshot, curr: ActivatedRouteSnapshot): scala.Boolean = js.native
  def store(route: ActivatedRouteSnapshot): scala.Unit = js.native
  /**
    * Stores the detached route.
    *
    * Storing a `null` value should erase the previously stored value.
    */
  def store(route: ActivatedRouteSnapshot, handle: DetachedRouteHandle): scala.Unit = js.native
}

