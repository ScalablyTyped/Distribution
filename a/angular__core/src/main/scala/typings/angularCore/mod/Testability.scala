package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Testability")
@js.native
class Testability protected ()
  extends StObject
     with PublicTestability {
  def this(_ngZone: NgZone) = this()
  
  /* private */ var _callbacks: js.Any = js.native
  
  /* private */ var _isZoneStable: js.Any = js.native
  
  /* private */ var _ngZone: js.Any = js.native
  
  /* private */ var _pendingCount: js.Any = js.native
  
  /* private */ var _runCallbacksIfReady: js.Any = js.native
  
  /* private */ var _watchAngularEvents: js.Any = js.native
  
  /* private */ var addCallback: js.Any = js.native
  
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
  
  /* private */ var getPendingTasks: js.Any = js.native
  
  /**
    * Increases the number of pending request
    * @deprecated pending requests are now tracked with zones.
    */
  def increasePendingRequestCount(): Double = js.native
  
  /* private */ var taskTrackingZone: js.Any = js.native
}
