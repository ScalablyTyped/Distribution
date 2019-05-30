package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterOutlet")
@js.native
class RouterOutlet protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnDestroy
     with atAngularCoreLib.atAngularCoreMod.OnInit {
  def this(parentContexts: ChildrenOutletContexts, location: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver, name: java.lang.String, changeDetector: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef) = this()
  var _activatedRoute: js.Any = js.native
  var activateEvents: atAngularCoreLib.atAngularCoreMod.EventEmitter[_] = js.native
  var activated: js.Any = js.native
  val activatedRoute: ActivatedRoute = js.native
  val activatedRouteData: Data = js.native
  var changeDetector: js.Any = js.native
  val component: js.Object = js.native
  var deactivateEvents: atAngularCoreLib.atAngularCoreMod.EventEmitter[_] = js.native
  val isActivated: scala.Boolean = js.native
  var location: js.Any = js.native
  var name: js.Any = js.native
  var parentContexts: js.Any = js.native
  var resolver: js.Any = js.native
  def activateWith(activatedRoute: ActivatedRoute): scala.Unit = js.native
  def activateWith(
    activatedRoute: ActivatedRoute,
    resolver: atAngularCoreLib.atAngularCoreMod.ComponentFactoryResolver
  ): scala.Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
    */
  def attach(ref: atAngularCoreLib.atAngularCoreMod.ComponentRef[_], activatedRoute: ActivatedRoute): scala.Unit = js.native
  def deactivate(): scala.Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree
    */
  def detach(): atAngularCoreLib.atAngularCoreMod.ComponentRef[_] = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): scala.Unit = js.native
}

