package typings
package atAngularPlatformDashBrowserLib.srcDomEventsDomUnderscoreEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/dom/events/dom_events", "DomEventsPlugin")
@js.native
class DomEventsPlugin protected ()
  extends atAngularPlatformDashBrowserLib.srcDomEventsEventUnderscoreManagerMod.EventManagerPlugin {
  def this(doc: js.Any, ngZone: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  def this(doc: js.Any, ngZone: atAngularCoreLib.atAngularCoreMod.NgZone, platformId: js.Object) = this()
  var ngZone: js.Any = js.native
  var patchEvent: js.Any = js.native
  def removeEventListener(target: js.Any, eventName: java.lang.String, callback: js.Function): scala.Unit = js.native
}

