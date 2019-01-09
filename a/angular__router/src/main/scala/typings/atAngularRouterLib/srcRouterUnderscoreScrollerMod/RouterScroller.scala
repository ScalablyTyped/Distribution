package typings
package atAngularRouterLib.srcRouterUnderscoreScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_scroller", "RouterScroller")
@js.native
class RouterScroller protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy {
  def this(router: atAngularRouterLib.srcRouterMod.Router, /** @docsNotRequired */ viewportScroller: atAngularCommonLib.commonMod.ViewportScroller) = this()
  def this(router: atAngularRouterLib.srcRouterMod.Router, /** @docsNotRequired */ viewportScroller: atAngularCommonLib.commonMod.ViewportScroller, options: atAngularRouterLib.Anon_AnchorScrolling) = this()
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
  /** @docsNotRequired */ val viewportScroller: atAngularCommonLib.commonMod.ViewportScroller = js.native
  def init(): scala.Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

