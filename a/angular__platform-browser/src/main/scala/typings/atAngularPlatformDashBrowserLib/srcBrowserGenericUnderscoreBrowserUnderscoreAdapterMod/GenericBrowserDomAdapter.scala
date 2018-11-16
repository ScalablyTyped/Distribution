package typings
package atAngularPlatformDashBrowserLib.srcBrowserGenericUnderscoreBrowserUnderscoreAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/browser/generic_browser_adapter", "GenericBrowserDomAdapter")
@js.native
abstract class GenericBrowserDomAdapter ()
  extends atAngularPlatformDashBrowserLib.srcDomDomUnderscoreAdapterMod.DomAdapter {
  var _animationPrefix: js.Any = js.native
  var _transitionEnd: js.Any = js.native
  def getDistributedNodes(el: stdLib.HTMLElement): js.Array[stdLib.Node] = js.native
  def resolveAndSetHref(el: stdLib.HTMLAnchorElement, baseUrl: java.lang.String, href: java.lang.String): scala.Unit = js.native
}

