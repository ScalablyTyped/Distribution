package typings
package atAngularRouterLib.srcRouterUnderscoreStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_state", "ActivatedRoute")
@js.native
class ActivatedRoute () extends js.Object {
  /** The children of this route in the router state tree */
  val children: js.Array[ActivatedRoute] = js.native
  /** The component of the route. It's a constant */
  var component: atAngularCoreLib.srcTypeMod.Type[_] | java.lang.String | scala.Null = js.native
  /** An observable of the static and resolved data of this route. */
  var data: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcConfigMod.Data] = js.native
  /** The first child of this route in the router state tree */
  val firstChild: ActivatedRoute | scala.Null = js.native
  /** An observable of the URL fragment shared by all the routes */
  var fragment: rxjsLib.rxjsMod.Observable[java.lang.String] = js.native
  /** The outlet name of the route. It's a constant */
  var outlet: java.lang.String = js.native
  val paramMap: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcSharedMod.ParamMap] = js.native
  /** An observable of the matrix parameters scoped to this route */
  var params: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcSharedMod.Params] = js.native
  /** The parent of this route in the router state tree */
  val parent: ActivatedRoute | scala.Null = js.native
  /** The path from the root of the router state tree to this route */
  val pathFromRoot: js.Array[ActivatedRoute] = js.native
  val queryParamMap: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcSharedMod.ParamMap] = js.native
  /** An observable of the query parameters shared by all the routes */
  var queryParams: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcSharedMod.Params] = js.native
  /** The root of the router state */
  val root: ActivatedRoute = js.native
  /** The configuration used to match this route */
  val routeConfig: atAngularRouterLib.srcConfigMod.Route | scala.Null = js.native
  /** The current snapshot of this route */
  var snapshot: ActivatedRouteSnapshot = js.native
  /** An observable of the URL segments matched by this route */
  var url: rxjsLib.rxjsMod.Observable[js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]] = js.native
}

