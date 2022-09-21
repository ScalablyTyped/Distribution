package typings.angularRouter.mod

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.QueryList
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterBooleans.`true`
import typings.angularRouter.angularRouterStrings.`[routerLinkActive]`
import typings.angularRouter.angularRouterStrings.date
import typings.angularRouter.angularRouterStrings.links
import typings.angularRouter.angularRouterStrings.linksWithHrefs
import typings.angularRouter.angularRouterStrings.location
import typings.angularRouter.angularRouterStrings.page
import typings.angularRouter.angularRouterStrings.routerLinkActive
import typings.angularRouter.angularRouterStrings.step
import typings.angularRouter.angularRouterStrings.time
import typings.angularRouter.anon.AriaCurrentWhenActive
import typings.angularRouter.anon.Exact
import typings.angularRouter.anon.IsActiveChange
import typings.angularRouter.anon.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLinkActive")
@js.native
open class RouterLinkActive protected ()
  extends StObject
     with OnChanges
     with OnDestroy
     with AfterContentInit {
  def this(router: Router, element: ElementRef[Any], renderer: Renderer2, cdr: ChangeDetectorRef) = this()
  def this(
    router: Router,
    element: ElementRef[Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: RouterLink
  ) = this()
  def this(
    router: Router,
    element: ElementRef[Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: Unit,
    linkWithHref: RouterLinkWithHref
  ) = this()
  def this(
    router: Router,
    element: ElementRef[Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: RouterLink,
    linkWithHref: RouterLinkWithHref
  ) = this()
  
  /**
    * Aria-current attribute to apply when the router link is active.
    *
    * Possible values: `'page'` | `'step'` | `'location'` | `'date'` | `'time'` | `true` | `false`.
    *
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Attributes/aria-current}
    */
  var ariaCurrentWhenActive: js.UndefOr[page | step | location | date | time | `true` | `false`] = js.native
  
  /* private */ val cdr: Any = js.native
  
  /* private */ var classes: Any = js.native
  
  /* private */ var element: Any = js.native
  
  /* private */ var hasActiveLinks: Any = js.native
  
  val isActive: Boolean = js.native
  
  /**
    *
    * You can use the output `isActiveChange` to get notified each time the link becomes
    * active or inactive.
    *
    * Emits:
    * true  -> Route is active
    * false -> Route is inactive
    *
    * ```
    * <a
    *  routerLink="/user/bob"
    *  routerLinkActive="active-link"
    *  (isActiveChange)="this.onRouterLinkActive($event)">Bob</a>
    * ```
    */
  val isActiveChange: EventEmitter[Boolean] = js.native
  
  /* private */ var isLinkActive: Any = js.native
  
  /* private */ var link: Any = js.native
  
  /* private */ var linkInputChangesSubscription: Any = js.native
  
  /* private */ var linkWithHref: Any = js.native
  
  var links: QueryList[RouterLink] = js.native
  
  var linksWithHrefs: QueryList[RouterLinkWithHref] = js.native
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngAfterContentInit(): Unit = js.native
  
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
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var router: Any = js.native
  
  /* private */ var routerEventsSubscription: Any = js.native
  
  /**
    * Options to configure how to determine if the router link is active.
    *
    * These options are passed to the `Router.isActive()` function.
    *
    * @see Router.isActive
    */
  var routerLinkActiveOptions: Exact | IsActiveMatchOptions = js.native
  
  def routerLinkActive_=(data: js.Array[String] | String): Unit = js.native
  
  /* private */ var subscribeToEachLinkOnChanges: Any = js.native
  
  /* private */ var update: Any = js.native
}
/* static members */
object RouterLinkActive {
  
  @JSImport("@angular/router", "RouterLinkActive")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "RouterLinkActive.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RouterLinkActive, 
    `[routerLinkActive]`, 
    js.Array[routerLinkActive], 
    AriaCurrentWhenActive, 
    IsActiveChange, 
    js.Tuple2[links, linksWithHrefs], 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RouterLinkActive, 
      `[routerLinkActive]`, 
      js.Array[routerLinkActive], 
      AriaCurrentWhenActive, 
      IsActiveChange, 
      js.Tuple2[links, linksWithHrefs], 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterLinkActive.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterLinkActive, js.Tuple6[Null, Null, Null, Null, Optional, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterLinkActive, js.Tuple6[Null, Null, Null, Null, Optional, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
