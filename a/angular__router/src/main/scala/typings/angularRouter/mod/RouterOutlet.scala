package typings.angularRouter.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.ViewContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterOutlet")
@js.native
class RouterOutlet protected ()
  extends StObject
     with OnDestroy
     with OnInit {
  def this(
    parentContexts: ChildrenOutletContexts,
    location: ViewContainerRef,
    resolver: ComponentFactoryResolver,
    name: String,
    changeDetector: ChangeDetectorRef
  ) = this()
  
  var _activatedRoute: js.Any = js.native
  
  var activateEvents: EventEmitter[js.Any] = js.native
  
  def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
  def activateWith(activatedRoute: ActivatedRoute, resolver: ComponentFactoryResolver): Unit = js.native
  
  var activated: js.Any = js.native
  
  def activatedRoute: ActivatedRoute = js.native
  
  def activatedRouteData: Data = js.native
  
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree
    */
  def attach(ref: ComponentRef[js.Any], activatedRoute: ActivatedRoute): Unit = js.native
  
  var changeDetector: js.Any = js.native
  
  def component: js.Object = js.native
  
  def deactivate(): Unit = js.native
  
  var deactivateEvents: EventEmitter[js.Any] = js.native
  
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree
    */
  def detach(): ComponentRef[js.Any] = js.native
  
  def isActivated: Boolean = js.native
  
  var location: js.Any = js.native
  
  var name: js.Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
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
  
  var parentContexts: js.Any = js.native
  
  var resolver: js.Any = js.native
}
