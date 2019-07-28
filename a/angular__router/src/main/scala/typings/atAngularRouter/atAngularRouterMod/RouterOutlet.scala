package typings.atAngularRouter.atAngularRouterMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typings.atAngularCore.atAngularCoreMod.ComponentRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.OnDestroy
import typings.atAngularCore.atAngularCoreMod.OnInit
import typings.atAngularCore.atAngularCoreMod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterOutlet")
@js.native
class RouterOutlet protected ()
  extends OnDestroy
     with OnInit {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    changeDetector: ChangeDetectorRef
  ) = this()
  var _activatedRoute: js.Any = js.native
  var activateEvents: EventEmitter[_] = js.native
  var activated: js.Any = js.native
  val activatedRoute: ActivatedRoute = js.native
  val activatedRouteData: Data = js.native
  var changeDetector: js.Any = js.native
  val component: js.Object = js.native
  var deactivateEvents: EventEmitter[_] = js.native
  val isActivated: Boolean = js.native
  var location: js.Any = js.native
  var name: js.Any = js.native
  var parentContexts: js.Any = js.native
  var resolver: js.Any = js.native
  def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
  def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
    */
  def attach(ref: ComponentRef[_], activatedRoute: ActivatedRoute): Unit = js.native
  def deactivate(): Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree
    */
  def detach(): ComponentRef[_] = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
}

