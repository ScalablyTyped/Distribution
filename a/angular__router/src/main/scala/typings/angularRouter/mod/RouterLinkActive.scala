package typings.angularRouter.mod

import typings.angularCore.mod.AfterContentInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.QueryList
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularRouter.AnonExact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLinkActive")
@js.native
class RouterLinkActive protected ()
  extends OnChanges
     with OnDestroy
     with AfterContentInit {
  def this(router: Router, element: ElementRef[_], renderer: Renderer2) = this()
  def this(router: Router, element: ElementRef[_], renderer: Renderer2, link: RouterLink) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    link: js.UndefOr[scala.Nothing],
    linkWithHref: RouterLinkWithHref
  ) = this()
  def this(
    router: Router,
    element: ElementRef[_],
    renderer: Renderer2,
    link: RouterLink,
    linkWithHref: RouterLinkWithHref
  ) = this()
  var classes: js.Any = js.native
  var element: js.Any = js.native
  var hasActiveLinks: js.Any = js.native
  val isActive: Boolean = js.native
  var isLinkActive: js.Any = js.native
  var link: js.UndefOr[js.Any] = js.native
  var linkWithHref: js.UndefOr[js.Any] = js.native
  var links: QueryList[RouterLink] = js.native
  var linksWithHrefs: QueryList[RouterLinkWithHref] = js.native
  var renderer: js.Any = js.native
  var router: js.Any = js.native
  var routerLinkActive: js.Array[String] | String = js.native
  var routerLinkActiveOptions: AnonExact = js.native
  var subscription: js.Any = js.native
  var update: js.Any = js.native
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
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

