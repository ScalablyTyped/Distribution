package typings.angularRouter.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var changeDetector: js.Any = js.native
  var deactivateEvents: EventEmitter[_] = js.native
  var location: js.Any = js.native
  var name: js.Any = js.native
  var parentContexts: js.Any = js.native
  var resolver: js.Any = js.native
  def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
  def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
  def activatedRoute: ActivatedRoute = js.native
  def activatedRouteData: Data = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
    */
  def attach(ref: ComponentRef[_], activatedRoute: ActivatedRoute): Unit = js.native
  def component: js.Object = js.native
  def deactivate(): Unit = js.native
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree
    */
  def detach(): ComponentRef[_] = js.native
  def isActivated: Boolean = js.native
}

