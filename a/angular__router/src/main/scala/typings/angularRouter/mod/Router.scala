package typings.angularRouter.mod

import typings.angularCommon.mod.Location
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Injector
import typings.angularCore.mod.Type
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularRouter.angularRouterStrings.always
import typings.angularRouter.angularRouterStrings.computed
import typings.angularRouter.angularRouterStrings.corrected
import typings.angularRouter.angularRouterStrings.deferred
import typings.angularRouter.angularRouterStrings.eager
import typings.angularRouter.angularRouterStrings.emptyOnly
import typings.angularRouter.angularRouterStrings.ignore
import typings.angularRouter.angularRouterStrings.legacy
import typings.angularRouter.angularRouterStrings.reload
import typings.angularRouter.angularRouterStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "Router")
@js.native
open class Router protected () extends StObject {
  def this(
    rootComponentType: Null,
    urlSerializer: UrlSerializer,
    rootContexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    compiler: Compiler,
    config: Routes
  ) = this()
  /**
    * Creates the router service.
    */
  def this(
    rootComponentType: Type[Any],
    urlSerializer: UrlSerializer,
    rootContexts: ChildrenOutletContexts,
    location: Location,
    injector: Injector,
    compiler: Compiler,
    config: Routes
  ) = this()
  
  /**
    * The ɵrouterPageId of whatever page is currently active in the browser history. This is
    * important for computing the target page id for new navigations because we need to ensure each
    * page id in the browser history is 1 more than the previous entry.
    */
  /* private */ def browserPageId: Any = js.native
  
  /**
    * Meant to represent the part of the browser url that the `Router` is set up to handle (via the
    * `UrlHandlingStrategy`). This value is updated immediately after the browser url is updated (or
    * the browser url update is skipped via `skipLocationChange`). With that, note that
    * `browserUrlTree` _may not_ reflect the actual browser URL for two reasons:
    *
    * 1. `UrlHandlingStrategy` only handles part of the URL
    * 2. `skipLocationChange` does not update the browser url.
    *
    * So to reiterate, `browserUrlTree` only represents the Router's internal understanding of the
    * current route, either before guards with `urlUpdateStrategy === 'eager'` or right before
    * activation with `'deferred'`.
    *
    * This should match the `currentUrlTree` when the navigation succeeds.
    */
  /* private */ var browserUrlTree: Any = js.native
  
  /* private */ var cancelNavigationTransition: Any = js.native
  
  /**
    * Configures how the Router attempts to restore state when a navigation is cancelled.
    *
    * 'replace' - Always uses `location.replaceState` to set the browser state to the state of the
    * router before the navigation started. This means that if the URL of the browser is updated
    * _before_ the navigation is canceled, the Router will simply replace the item in history rather
    * than trying to restore to the previous location in the session history. This happens most
    * frequently with `urlUpdateStrategy: 'eager'` and navigations with the browser back/forward
    * buttons.
    *
    * 'computed' - Will attempt to return to the same index in the session history that corresponds
    * to the Angular route when the navigation gets cancelled. For example, if the browser back
    * button is clicked and the navigation is cancelled, the Router will trigger a forward navigation
    * and vice versa.
    *
    * Note: the 'computed' option is incompatible with any `UrlHandlingStrategy` which only
    * handles a portion of the URL because the history restoration navigates to the previous place in
    * the browser history rather than simply resetting a portion of the URL.
    *
    * The default value is `replace`.
    *
    */
  var canceledNavigationResolution: replace | computed = js.native
  
  var config: Routes = js.native
  
  /* private */ var configLoader: Any = js.native
  
  /* private */ var console: Any = js.native
  
  /**
    * Appends URL segments to the current URL tree to create a new URL tree.
    *
    * @param commands An array of URL fragments with which to construct the new URL tree.
    * If the path is static, can be the literal URL string. For a dynamic path, pass an array of path
    * segments, followed by the parameters for each segment.
    * The fragments are applied to the current URL tree or the one provided  in the `relativeTo`
    * property of the options object, if supplied.
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
    *
    * Note that a value of `null` or `undefined` for `relativeTo` indicates that the
    * tree should be created relative to the root.
    * ```
    */
  def createUrlTree(commands: js.Array[Any]): UrlTree = js.native
  def createUrlTree(commands: js.Array[Any], navigationExtras: UrlCreationOptions): UrlTree = js.native
  
  /* private */ var currentNavigation: Any = js.native
  
  /**
    * The id of the currently active page in the router.
    * Updated to the transition's target id on a successful navigation.
    *
    * This is used to track what page the router last activated. When an attempted navigation fails,
    * the router can then use this to compute how to restore the state back to the previously active
    * page.
    */
  /* private */ var currentPageId: Any = js.native
  
  /**
    * Represents the activated `UrlTree` that the `Router` is configured to handle (through
    * `UrlHandlingStrategy`). That is, after we find the route config tree that we're going to
    * activate, run guards, and are just about to activate the route, we set the currentUrlTree.
    *
    * This should match the `browserUrlTree` when a navigation succeeds. If the
    * `UrlHandlingStrategy.shouldProcessUrl` is `false`, only the `browserUrlTree` is updated.
    */
  /* private */ var currentUrlTree: Any = js.native
  
