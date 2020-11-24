package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin")
@js.native
class ɵHammerGesturesPlugin protected () extends ɵangularPackagesPlatformBrowserPlatformBrowserG {
  def this(doc: js.Any, _config: HammerGestureConfig, console: ɵConsole) = this()
  def this(doc: js.Any, _config: HammerGestureConfig, console: ɵConsole, loader: HammerLoader) = this()
  
  var _config: js.Any = js.native
  
  var console: js.Any = js.native
  
  def isCustomEvent(eventName: String): Boolean = js.native
  
  var loader: js.Any = js.native
}
