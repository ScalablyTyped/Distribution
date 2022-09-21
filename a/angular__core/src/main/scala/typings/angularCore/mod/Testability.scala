package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Testability")
@js.native
open class Testability protected ()
  extends StObject
     with PublicTestability {
  def this(_ngZone: NgZone, registry: TestabilityRegistry, testabilityGetter: GetTestability) = this()
  
  /* private */ var _callbacks: Any = js.native
  
  /* private */ var _isZoneStable: Any = js.native
  
  /* private */ var _ngZone: Any = js.native
  
  /* private */ var _pendingCount: Any = js.native
  
  /* private */ var _runCallbacksIfReady: Any = js.native
  
  /* private */ var _watchAngularEvents: Any = js.native
  
  /* private */ var addCallback: Any = js.native
  
  /**
    * Decreases the number of pending request
    * @deprecated pending requests are now tracked with zones
    */
  def decreasePendingRequestCount(): Double = js.native
  
  /**
    * Get the number of pending requests
    * @deprecated pending requests are now tracked with zones
    */
  def getPendingRequestCount(): Double = js.native
  
  /* private */ var getPendingTasks: Any = js.native
  
  /**
    * Increases the number of pending request
    * @deprecated pending requests are now tracked with zones.
    */
  def increasePendingRequestCount(): Double = js.native
  
  /* private */ var registry: Any = js.native
  
  /* private */ var taskTrackingZone: Any = js.native
}
/* static members */
object Testability {
  
  @JSImport("@angular/core", "Testability")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "Testability.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Testability, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Testability, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "Testability.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Testability] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Testability]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
