package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275InitialRenderPendingTasks")
@js.native
open class ɵInitialRenderPendingTasks ()
  extends StObject
     with OnDestroy {
  
  def add(): Double = js.native
  
  /* private */ var collection: Any = js.native
  
  /* private */ var complete: Any = js.native
  
  var completed: Boolean = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /* private */ var ngZone: Any = js.native
  
  /* private */ var promise: Any = js.native
  
  def remove(taskId: Double): Unit = js.native
  
  /* private */ var resolve: Any = js.native
  
  /* private */ var taskId: Any = js.native
  
  def whenAllTasksComplete: js.Promise[Unit] = js.native
}
/* static members */
object ɵInitialRenderPendingTasks {
  
  @JSImport("@angular/core", "\u0275InitialRenderPendingTasks")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "\u0275InitialRenderPendingTasks.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵInitialRenderPendingTasks, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵInitialRenderPendingTasks, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "\u0275InitialRenderPendingTasks.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵInitialRenderPendingTasks] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵInitialRenderPendingTasks]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
