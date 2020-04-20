package typings.angularRoute.mod.angularAugmentingMod.route

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouteProvider extends IServiceProvider {
  /**
    * Match routes without being case sensitive
    *
    * This option defaults to false. If the option is set to true, then the particular route can be matched without being case sensitive
    */
  var caseInsensitiveMatch: js.UndefOr[Boolean] = js.native
  /**
    * Call this method as a getter (i.e. without any arguments) to get the current value of the eagerInstantiationEnabled flag.
    */
  def eagerInstantiationEnabled(): Boolean = js.native
  /**
    * Call this method as a setter to enable/disable eager instantiation of the $route service upon application bootstrap.
    *
    * Instantiating $route early is necessary for capturing the initial $locationChangeStart event and navigating to the appropriate route. Usually, $route is instantiated in time by the ngView directive. Yet, in cases where ngView is included in an asynchronously loaded template (e.g. in another directive's template), the directive factory might not be called soon enough for $route to be instantiated before the initial $locationChangeSuccess event is fired. Eager instantiation ensures that $route is always instantiated in time, regardless of when ngView will be loaded.
    *
    * The default value is true.
    *
    * @param enabled If provided, update the internal eagerInstantiationEnabled flag.
    */
  def eagerInstantiationEnabled(enabled: Boolean): IRouteProvider = js.native
  def otherwise(params: String): IRouteProvider = js.native
  /**
    * Sets route definition that will be used on route change when no other route definition is matched.
    *
    * @params Mapping information to be assigned to $route.current.
    */
  def otherwise(params: IRoute): IRouteProvider = js.native
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
  def when(path: String, route: IRoute): IRouteProvider = js.native
}

