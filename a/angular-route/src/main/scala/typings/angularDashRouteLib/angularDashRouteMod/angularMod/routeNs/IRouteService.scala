package typings
package angularDashRouteLib.angularDashRouteMod.angularMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// RouteService
// see http://docs.angularjs.org/api/ngRoute.$route
// see http://docs.angularjs.org/api/ngRoute.$routeProvider
///////////////////////////////////////////////////////////////////////////
trait IRouteService extends js.Object {
  // May not always be available. For instance, current will not be available
  // to a controller that was not initialized as a result of a route maching.
  var current: js.UndefOr[ICurrentRoute] = js.undefined
  var routes: js.Any
  def reload(): scala.Unit
  /**
    * Causes $route service to update the current URL, replacing current route parameters with those specified in newParams.
    * Provided property names that match the route's path segment definitions will be interpolated into the
    * location's path, while remaining properties will be treated as query params.
    *
    * @param newParams Object.<string, string> mapping of URL parameter names to values
    */
  def updateParams(newParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit
}

object IRouteService {
  @scala.inline
  def apply(
    reload: () => scala.Unit,
    routes: js.Any,
    updateParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] => scala.Unit,
    current: ICurrentRoute = null
  ): IRouteService = {
    val __obj = js.Dynamic.literal(reload = js.Any.fromFunction0(reload), routes = routes, updateParams = js.Any.fromFunction1(updateParams))
    if (current != null) __obj.updateDynamic("current")(current)
    __obj.asInstanceOf[IRouteService]
  }
}