  /** Disposes of the router. */
  def dispose(): Unit = js.native
  
  /* private */ var disposed: Any = js.native
  
  /**
    * A handler for navigation errors in this NgModule.
    */
  def errorHandler(error: Any): Any = js.native
  /**
    * A handler for navigation errors in this NgModule.
    */
  @JSName("errorHandler")
  var errorHandler_Original: ErrorHandler = js.native
  
  /**
    * An event stream for routing events in this NgModule.
    */
  val events: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Event_2> */ Any = js.native
  
  /* private */ var generateNgRouterState: Any = js.native
  
  /**
    * Returns the current `Navigation` object when the router is navigating,
    * and `null` when idle.
    */
  def getCurrentNavigation(): Navigation | Null = js.native
  
  /**
    * Sets up the location change listener and performs the initial navigation.
    */
  def initialNavigation(): Unit = js.native
  
  /**
    * Returns whether the url is activated.
    *
    * @deprecated
    * Use `IsActiveMatchOptions` instead.
    *
    * - The equivalent `IsActiveMatchOptions` for `true` is
    * `{paths: 'exact', queryParams: 'exact', fragment: 'ignored', matrixParams: 'ignored'}`.
    * - The equivalent for `false` is
    * `{paths: 'subset', queryParams: 'subset', fragment: 'ignored', matrixParams: 'ignored'}`.
    */
  def isActive(url: String, exact: Boolean): Boolean = js.native
  /**
    * Returns whether the url is activated.
    */
  def isActive(url: String, matchOptions: IsActiveMatchOptions): Boolean = js.native
  def isActive(url: UrlTree, exact: Boolean): Boolean = js.native
  def isActive(url: UrlTree, matchOptions: IsActiveMatchOptions): Boolean = js.native
  
  /* private */ var isNgZoneEnabled: Any = js.native
  
  /* private */ var lastSuccessfulId: Any = js.native
  
  /* private */ var lastSuccessfulNavigation: Any = js.native
  
  /* private */ var location: Any = js.native
  
  /* private */ var locationSubscription: Any = js.native
  
  /**
    * A handler for errors thrown by `Router.parseUrl(url)`
    * when `url` contains an invalid character.
    * The most common case is a `%` sign
    * that's not encoded and is not part of a percent encoded sequence.
    */
  def malformedUriErrorHandler(error: js.URIError, urlSerializer: UrlSerializer, url: String): UrlTree = js.native
  
  /**
    * Navigate based on the provided array of commands and a starting point.
    * If no starting route is provided, the navigation is absolute.
    *
    * @param commands An array of URL fragments with which to construct the target URL.
    * If the path is static, can be the literal URL string. For a dynamic path, pass an array of path
    * segments, followed by the parameters for each segment.
    * The fragments are applied to the current URL or the one provided  in the `relativeTo` property
    * of the options object, if supplied.
    * @param extras An options object that determines how the URL should be constructed or
    *     interpreted.
    *
    * @returns A Promise that resolves to `true` when navigation succeeds, to `false` when navigation
    *     fails,
    * or is rejected on error.
    *
    * @usageNotes
    *
    * The following calls request navigation to a dynamic route path relative to the current URL.
    *
    * ```
    * router.navigate(['team', 33, 'user', 11], {relativeTo: route});
    *
    * // Navigate without updating the URL, overriding the default behavior
    * router.navigate(['team', 33, 'user', 11], {relativeTo: route, skipLocationChange: true});
    * ```
    *
    * @see [Routing and Navigation guide](guide/router)
    *
    */
  def navigate(commands: js.Array[Any]): js.Promise[Boolean] = js.native
  def navigate(commands: js.Array[Any], extras: NavigationExtras): js.Promise[Boolean] = js.native
  
  /**
    * Navigates to a view using an absolute route path.
    *
    * @param url An absolute path for a defined route. The function does not apply any delta to the
    *     current URL.
    * @param extras An object containing properties that modify the navigation strategy.
    *
    * @returns A Promise that resolves to 'true' when navigation succeeds,
    * to 'false' when navigation fails, or is rejected on error.
    *
    * @usageNotes
    *
    * The following calls request navigation to an absolute path.
    *
    * ```
    * router.navigateByUrl("/team/33/user/11");
    *
    * // Navigate without updating the URL
    * router.navigateByUrl("/team/33/user/11", { skipLocationChange: true });
    * ```
    *
    * @see [Routing and Navigation guide](guide/router)
    *
    */
  def navigateByUrl(url: String): js.Promise[Boolean] = js.native
  def navigateByUrl(url: String, extras: NavigationBehaviorOptions): js.Promise[Boolean] = js.native
  def navigateByUrl(url: UrlTree): js.Promise[Boolean] = js.native
  def navigateByUrl(url: UrlTree, extras: NavigationBehaviorOptions): js.Promise[Boolean] = js.native
  
