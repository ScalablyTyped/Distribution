package typings.angularRouter.mod

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.QueryList
import typings.angularCore.mod.Renderer2
import typings.angularRouter.anon.Exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLinkActive")
@js.native
class RouterLinkActive protected ()
  extends OnChanges
     with OnDestroy
     with AfterContentInit {
  def this(router: Router, element: ElementRef[_], renderer: Renderer2, cdr: ChangeDetectorRef) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: RouterLink
  ) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    cdr: ChangeDetectorRef,
    link: js.UndefOr[scala.Nothing],
    linkWithHref: RouterLinkWithHref
  ) = this()
  def this(
    router: Router,
    element: ElementRef[_],
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
  
  var renderer: js.Any = js.native
  
  var router: js.Any = js.native
  
  var routerEventsSubscription: js.Any = js.native
  
  var routerLinkActiveOptions: Exact = js.native
  
  def routerLinkActive_=(data: js.Array[String] | String): Unit = js.native
  
  var subscribeToEachLinkOnChanges: js.Any = js.native
  
  var update: js.Any = js.native
}
