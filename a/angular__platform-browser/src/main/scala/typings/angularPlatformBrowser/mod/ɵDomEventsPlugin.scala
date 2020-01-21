package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275DomEventsPlugin")
@js.native
class ɵDomEventsPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
  def this(doc: js.Any, ngZone: NgZone) = this()
  def this(doc: js.Any, ngZone: NgZone, platformId: js.Object) = this()
  var ngZone: js.Any = js.native
  var patchEvent: js.Any = js.native
  def removeEventListener(target: js.Any, eventName: String, callback: js.Function): Unit = js.native
}

