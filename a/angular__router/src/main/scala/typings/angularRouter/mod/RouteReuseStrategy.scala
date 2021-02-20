package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouteReuseStrategy")
@js.native
abstract class RouteReuseStrategy () extends StObject {
  
  /** Retrieves the previously stored route */
  def retrieve(route: ActivatedRouteSnapshot): DetachedRouteHandle | Null = js.native
  
  /** Determines if this route (and its subtree) should be reattached */
  def shouldAttach(route: ActivatedRouteSnapshot): Boolean = js.native
  
  /** Determines if this route (and its subtree) should be detached to be reused later */
  def shouldDetach(route: ActivatedRouteSnapshot): Boolean = js.native
  
  /** Determines if a route should be reused */
  def shouldReuseRoute(future: ActivatedRouteSnapshot, curr: ActivatedRouteSnapshot): Boolean = js.native
  
  /**
    * Stores the detached route.
    *
    * Storing a `null` value should erase the previously stored value.
    */
  def store(route: ActivatedRouteSnapshot): Unit = js.native
  def store(route: ActivatedRouteSnapshot, handle: DetachedRouteHandle): Unit = js.native
}