  /**
    * True if at least one navigation event has occurred,
    * false otherwise.
    */
  var navigated: Boolean = js.native
  
  /* private */ var navigationId: Any = js.native
  
  /* private */ var navigations: Any = js.native
  
  /* private */ var ngModule: Any = js.native
  
  /** @nodoc */
  def ngOnDestroy(): Unit = js.native
  
  /**
    * How to handle a navigation request to the current URL. One of:
    *
    * - `'ignore'` :  The router ignores the request.
    * - `'reload'` : The router reloads the URL. Use to implement a "refresh" feature.
    *
    * Note that this only configures whether the Route reprocesses the URL and triggers related
    * action and events like redirects, guards, and resolvers. By default, the router re-uses a
    * component instance when it re-navigates to the same component type without visiting a different
    * component first. This behavior is configured by the `RouteReuseStrategy`. In order to reload
    * routed components on same url navigation, you need to set `onSameUrlNavigation` to `'reload'`
    * _and_ provide a `RouteReuseStrategy` which returns `false` for `shouldReuseRoute`.
    */
  var onSameUrlNavigation: reload | ignore = js.native
  
  /**
    * How to merge parameters, data, resolved data, and title from parent to child
    * routes. One of:
    *
    * - `'emptyOnly'` : Inherit parent parameters, data, and resolved data
    * for path-less or component-less routes.
    * - `'always'` : Inherit parent parameters, data, and resolved data
    * for all child routes.
    */
  var paramsInheritanceStrategy: emptyOnly | always = js.native
  
  /** Parses a string into a `UrlTree` */
  def parseUrl(url: String): UrlTree = js.native
  
  /* private */ var processNavigations: Any = js.native
  
  /**
    * Meant to represent the entire browser url after a successful navigation. In the life of a
    * navigation transition:
    * 1. The rawUrl represents the full URL that's being navigated to
    * 2. We apply redirects, which might only apply to _part_ of the URL (due to
    * `UrlHandlingStrategy`).
    * 3. Right before activation (because we assume activation will succeed), we update the
    * rawUrlTree to be a combination of the urlAfterRedirects (again, this might only apply to part
    * of the initial url) and the rawUrl of the transition (which was the original navigation url in
    * its full form).
    */
  /* private */ var rawUrlTree: Any = js.native
  
  /**
    * Enables a bug fix that corrects relative link resolution in components with empty paths.
    * @see `RouterModule`
    *
    * @deprecated
    */
  var relativeLinkResolution: legacy | corrected = js.native
  
  /* private */ var removeEmptyProps: Any = js.native
  
  /**
    * Resets the route configuration used for navigation and generating links.
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
  
  /* private */ var resetState: Any = js.native
  
  /* private */ var resetUrlToCurrentUrlTree: Any = js.native
  
  /**
    * Performs the necessary rollback action to restore the browser URL to the
    * state before the transition.
    */
  /* private */ var restoreHistory: Any = js.native
  
  /* private */ var rootComponentType: Any = js.native
  
  /* private */ var rootContexts: Any = js.native
  
  /**
    * A strategy for re-using routes.
    */
  var routeReuseStrategy: RouteReuseStrategy = js.native
  
  /**
    * The current state of routing in this NgModule.
    */
  val routerState: RouterState = js.native
  
  /* private */ var scheduleNavigation: Any = js.native
  
  /** Serializes a `UrlTree` into a string */
  def serializeUrl(url: UrlTree): String = js.native
  
  /* private */ var setBrowserUrl: Any = js.native
  
  /* private */ var setTransition: Any = js.native
  
  /**
    * Sets up the location change listener. This listener detects navigations triggered from outside
    * the Router (the browser back/forward buttons, for example) and schedules a corresponding Router
    * navigation so that the correct events, guards, etc. are triggered.
    */
  def setUpLocationChangeListener(): Unit = js.native
  
  /* private */ var setupNavigations: Any = js.native
  
  /**
    * A strategy for setting the title based on the `routerState`.
    */
  var titleStrategy: js.UndefOr[TitleStrategy] = js.native
  
  /* private */ val transitions: Any = js.native
  
  /** The current URL. */
  def url: String = js.native
  
  /**
    * A strategy for extracting and merging URLs.
    * Used for AngularJS to Angular migrations.
    */
  var urlHandlingStrategy: UrlHandlingStrategy = js.native
  
  /* private */ var urlSerializer: Any = js.native
  
  /**
    * Determines when the router updates the browser URL.
    * By default (`"deferred"`), updates the browser URL after navigation has finished.
    * Set to `'eager'` to update the browser URL at the beginning of navigation.
    * You can choose to update early so that, if navigation fails,
    * you can show an error message with the URL that failed.
    */
  var urlUpdateStrategy: deferred | eager = js.native
}
/* static members */
object Router {
  
  @JSImport("@angular/router", "Router")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "Router.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Router, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Router, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "Router.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Router] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Router]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
