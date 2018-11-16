package typings
package atAngularPlatformDashBrowserLib.srcDomEventsHammerUnderscoreGesturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/dom/events/hammer_gestures", "HammerGesturesPlugin")
@js.native
class HammerGesturesPlugin protected ()
  extends atAngularPlatformDashBrowserLib.srcDomEventsEventUnderscoreManagerMod.EventManagerPlugin {
  def this(doc: js.Any, _config: HammerGestureConfig, console: atAngularCoreLib.coreMod.ɵConsole) = this()
  def this(doc: js.Any, _config: HammerGestureConfig, console: atAngularCoreLib.coreMod.ɵConsole, loader: HammerLoader) = this()
  var _config: js.Any = js.native
  var console: js.Any = js.native
  var loader: js.UndefOr[js.Any] = js.native
  def isCustomEvent(eventName: java.lang.String): scala.Boolean = js.native
}

