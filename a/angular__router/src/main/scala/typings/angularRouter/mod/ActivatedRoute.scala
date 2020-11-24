package typings.angularRouter.mod

import typings.angularCore.mod.Type
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "ActivatedRoute")
@js.native
class ActivatedRoute () extends js.Object {
  
  /** The children of this route in the router state tree. */
  def children: js.Array[ActivatedRoute] = js.native
  
  /** The component of the route, a constant. */
  var component: Type[_] | String | Null = js.native
  
  /** An observable of the static and resolved data of this route. */
  var data: Observable_[Data] = js.native
  
  /** The first child of this route in the router state tree. */
  def firstChild: ActivatedRoute | Null = js.native
  
  /** An observable of the URL fragment shared by all the routes. */
  var fragment: Observable_[String] = js.native
  
  /** The outlet name of the route, a constant. */
  var outlet: String = js.native
  
  /**
    * An Observable that contains a map of the required and optional parameters
    * specific to the route.
    * The map supports retrieving single and multiple values from the same parameter.
    */
  def paramMap: Observable_[ParamMap] = js.native
  
  /** An observable of the matrix parameters scoped to this route. */
  var params: Observable_[Params] = js.native
  
  /** The parent of this route in the router state tree. */
  def parent: ActivatedRoute | Null = js.native
  
  /** The path from the root of the router state tree to this route. */
  def pathFromRoot: js.Array[ActivatedRoute] = js.native
  
  /**
    * An Observable that contains a map of the query parameters available to all routes.
    * The map supports retrieving single and multiple values from the query parameter.
    */
  def queryParamMap: Observable_[ParamMap] = js.native
  
  /** An observable of the query parameters shared by all the routes. */
  var queryParams: Observable_[Params] = js.native
  
  /** The root of the router state. */
  def root: ActivatedRoute = js.native
  
  /** The configuration used to match this route. */
  def routeConfig: Route | Null = js.native
  
  /** The current snapshot of this route */
  var snapshot: ActivatedRouteSnapshot = js.native
  
  /** An observable of the URL segments matched by this route. */
  var url: Observable_[js.Array[UrlSegment]] = js.native
}
