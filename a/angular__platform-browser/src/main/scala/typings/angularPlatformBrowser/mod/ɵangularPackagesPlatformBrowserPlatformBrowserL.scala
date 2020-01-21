package typings.angularPlatformBrowser.mod

import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275angular_packages_platform_browser_platform_browser_l")
@js.native
abstract class ɵangularPackagesPlatformBrowserPlatformBrowserL () extends ɵDomAdapter {
  var _animationPrefix: js.Any = js.native
  var _transitionEnd: js.Any = js.native
  def getDistributedNodes(el: HTMLElement): js.Array[Node] = js.native
  def resolveAndSetHref(el: HTMLAnchorElement, baseUrl: String, href: String): Unit = js.native
}

