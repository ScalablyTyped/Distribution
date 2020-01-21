package typings.angularRoute.mod.angularAugmentingMod.route

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see http://docs.angularjs.org/api/ngRoute/provider/$routeProvider#when for API documentation
  */
trait IRoute extends js.Object {
  /**
    * {boolean=false}
    * Match routes without being case sensitive.
    * If the option is set to `true`, then the particular route can be matched without being case sensitive.
    *
    * Defaults to `false`.
    */
  var caseInsensitiveMatch: js.UndefOr[Boolean] = js.undefined
  /**
    * {(string|Function)=}
    * Controller fn that should be associated with newly created scope or the name of a registered controller if passed as a string.
    */
  var controller: js.UndefOr[String | InlineAnnotatedFunction] = js.undefined
  /**
    * A controller alias name. If present the controller will be published to scope under the controllerAs name.
    */
  var controllerAs: js.UndefOr[String] = js.undefined
  /**
    * {(string|Function)=}
    * Value to update `$location` path with and trigger route redirection.
    *
    * If `redirectTo` is a function, it will be called with the following parameters:
    *
    * - `{Object.<string>}` - route parameters extracted from the current `$location.path()` by applying the
    *   current route templateUrl.
    * - `{string}` - current `$location.path()`
    * - `{Object}` - current `$location.search()`
    *
    * The custom `redirectTo` function is expected to return a string which will be used to update
    * `$location.url()`. If the function throws an error, no further processing will take place and the
    * `$routeChangeError` event will be fired.
    *
    * Routes that specify `redirectTo` will not have their controllers, template functions or resolves called,
    * the `$location` will be changed to the redirect url and route processing will stop. The exception to this
    * is if the `redirectTo` is a function that returns `undefined`. In this case the route transition occurs
    * as though there was no redirection.
    */
  var redirectTo: js.UndefOr[
    String | (js.Function3[
      /* $routeParams */ js.UndefOr[IRouteParamsService], 
      /* $locationPath */ js.UndefOr[String], 
      /* $locationSearch */ js.UndefOr[js.Any], 
      String
    ])
  ] = js.undefined
  /**
    * {boolean=true}
    * Reload route when only `$location.search()` or `$location.hash()` changes.
    *
    * If the option is set to `false` and the URL in the browser changes, then a `$routeUpdate` event is
    * broadcasted on the root scope (without reloading the route).
    *
    * > Note: This option has no effect if `reloadOnUrl` is set to `false`.
    *
    * Defaults to `true`.
    */
  var reloadOnSearch: js.UndefOr[Boolean] = js.undefined
  /**
    * {boolean=true}
    * Reload route when any part of the URL changes (including the path) even if the new URL maps to the same
    * route.
    *
    * If the option is set to `false` and the URL in the browser changes, but the new URL maps to the same
    * route, then a `$routeUpdate` event is broadcasted on the root scope (without reloading the route).
    *
    * Defaults to `true`.
    */
  var reloadOnUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * {Object.<string, Function>=}
    * An optional map of dependencies which should be injected into the controller. If any of these
    * dependencies are promises, the router will wait for them all to be resolved or one to be rejected before
    * the controller is instantiated.
    * If all the promises are resolved successfully, the values of the resolved promises are injected and
    * `$routeChangeSuccess` event is fired. If any of the promises are rejected the `$routeChangeError` event
    * is fired.
    * For easier access to the resolved dependencies from the template, the `resolve` map will be available on
    * the scope of the route, under `$resolve` (by default) or a custom name specified by the `resolveAs`
    * property (see below). This can be particularly useful, when working with components as route templates.
    *
    * > **Note:** If your scope already contains a property with this name, it will be hidden or overwritten.
    * > Make sure, you specify an appropriate name for this property, that does not collide with other
    * > properties on the scope.
    *
    * The map object is:
    *
    * - `key` – `{string}`: a name of a dependency to be injected into the controller.
    * - `factory` - `{string|Function}`: If `string` then it is an alias for a service. Otherwise if function,
    *   then it is called with `$injector#invoke()` and the return value is treated as the dependency. If the
    *   result is a promise, it is resolved before its value is injected into the controller. Be aware that
    *   `ngRoute.$routeParams` will still refer to the previous route within these resolve functions.  Use
    *   `$route.current.params` to access the new route parameters, instead.
    */
  var resolve: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * {string=}
    * The name under which the `resolve` map will be available on the scope of the route. If omitted, defaults
    * to `$resolve`.
    */
  var resolveAs: js.UndefOr[String] = js.undefined
  /**
    * {Function=}
    * A function that will (eventually) return the value to update `$location` URL with and trigger route
    * redirection. In contrast to `redirectTo`, dependencies can be injected into `resolveRedirectTo` and the
    * return value can be either a string or a promise that will be resolved to a string.
    *
    * Similar to `redirectTo`, if the return value is `undefined` (or a promise that gets resolved to
    * `undefined`), no redirection takes place and the route transition occurs as though there was no
    * redirection.
    *
    * If the function throws an error or the returned promise gets rejected, no further processing will take
    * place and the `$routeChangeError` event will be fired.
    *
    * `redirectTo` takes precedence over `resolveRedirectTo`, so specifying both on the same route definition,
    * will cause the latter to be ignored.
    */
  var resolveRedirectTo: js.UndefOr[
    Injectable[
      js.Function1[/* repeated */ _, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
    ]
  ] = js.undefined
  /**
    * {(string|Function)=}
    * Html template as a string or a function that returns an html template as a string which should be used by ngView or ngInclude directives. This property takes precedence over templateUrl.
    *
    * If template is a function, it will be called with the following parameters:
    *
    * {Array.<Object>} - route parameters extracted from the current $location.path() by applying the current route
    */
  var template: js.UndefOr[
    String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String])
  ] = js.undefined
  /**
    * {(string|Function)=}
    * Path or function that returns a path to an html template that should be used by ngView.
    *
    * If templateUrl is a function, it will be called with the following parameters:
    *
    * {Array.<Object>} - route parameters extracted from the current $location.path() by applying the current route
    */
  var templateUrl: js.UndefOr[
    String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String])
  ] = js.undefined
}

object IRoute {
  @scala.inline
  def apply(
    caseInsensitiveMatch: js.UndefOr[Boolean] = js.undefined,
    controller: String | InlineAnnotatedFunction = null,
    controllerAs: String = null,
    redirectTo: String | (js.Function3[
      /* $routeParams */ js.UndefOr[IRouteParamsService], 
      /* $locationPath */ js.UndefOr[String], 
      /* $locationSearch */ js.UndefOr[js.Any], 
      String
    ]) = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    reloadOnUrl: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[js.Any] = null,
    resolveAs: String = null,
    resolveRedirectTo: Injectable[
      js.Function1[/* repeated */ _, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
    ] = null,
    template: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String]) = null,
    templateUrl: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String]) = null
  ): IRoute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitiveMatch)) __obj.updateDynamic("caseInsensitiveMatch")(caseInsensitiveMatch.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnUrl)) __obj.updateDynamic("reloadOnUrl")(reloadOnUrl.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolveAs != null) __obj.updateDynamic("resolveAs")(resolveAs.asInstanceOf[js.Any])
    if (resolveRedirectTo != null) __obj.updateDynamic("resolveRedirectTo")(resolveRedirectTo.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
}

