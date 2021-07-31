package typings.angularRouter.mod

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.QueryList
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularRouter.anon.Exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLinkActive")
@js.native
class RouterLinkActive protected ()
  extends StObject
     with OnChanges
     with OnDestroy
     with AfterContentInit {
  def this(router: Router, element: ElementRef[js.Any], renderer: Renderer2, cdr: ChangeDetectorRef) = this()
  def this(
    router: Router,
    element: ElementRef[js.Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: RouterLink
  ) = this()
  def this(
    router: Router,
    element: ElementRef[js.Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: Unit,
    linkWithHref: RouterLinkWithHref
  ) = this()
  def this(
    router: Router,
    element: ElementRef[js.Any],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: RouterLink,
    linkWithHref: RouterLinkWithHref
  ) = this()
  
  val cdr: js.Any = js.native
  
  var classes: js.Any = js.native
  
  var element: js.Any = js.native
  
  var hasActiveLinks: js.Any = js.native
  
  val isActive: Boolean = js.native
  
  var isLinkActive: js.Any = js.native
  
  var link: js.Any = js.native
  
  var linkInputChangesSubscription: js.Any = js.native
  
  var linkWithHref: js.Any = js.native
  
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
  
  var renderer: js.Any = js.native
  
  var router: js.Any = js.native
  
  var routerEventsSubscription: js.Any = js.native
  
  var routerLinkActiveOptions: Exact = js.native
  
  def routerLinkActive_=(data: js.Array[String] | String): Unit = js.native
  
  var subscribeToEachLinkOnChanges: js.Any = js.native
  
  var update: js.Any = js.native
}
