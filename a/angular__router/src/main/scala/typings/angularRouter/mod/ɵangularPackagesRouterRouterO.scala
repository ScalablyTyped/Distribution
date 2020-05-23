package typings.angularRouter.mod

import typings.angularCommon.mod.ViewportScroller
import typings.angularCore.mod.OnDestroy
import typings.angularRouter.anon.AnchorScrolling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "\u0275angular_packages_router_router_o")
@js.native
class ɵangularPackagesRouterRouterO protected () extends OnDestroy {
  def this(router: Router, /** @docsNotRequired */ viewportScroller: ViewportScroller) = this()
  def this(
    router: Router,
    /** @docsNotRequired */ viewportScroller: ViewportScroller,
    options: AnchorScrolling
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
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

