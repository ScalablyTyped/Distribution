package typings.angularRoute

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.IServiceProvider
import typings.angular.mod.Injectable
import typings.angular.mod.global.Function
import typings.angularRoute.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-route", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    ///////////////////////////////////////////////////////////////////////////////
    // ngRoute module (angular-route.js)
    ///////////////////////////////////////////////////////////////////////////////
    object route {
      
      // see http://docs.angularjs.org/api/ng.$route#current
      trait ICurrentRoute
        extends StObject
           with IRoute {
        
        var locals: Dictindex
        
        var params: js.Any
      }
      object ICurrentRoute {
        
        @scala.inline
        def apply(locals: Dictindex, params: js.Any): ICurrentRoute = {
          val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
          __obj.asInstanceOf[ICurrentRoute]
        }
        
        @scala.inline
        implicit class ICurrentRouteMutableBuilder[Self <: ICurrentRoute] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocals(value: Dictindex): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * see http://docs.angularjs.org/api/ngRoute/provider/$routeProvider#when for API documentation
        */
      trait IRoute extends StObject {
        
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
                  js.Function1[/* repeated */ js.Any, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
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
        def apply(): IRoute = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IRoute]
        }
        
        @scala.inline
        implicit class IRouteMutableBuilder[Self <: IRoute] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCaseInsensitiveMatch(value: Boolean): Self = StObject.set(x, "caseInsensitiveMatch", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCaseInsensitiveMatchUndefined: Self = StObject.set(x, "caseInsensitiveMatch", js.undefined)
          
          @scala.inline
          def setController(value: String | InlineAnnotatedFunction): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
          
          @scala.inline
          def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
          
          @scala.inline
          def setControllerVarargs(value: (String | Function)*): Self = StObject.set(x, "controller", js.Array(value :_*))
          
          @scala.inline
          def setRedirectTo(
            value: String | (js.Function3[
                      /* $routeParams */ js.UndefOr[IRouteParamsService], 
                      /* $locationPath */ js.UndefOr[String], 
                      /* $locationSearch */ js.UndefOr[js.Any], 
                      String
                    ])
          ): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRedirectToFunction3(
            value: (/* $routeParams */ js.UndefOr[IRouteParamsService], /* $locationPath */ js.UndefOr[String], /* $locationSearch */ js.UndefOr[js.Any]) => String
          ): Self = StObject.set(x, "redirectTo", js.Any.fromFunction3(value))
          
          @scala.inline
          def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
          
          @scala.inline
          def setReloadOnSearch(value: Boolean): Self = StObject.set(x, "reloadOnSearch", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReloadOnSearchUndefined: Self = StObject.set(x, "reloadOnSearch", js.undefined)
          
          @scala.inline
          def setReloadOnUrl(value: Boolean): Self = StObject.set(x, "reloadOnUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReloadOnUrlUndefined: Self = StObject.set(x, "reloadOnUrl", js.undefined)
          
          @scala.inline
          def setResolve(value: StringDictionary[js.Any]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolveAs(value: String): Self = StObject.set(x, "resolveAs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolveAsUndefined: Self = StObject.set(x, "resolveAs", js.undefined)
          
          @scala.inline
          def setResolveRedirectTo(
            value: Injectable[
                      js.Function1[/* repeated */ js.Any, js.UndefOr[IPromise[js.UndefOr[String]] | String]]
                    ]
          ): Self = StObject.set(x, "resolveRedirectTo", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolveRedirectToFunction1(value: /* repeated */ js.Any => js.UndefOr[IPromise[js.UndefOr[String]] | String]): Self = StObject.set(x, "resolveRedirectTo", js.Any.fromFunction1(value))
          
          @scala.inline
          def setResolveRedirectToUndefined: Self = StObject.set(x, "resolveRedirectTo", js.undefined)
          
          @scala.inline
          def setResolveRedirectToVarargs(
            value: (String | (js.Function1[/* repeated */ js.Any, js.UndefOr[IPromise[js.UndefOr[String]] | String]]))*
          ): Self = StObject.set(x, "resolveRedirectTo", js.Array(value :_*))
          
          @scala.inline
          def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
          
          @scala.inline
          def setTemplate(value: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplateFunction1(value: /* $routeParams */ js.UndefOr[IRouteParamsService] => String): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
          
          @scala.inline
          def setTemplateUrl(value: String | (js.Function1[/* $routeParams */ js.UndefOr[IRouteParamsService], String])): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplateUrlFunction1(value: /* $routeParams */ js.UndefOr[IRouteParamsService] => String): Self = StObject.set(x, "templateUrl", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        }
      }
      
      ///////////////////////////////////////////////////////////////////////////
      // RouteParamsService
      // see http://docs.angularjs.org/api/ngRoute.$routeParams
      ///////////////////////////////////////////////////////////////////////////
      type IRouteParamsService = StringDictionary[js.Any]
      
      @js.native
      trait IRouteProvider
        extends StObject
           with IServiceProvider {
        
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
      
      ///////////////////////////////////////////////////////////////////////////
      // RouteService
      // see http://docs.angularjs.org/api/ngRoute.$route
      // see http://docs.angularjs.org/api/ngRoute.$routeProvider
      ///////////////////////////////////////////////////////////////////////////
      trait IRouteService extends StObject {
        
        // May not always be available. For instance, current will not be available
        // to a controller that was not initialized as a result of a route maching.
        var current: js.UndefOr[ICurrentRoute] = js.undefined
        
        def reload(): Unit
        
        var routes: js.Any
        
        /**
          * Causes $route service to update the current URL, replacing current route parameters with those specified in newParams.
          * Provided property names that match the route's path segment definitions will be interpolated into the
          * location's path, while remaining properties will be treated as query params.
          *
          * @param newParams Object.<string, string> mapping of URL parameter names to values
          */
        def updateParams(newParams: StringDictionary[String]): Unit
      }
      object IRouteService {
        
        @scala.inline
        def apply(reload: () => Unit, routes: js.Any, updateParams: StringDictionary[String] => Unit): IRouteService = {
          val __obj = js.Dynamic.literal(reload = js.Any.fromFunction0(reload), routes = routes.asInstanceOf[js.Any], updateParams = js.Any.fromFunction1(updateParams))
          __obj.asInstanceOf[IRouteService]
        }
        
        @scala.inline
        implicit class IRouteServiceMutableBuilder[Self <: IRouteService] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCurrent(value: ICurrentRoute): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
          
          @scala.inline
          def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
          
          @scala.inline
          def setRoutes(value: js.Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUpdateParams(value: StringDictionary[String] => Unit): Self = StObject.set(x, "updateParams", js.Any.fromFunction1(value))
        }
      }
      
      type InlineAnnotatedFunction = Function | (js.Array[String | Function])
    }
  }
}
