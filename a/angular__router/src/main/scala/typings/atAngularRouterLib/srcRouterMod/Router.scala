package typings
package atAngularRouterLib.srcRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router", "Router")
@js.native
class Router protected () extends js.Object {
  /**
    * Creates the router service.
    */
  def this(rootComponentType: atAngularCoreLib.srcTypeMod.Type[_], urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer, rootContexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts, location: atAngularCommonLib.commonMod.Location, injector: atAngularCoreLib.coreMod.Injector, loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.coreMod.Compiler, config: atAngularRouterLib.srcConfigMod.Routes) = this()
  def this(rootComponentType: scala.Null, urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer, rootContexts: atAngularRouterLib.srcRouterUnderscoreOutletUnderscoreContextMod.ChildrenOutletContexts, location: atAngularCommonLib.commonMod.Location, injector: atAngularCoreLib.coreMod.Injector, loader: atAngularCoreLib.coreMod.NgModuleFactoryLoader, compiler: atAngularCoreLib.coreMod.Compiler, config: atAngularRouterLib.srcConfigMod.Routes) = this()
  var config: atAngularRouterLib.srcConfigMod.Routes = js.native
  var configLoader: js.Any = js.native
  var console: js.Any = js.native
  var currentNavigation: js.Any = js.native
  var currentUrlTree: js.Any = js.native
  /**
    * Error handler that is invoked when a navigation errors.
    *
    * See `ErrorHandler` for more information.
    */
  @JSName("errorHandler")
  var errorHandler_Original: ErrorHandler = js.native
  val events: rxjsLib.rxjsMod.Observable[atAngularRouterLib.srcEventsMod.Event] = js.native
  var getTransition: js.Any = js.native
  var isNgZoneEnabled: js.Any = js.native
  var lastSuccessfulId: js.Any = js.native
  var lastSuccessfulNavigation: js.Any = js.native
  var location: js.Any = js.native
  var locationSubscription: js.Any = js.native
  /**
    * Indicates if at least one navigation happened.
    */
  var navigated: scala.Boolean = js.native
  var navigationId: js.Any = js.native
  var navigations: js.Any = js.native
  var ngModule: js.Any = js.native
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * By default, the router will ignore this navigation. However, this prevents features such
    * as a "refresh" button. Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: atAngularRouterLib.atAngularRouterLibStrings.reload | atAngularRouterLib.atAngularRouterLibStrings.ignore = js.native
  /**
    * Defines how the router merges params, data and resolved data from parent to child
    * routes. Available options are:
    *
    * - `'emptyOnly'`, the default, only inherits parent params for path-less or component-less
    *   routes.
    * - `'always'`, enables unconditional inheritance of parent params.
    */
  var paramsInheritanceStrategy: atAngularRouterLib.atAngularRouterLibStrings.emptyOnly | atAngularRouterLib.atAngularRouterLibStrings.always = js.native
  var processNavigations: js.Any = js.native
  var rawUrlTree: js.Any = js.native
  /**
    * See {@link RouterModule} for more information.
    */
  var relativeLinkResolution: atAngularRouterLib.atAngularRouterLibStrings.legacy | atAngularRouterLib.atAngularRouterLibStrings.corrected = js.native
  var removeEmptyProps: js.Any = js.native
  var resetStateAndUrl: js.Any = js.native
  var resetUrlToCurrentUrlTree: js.Any = js.native
  var rootComponentType: js.Any = js.native
  var rootContexts: js.Any = js.native
  var routeReuseStrategy: atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.RouteReuseStrategy = js.native
  val routerState: atAngularRouterLib.srcRouterUnderscoreStateMod.RouterState = js.native
  var scheduleNavigation: js.Any = js.native
  var setBrowserUrl: js.Any = js.native
  var setTransition: js.Any = js.native
  var setupNavigations: js.Any = js.native
  val transitions: js.Any = js.native
  /** The current url */
  val url: java.lang.String = js.native
  /**
    * Extracts and merges URLs. Used for AngularJS to Angular migrations.
    */
  var urlHandlingStrategy: atAngularRouterLib.srcUrlUnderscoreHandlingUnderscoreStrategyMod.UrlHandlingStrategy = js.native
  var urlSerializer: js.Any = js.native
  /**
    * Defines when the router updates the browser URL. The default behavior is to update after
    * successful navigation. However, some applications may prefer a mode where the URL gets
    * updated at the beginning of navigation. The most common use case would be updating the
    * URL early so if navigation fails, you can show an error message with the URL that failed.
    * Available options are:
    *
    * - `'deferred'`, the default, updates the browser URL after navigation has finished.
    * - `'eager'`, updates browser URL at the beginning of navigation.
    */
  var urlUpdateStrategy: atAngularRouterLib.atAngularRouterLibStrings.deferred | atAngularRouterLib.atAngularRouterLibStrings.eager = js.native
  /**
    * Applies an array of commands to the current url tree and creates a new url tree.
    *
    * When given an activate route, applies the given commands starting from the route.
    * When not given a route, applies the given command starting from the root.
    *
    * @usageNotes
    *
    * ### Example
    *
    * ```
    * // create /team/33/user/11
    * router.createUrlTree(['/team', 33, 'user', 11]);
    *
    * // create /team/33;expand=true/user/11
    * router.createUrlTree(['/team', 33, {expand: true}, 'user', 11]);
    *
    * // you can collapse static segments like this (this works only with the first passed-in value):
    * router.createUrlTree(['/team/33/user', userId]);
    *
    * // If the first segment can contain slashes, and you do not want the router to split it, you
    * // can do the following:
    *
    * router.createUrlTree([{segmentPath: '/one/two'}]);
    *
    * // create /team/33/(user/11//right:chat)
    * router.createUrlTree(['/team', 33, {outlets: {primary: 'user/11', right: 'chat'}}]);
    *
    * // remove the right secondary node
    * router.createUrlTree(['/team', 33, {outlets: {primary: 'user/11', right: null}}]);
    *
    * // assuming the current url is `/team/33/user/11` and the route points to `user/11`
    *
    * // navigate to /team/33/user/11/details
    * router.createUrlTree(['details'], {relativeTo: route});
    *
    * // navigate to /team/33/user/22
    * router.createUrlTree(['../22'], {relativeTo: route});
    *
    * // navigate to /team/44/user/22
    * router.createUrlTree(['../../team/44/user/22'], {relativeTo: route});
    * ```
    */
  def createUrlTree(commands: js.Array[_]): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  def createUrlTree(commands: js.Array[_], navigationExtras: NavigationExtras): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  /** Disposes of the router */
  def dispose(): scala.Unit = js.native
  /**
    * Error handler that is invoked when a navigation errors.
    *
    * See `ErrorHandler` for more information.
    */
  def errorHandler(error: js.Any): js.Any = js.native
  /** The current Navigation object if one exists */
  def getCurrentNavigation(): Navigation | scala.Null = js.native
  /**
    * Sets up the location change listener and performs the initial navigation.
    */
  def initialNavigation(): scala.Unit = js.native
  def isActive(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree, exact: scala.Boolean): scala.Boolean = js.native
  /** Returns whether the url is activated */
  def isActive(url: java.lang.String, exact: scala.Boolean): scala.Boolean = js.native
  /**
    * Malformed uri error handler is invoked when `Router.parseUrl(url)` throws an
    * error due to containing an invalid character. The most common case would be a `%` sign
    * that's not encoded and is not part of a percent encoded sequence.
    */
  def malformedUriErrorHandler(
    error: stdLib.URIError,
    urlSerializer: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSerializer,
    url: java.lang.String
  ): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  /**
    * Navigate based on the provided array of commands and a starting point.
    * If no starting route is provided, the navigation is absolute.
    *
    * Returns a promise that:
    * - resolves to 'true' when navigation succeeds,
    * - resolves to 'false' when navigation fails,
    * - is rejected when an error happens.
    *
    * @usageNotes
    *
    * ### Example
    *
    * ```
    * router.navigate(['team', 33, 'user', 11], {relativeTo: route});
    *
    * // Navigate without updating the URL
    * router.navigate(['team', 33, 'user', 11], {relativeTo: route, skipLocationChange: true});
    * ```
    *
    * The first parameter of `navigate()` is a delta to be applied to the current URL
    * or the one provided in the `relativeTo` property of the second parameter (the
    * `NavigationExtras`).
    *
    * In order to affect this browser's `history.state` entry, the `state`
    * parameter can be passed. This must be an object because the router
    * will add the `navigationId` property to this object before creating
    * the new history item.
    */
  def navigate(commands: js.Array[_]): js.Promise[scala.Boolean] = js.native
  def navigate(commands: js.Array[_], extras: NavigationExtras): js.Promise[scala.Boolean] = js.native
  def navigateByUrl(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): js.Promise[scala.Boolean] = js.native
  def navigateByUrl(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree, extras: NavigationExtras): js.Promise[scala.Boolean] = js.native
  /**
    * Navigate based on the provided url. This navigation is always absolute.
    *
    * Returns a promise that:
    * - resolves to 'true' when navigation succeeds,
    * - resolves to 'false' when navigation fails,
    * - is rejected when an error happens.
    *
    * @usageNotes
    *
    * ### Example
    *
    * ```
    * router.navigateByUrl("/team/33/user/11");
    *
    * // Navigate without updating the URL
    * router.navigateByUrl("/team/33/user/11", { skipLocationChange: true });
    * ```
    *
    * Since `navigateByUrl()` takes an absolute URL as the first parameter,
    * it will not apply any delta to the current URL and ignores any properties
    * in the second parameter (the `NavigationExtras`) that would change the
    * provided URL.
    */
  def navigateByUrl(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def navigateByUrl(url: java.lang.String, extras: NavigationExtras): js.Promise[scala.Boolean] = js.native
  /** @docsNotRequired */
  def ngOnDestroy(): scala.Unit = js.native
  /** Parses a string into a `UrlTree` */
  def parseUrl(url: java.lang.String): atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree = js.native
  /**
    * Resets the configuration used for navigation and generating links.
    *
    * @usageNotes
    *
    * ### Example
    *
    * ```
    * router.resetConfig([
    *  { path: 'team/:id', component: TeamCmp, children: [
    *    { path: 'simple', component: SimpleCmp },
    *    { path: 'user/:name', component: UserCmp }
    *  ]}
    * ]);
    * ```
    */
  def resetConfig(config: atAngularRouterLib.srcConfigMod.Routes): scala.Unit = js.native
  /** Serializes a `UrlTree` into a string */
  def serializeUrl(url: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree): java.lang.String = js.native
  /**
    * Sets up the location change listener.
    */
  def setUpLocationChangeListener(): scala.Unit = js.native
}

