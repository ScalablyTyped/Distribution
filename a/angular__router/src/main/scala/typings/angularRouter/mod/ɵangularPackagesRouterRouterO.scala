package typings.angularRouter.mod

import typings.angularCommon.mod.ViewportScroller
import typings.angularCore.mod.OnDestroy
import typings.angularRouter.anon.AnchorScrolling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "\u0275angular_packages_router_router_o")
@js.native
class ɵangularPackagesRouterRouterO protected ()
  extends StObject
     with OnDestroy {
  def this(router: Router, /** @docsNotRequired */ viewportScroller: ViewportScroller) = this()
  def this(
    router: Router,
    /** @docsNotRequired */ viewportScroller: ViewportScroller,
    options: AnchorScrolling
  ) = this()
  
  /* private */ var consumeScrollEvents: js.Any = js.native
  
  /* private */ var createScrollEvents: js.Any = js.native
  
  def init(): Unit = js.native
  
  /* private */ var lastId: js.Any = js.native
  
  /* private */ var lastSource: js.Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /* private */ var options: js.Any = js.native
  
  /* private */ var restoredId: js.Any = js.native
  
  /* private */ var router: js.Any = js.native
  
  /* private */ var routerEventsSubscription: js.Any = js.native
  
  /* private */ var scheduleScrollEvent: js.Any = js.native
  
  /* private */ var scrollEventsSubscription: js.Any = js.native
  
  /* private */ var store: js.Any = js.native
  
  /** @docsNotRequired */ val viewportScroller: ViewportScroller = js.native
}
