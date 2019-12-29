package typings.atAngularRouter.atAngularRouterMod

import typings.atAngularCommon.atAngularCommonMod.ViewportScroller
import typings.atAngularCore.atAngularCoreMod.OnDestroy
import typings.atAngularRouter.Anon_AnchorScrolling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "\u0275angular_packages_router_router_o")
@js.native
class ɵangular_packages_router_router_o protected () extends OnDestroy {
  def this(router: Router, /** @docsNotRequired */ viewportScroller: ViewportScroller) = this()
  def this(
    router: Router,
    /** @docsNotRequired */ viewportScroller: ViewportScroller,
    options: Anon_AnchorScrolling
  ) = this()
  var consumeScrollEvents: js.Any = js.native
  var createScrollEvents: js.Any = js.native
  var lastId: js.Any = js.native
  var lastSource: js.Any = js.native
  var options: js.Any = js.native
  var restoredId: js.Any = js.native
  var router: js.Any = js.native
  var routerEventsSubscription: js.Any = js.native
  var scheduleScrollEvent: js.Any = js.native
  var scrollEventsSubscription: js.Any = js.native
  var store: js.Any = js.native
  /** @docsNotRequired */ val viewportScroller: ViewportScroller = js.native
  def init(): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

