package typings.angularRouter.mod

import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularRouter.anon.ActivateEvents
import typings.angularRouter.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterOutlet")
@js.native
open class RouterOutlet ()
  extends StObject
     with OnDestroy
     with OnInit
     with RouterOutletContract {
  
  /* private */ var _activatedRoute: Any = js.native
  
  @JSName("activateEvents")
  var activateEvents_RouterOutlet: EventEmitter[Any] = js.native
  
  /* private */ var activated: Any = js.native
  
  @JSName("activatedRouteData")
  def activatedRouteData_MRouterOutlet: Data = js.native
  
  @JSName("activatedRoute")
  def activatedRoute_MRouterOutlet: ActivatedRoute = js.native
  
  /**
    * Emits an attached component instance when the `RouteReuseStrategy` instructs to re-attach a
    * previously detached subtree.
    **/
  @JSName("attachEvents")
  var attachEvents_RouterOutlet: EventEmitter[Any] = js.native
  
  /* private */ var changeDetector: Any = js.native
  
  /**
    * @returns The currently activated component instance.
    * @throws An error if the outlet is not activated.
    */
  @JSName("component")
  def component_MRouterOutlet: js.Object = js.native
  
  @JSName("deactivateEvents")
  var deactivateEvents_RouterOutlet: EventEmitter[Any] = js.native
  
  /**
    * Emits a detached component instance when the `RouteReuseStrategy` instructs to detach the
    * subtree.
    */
  @JSName("detachEvents")
  var detachEvents_RouterOutlet: EventEmitter[Any] = js.native
  
  /* private */ var environmentInjector: Any = js.native
  
  /* private */ var initializeOutletWithName: Any = js.native
  
  @JSName("isActivated")
  def isActivated_MRouterOutlet: Boolean = js.native
  
  /* private */ var isTrackedInParentContexts: Any = js.native
  
  /* private */ var location: Any = js.native
  
  /**
    * The name of the outlet
    *
    * @see [named outlets](guide/router-tutorial-toh#displaying-multiple-routes-in-named-outlets)
    */
  var name: String = js.native
  
  /** @nodoc */
  def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
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
  
  /* private */ var parentContexts: Any = js.native
}
/* static members */
object RouterOutlet {
  
  @JSImport("@angular/router", "RouterOutlet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "RouterOutlet.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RouterOutlet, 
    "router-outlet", 
    js.Array["outlet"], 
    Name, 
    ActivateEvents, 
    scala.Nothing, 
    scala.Nothing, 
    true, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RouterOutlet, 
      "router-outlet", 
      js.Array["outlet"], 
      Name, 
      ActivateEvents, 
      scala.Nothing, 
      scala.Nothing, 
      true, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterOutlet.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterOutlet, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterOutlet, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
