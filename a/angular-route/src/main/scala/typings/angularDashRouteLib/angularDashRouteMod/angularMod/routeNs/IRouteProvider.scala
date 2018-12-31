package typings
package angularDashRouteLib.angularDashRouteMod.angularMod.routeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
    * Match routes without being case sensitive
    *
    * This option defaults to false. If the option is set to true, then the particular route can be matched without being case sensitive
    */
  var caseInsensitiveMatch: js.UndefOr[scala.Boolean] = js.native
  /**
    * Sets route definition that will be used on route change when no other route definition is matched.
    *
    * @params Mapping information to be assigned to $route.current.
    */
  def otherwise(params: IRoute): IRouteProvider = js.native
  def otherwise(params: java.lang.String): IRouteProvider = js.native
  /**
    * Adds a new route definition to the $route service.
    *
    * @param path Route path (matched against $location.path). If $location.path contains redundant trailing slash or is missing one, the route will still match and the $location.path will be updated to add or drop the trailing slash to exactly match the route definition.
    *
    * - path can contain named groups starting with a colon: e.g. :name. All characters up to the next slash are matched and stored in $routeParams under the given name when the route matches.
    * - path can contain named groups starting with a colon and ending with a star: e.g.:name*. All characters are eagerly stored in $routeParams under the given name when the route matches.
    * - path can contain optional named groups with a question mark: e.g.:name?.
    *
    * For example, routes like /color/:color/largecode/:largecode*\/edit will match /color/brown/largecode/code/with/slashes/edit and extract: color: brown and largecode: code/with/slashes.
    *
    * @param route Mapping information to be assigned to $route.current on route match.
    */
  def when(path: java.lang.String, route: IRoute): IRouteProvider = js.native
}

