package typings.angularRouter.mod

import typings.angularCommon.mod.Location
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModuleFactoryLoader
import typings.angularCore.mod.Type
import typings.angularRouter.angularRouterStrings.always
import typings.angularRouter.angularRouterStrings.corrected
import typings.angularRouter.angularRouterStrings.deferred
import typings.angularRouter.angularRouterStrings.eager
import typings.angularRouter.angularRouterStrings.emptyOnly
import typings.angularRouter.angularRouterStrings.ignore
import typings.angularRouter.angularRouterStrings.legacy
import typings.angularRouter.angularRouterStrings.reload
import typings.rxjs.mod.Observable_
import typings.std.URIError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "Router")
@js.native
class Router protected () extends js.Object {
  def this(
    rootComponentType: Null,
    urlSerializer: UrlSerializer,
    rootContexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: Routes
  ) = this()
  /**
    * Creates the router service.
    */
  def this(
    rootComponentType: Type[_],
    urlSerializer: UrlSerializer,
    rootContexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    config: Routes
  ) = this()
  var browserUrlTree: js.Any = js.native
  var config: Routes = js.native
  var configLoader: js.Any = js.native
  var console: js.Any = js.native
  var currentNavigation: js.Any = js.native
  var currentUrlTree: js.Any = js.native
  /**
    * A handler for navigation errors in this NgModule.
    */
  @JSName("errorHandler")
  var errorHandler_Original: ErrorHandler = js.native
  /**
    * An event stream for routing events in this NgModule.
    */
  val events: Observable_[Event] = js.native
  var getTransition: js.Any = js.native
  var isNgZoneEnabled: js.Any = js.native
  var lastSuccessfulId: js.Any = js.native
  var lastSuccessfulNavigation: js.Any = js.native
  var location: js.Any = js.native
  var locationSubscription: js.Any = js.native
  /**
    * True if at least one navigation event has occurred,
    * false otherwise.
    */
  var navigated: Boolean = js.native
  var navigationId: js.Any = js.native
  var navigations: js.Any = js.native
  var ngModule: js.Any = js.native
  /**
    * How to handle a navigation request to the current URL. One of:
    * - `'ignore'` :  The router ignores the request.
    * - `'reload'` : The router reloads the URL. Use to implement a "refresh" feature.
    */
  var onSameUrlNavigation: reload | ignore = js.native
  /**
    * How to merge parameters, data, and resolved data from parent to child
    * routes. One of:
    *
    * - `'emptyOnly'` : Inherit parent parameters, data, and resolved data
    * for path-less or component-less routes.
    * - `'always'` : Inherit parent parameters, data, and resolved data
    * for all child routes.
    */
  var paramsInheritanceStrategy: emptyOnly | always = js.native
  var processNavigations: js.Any = js.native
  var rawUrlTree: js.Any = js.native
  /**
    * Enables a bug fix that corrects relative link resolution in components with empty paths.
    * @see `RouterModule`
    */
  var relativeLinkResolution: legacy | corrected = js.native
  var removeEmptyProps: js.Any = js.native
  var resetStateAndUrl: js.Any = js.native
  var resetUrlToCurrentUrlTree: js.Any = js.native
  var rootComponentType: js.Any = js.native
  var rootContexts: js.Any = js.native
  /**
    * A strategy for re-using routes.
    */
  var routeReuseStrategy: RouteReuseStrategy = js.native
  /**
    * The current state of routing in this NgModule.
    */
  val routerState: RouterState = js.native
  var scheduleNavigation: js.Any = js.native
  var setBrowserUrl: js.Any = js.native
  var setTransition: js.Any = js.native
  var setupNavigations: js.Any = js.native
  val transitions: js.Any = js.native
  /** The current URL. */
  val url: String = js.native
  /**
    * A strategy for extracting and merging URLs.
    * Used for AngularJS to Angular migrations.
    */
  var urlHandlingStrategy: UrlHandlingStrategy = js.native
  var urlSerializer: js.Any = js.native
  /**
    * Determines when the router updates the browser URL.
    * By default (`"deferred"`), updates the browser URL after navigation has finished.
    * Set to `'eager'` to update the browser URL at the beginning of navigation.
    * You can choose to update early so that, if navigation fails,
    * you can show an error message with the URL that failed.
    */
  var urlUpdateStrategy: deferred | eager = js.native
  /**
    * Applies an array of commands to the current URL tree and creates a new URL tree.
    *
    * When given an activated route, applies the given commands starting from the route.
    * Otherwise, applies the given command starting from the root.
    *
    * @param commands An array of commands to apply.
    * @param navigationExtras Options that control the navigation strategy.
    * @returns The new URL tree.
    *
    * @usageNotes
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
    * // If the first segment can contain slashes, and you do not want the router to split it,
    * // you can do the following:
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
  def createUrlTree(commands: js.Array[_]): UrlTree = js.native
  def createUrlTree(commands: js.Array[_], navigationExtras: NavigationExtras): UrlTree = js.native
  /** Disposes of the router. */
  def dispose(): Unit = js.native
  /**
    * A handler for navigation errors in this NgModule.
    */
  def errorHandler(error: js.Any): js.Any = js.native
  /** The current Navigation object if one exists */
  def getCurrentNavigation(): Navigation | Null = js.native
  /**
    * Sets up the location change listener and performs the initial navigation.
    */
  def initialNavigation(): Unit = js.native
  /** Returns whether the url is activated */
  def isActive(url: String, exact: Boolean): Boolean = js.native
  def isActive(url: UrlTree, exact: Boolean): Boolean = js.native
  /**
    * A handler for errors thrown by `Router.parseUrl(url)`
    * when `url` contains an invalid character.
    * The most common case is a `%` sign
    * that's not encoded and is not part of a percent encoded sequence.
    */
  def malformedUriErrorHandler(error: URIError, urlSerializer: UrlSerializer, url: String): UrlTree = js.native
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
  def navigate(commands: js.Array[_]): js.Promise[Boolean] = js.native
  def navigate(commands: js.Array[_], extras: NavigationExtras): js.Promise[Boolean] = js.native
  /**
    * Navigate based on the provided URL, which must be absolute.
    *
    * @param url An absolute URL. The function does not apply any delta to the current URL.
    * @param extras An object containing properties that modify the navigation strategy.
    * The function ignores any properties in the `NavigationExtras` that would change the
    * provided URL.
    *
    * @returns A Promise that resolves to 'true' when navigation succeeds,
    * to 'false' when navigation fails, or is rejected on error.
    *
    * @usageNotes
    *
    * ```
    * router.navigateByUrl("/team/33/user/11");
    *
    * // Navigate without updating the URL
    * router.navigateByUrl("/team/33/user/11", { skipLocationChange: true });
    * ```
    *
    */
  def navigateByUrl(url: String): js.Promise[Boolean] = js.native
  def navigateByUrl(url: String, extras: NavigationExtras): js.Promise[Boolean] = js.native
  def navigateByUrl(url: UrlTree): js.Promise[Boolean] = js.native
  def navigateByUrl(url: UrlTree, extras: NavigationExtras): js.Promise[Boolean] = js.native
  /** @docsNotRequired */
  def ngOnDestroy(): Unit = js.native
  /** Parses a string into a `UrlTree` */
  def parseUrl(url: String): UrlTree = js.native
  /**
    * Resets the configuration used for navigation and generating links.
    *
    * @param config The route array for the new configuration.
    *
    * @usageNotes
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
  def resetConfig(config: Routes): Unit = js.native
  /** Serializes a `UrlTree` into a string */
  def serializeUrl(url: UrlTree): String = js.native
  /**
    * Sets up the location change listener.
    */
  def setUpLocationChangeListener(): Unit = js.native
}

