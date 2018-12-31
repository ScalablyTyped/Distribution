package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/testability/testability", "Testability")
@js.native
class Testability protected () extends PublicTestability {
  def this(_ngZone: atAngularCoreLib.srcZoneNgUnderscoreZoneMod.NgZone) = this()
  var _callbacks: js.Any = js.native
  var _isZoneStable: js.Any = js.native
  var _ngZone: js.Any = js.native
  var _pendingCount: js.Any = js.native
  var _runCallbacksIfReady: js.Any = js.native
  var _watchAngularEvents: js.Any = js.native
  var addCallback: js.Any = js.native
  var getPendingTasks: js.Any = js.native
  var taskTrackingZone: js.Any = js.native
  /**
    * Decreases the number of pending request
    * @deprecated pending requests are now tracked with zones
    */
  def decreasePendingRequestCount(): scala.Double = js.native
  /**
    * Get the number of pending requests
    * @deprecated pending requests are now tracked with zones
    */
  def getPendingRequestCount(): scala.Double = js.native
  /**
    * Increases the number of pending request
    * @deprecated pending requests are now tracked with zones.
    */
  def increasePendingRequestCount(): scala.Double = js.native
}

