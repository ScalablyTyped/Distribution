package typings.angularPlatformBrowser.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_g")
@js.native
abstract class ɵangularPackagesPlatformBrowserPlatformBrowserG protected () extends js.Object {
  def this(_doc: js.Any) = this()
  
  var _doc: js.Any = js.native
  
  def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
  
  def addGlobalEventListener(element: String, eventName: String, handler: js.Function): js.Function = js.native
  
  var manager: EventManager = js.native
  
  def supports(eventName: String): Boolean = js.native
}
