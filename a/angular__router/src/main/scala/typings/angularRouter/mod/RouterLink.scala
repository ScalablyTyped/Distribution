package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularRouter.angularRouterBooleans.`true`
import typings.angularRouter.angularRouterStrings.`[routerLink]`
import typings.angularRouter.anon.Attribute
import typings.angularRouter.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  *
  * When applied to an element in a template, makes that element a link
  * that initiates navigation to a route. Navigation opens one or more routed components
  * in one or more `<router-outlet>` locations on the page.
  *
  * Given a route configuration `[{ path: 'user/:name', component: UserCmp }]`,
  * the following creates a static link to the route:
  * `<a routerLink="/user/bob">link to user component</a>`
  *
  * You can use dynamic values to generate the link.
  * For a dynamic link, pass an array of path segments,
  * followed by the params for each segment.
  * For example, `['/team', teamId, 'user', userName, {details: true}]`
  * generates a link to `/team/11/user/bob;details=true`.
  *
  * Multiple static segments can be merged into one term and combined with dynamic segments.
  * For example, `['/team/11/user', userName, {details: true}]`
  *
  * The input that you provide to the link is treated as a delta to the current URL.
  * For instance, suppose the current URL is `/user/(box//aux:team)`.
  * The link `<a [routerLink]="['/user/jim']">Jim</a>` creates the URL
  * `/user/(jim//aux:team)`.
  * See {@link Router#createUrlTree createUrlTree} for more information.
  *
  * @usageNotes
  *
  * You can use absolute or relative paths in a link, set query parameters,
  * control how parameters are handled, and keep a history of navigation states.
  *
  * ### Relative link paths
  *
  * The first segment name can be prepended with `/`, `./`, or `../`.
  * * If the first segment begins with `/`, the router looks up the route from the root of the
  *   app.
  * * If the first segment begins with `./`, or doesn't begin with a slash, the router
  *   looks in the children of the current activated route.
  * * If the first segment begins with `../`, the router goes up one level in the route tree.
  *
  * ### Setting and handling query params and fragments
  *
  * The following link adds a query parameter and a fragment to the generated URL:
  *
  * ```
  * <a [routerLink]="['/user/bob']" [queryParams]="{debug: true}" fragment="education">
  *   link to user component
  * </a>
  * ```
  * By default, the directive constructs the new URL using the given query parameters.
  * The example generates the link: `/user/bob?debug=true#education`.
  *
  * You can instruct the directive to handle query parameters differently
  * by specifying the `queryParamsHandling` option in the link.
  * Allowed values are:
  *
  *  - `'merge'`: Merge the given `queryParams` into the current query params.
  *  - `'preserve'`: Preserve the current query params.
  *
  * For example:
  *
  * ```
  * <a [routerLink]="['/user/bob']" [queryParams]="{debug: true}" queryParamsHandling="merge">
  *   link to user component
  * </a>
  * ```
  *
  * See {@link UrlCreationOptions.queryParamsHandling UrlCreationOptions#queryParamsHandling}.
  *
  * ### Preserving navigation history
  *
  * You can provide a `state` value to be persisted to the browser's
  * [`History.state` property](https://developer.mozilla.org/en-US/docs/Web/API/History#Properties).
  * For example:
  *
  * ```
  * <a [routerLink]="['/user/bob']" [state]="{tracingId: 123}">
  *   link to user component
  * </a>
  * ```
  *
  * Use {@link Router.getCurrentNavigation() Router#getCurrentNavigation} to retrieve a saved
  * navigation-state value. For example, to capture the `tracingId` during the `NavigationStart`
  * event:
  *
  * ```
  * // Get NavigationStart events
  * router.events.pipe(filter(e => e instanceof NavigationStart)).subscribe(e => {
  *   const navigation = router.getCurrentNavigation();
  *   tracingService.trace({id: navigation.extras.state.tracingId});
  * });
  * ```
  *
  * @ngModule RouterModule
  *
  * @publicApi
  */
@JSImport("@angular/router", "RouterLink")
@js.native
open class RouterLink protected ()
  extends StObject
     with OnChanges
     with OnDestroy {
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: String,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Null,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Unit,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: String,
    renderer: Renderer2,
    el: ElementRef[Any],
    locationStrategy: LocationStrategy
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Null,
    renderer: Renderer2,
    el: ElementRef[Any],
    locationStrategy: LocationStrategy
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Unit,
    renderer: Renderer2,
    el: ElementRef[Any],
    locationStrategy: LocationStrategy
  ) = this()
  
  /* private */ var _preserveFragment: Any = js.native
  
  /* private */ var _replaceUrl: Any = js.native
  
  /* private */ var _skipLocationChange: Any = js.native
  
  /* private */ var applyAttributeValue: Any = js.native
  
  /* private */ var commands: Any = js.native
  
  /* private */ val el: Any = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#fragment UrlCreationOptions#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: js.UndefOr[String] = js.native
  
  /**
    * Represents an `href` attribute value applied to a host element,
    * when a host element is `<a>`. For other tags, the value is `null`.
    */
  var href: String | Null = js.native
  
  /** Whether a host element is an `<a>` tag. */
  /* private */ var isAnchorElement: Any = js.native
  
  /* private */ var locationStrategy: Any = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /** @nodoc */
  def onClick(button: Double, ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean): Boolean = js.native
  
  def preserveFragment: Boolean = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#preserveFragment UrlCreationOptions#preserveFragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def preserveFragment_=(preserveFragment: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#queryParams UrlCreationOptions#queryParams}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParams: js.UndefOr[Params | Null] = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#queryParamsHandling UrlCreationOptions#queryParamsHandling}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * Specify a value here when you do not want to use the default value
    * for `routerLink`, which is the current activated route.
    * Note that a value of `undefined` here will use the `routerLink` default.
    * @see {@link UrlCreationOptions#relativeTo UrlCreationOptions#relativeTo}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.native
  
  /* private */ val renderer: Any = js.native
  
  def replaceUrl: Boolean = js.native
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#replaceUrl NavigationBehaviorOptions#replaceUrl}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  def replaceUrl_=(replaceUrl: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
  /* private */ var route: Any = js.native
  
  /* private */ var router: Any = js.native
  
  /**
    * Commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **array**: commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **string**: shorthand for array of commands with just the string, i.e. `['/route']`
    *   - **null|undefined**: effectively disables the `routerLink`
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def routerLink_=(commands: js.UndefOr[js.Array[Any] | String | Null]): Unit = js.native
  
  /**
    * Modifies the tab index if there was not a tabindex attribute on the element during
    * instantiation.
    */
  /* private */ var setTabIndexIfNotOnNativeEl: Any = js.native
  
  def skipLocationChange: Boolean = js.native
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#skipLocationChange NavigationBehaviorOptions#skipLocationChange}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  def skipLocationChange_=(skipLocationChange: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#state NavigationBehaviorOptions#state}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  var state: js.UndefOr[StringDictionary[Any]] = js.native
  
  /* private */ var subscription: Any = js.native
  
  /* private */ val tabIndexAttribute: Any = js.native
  
  /**
    * Represents the `target` attribute on a host element.
    * This is only used when the host element is an `<a>` tag.
    */
  var target: js.UndefOr[String] = js.native
  
  /* private */ var updateHref: Any = js.native
  
  def urlTree: UrlTree | Null = js.native
}
object RouterLink {
  
  @JSImport("@angular/router", "RouterLink")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@angular/router", "RouterLink.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RouterLink, 
    `[routerLink]`, 
    scala.Nothing, 
    Fragment, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RouterLink, 
      `[routerLink]`, 
      scala.Nothing, 
      Fragment, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@angular/router", "RouterLink.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
