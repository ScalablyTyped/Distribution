package typings.angularPlatformBrowser.mod

import typings.std.Document_
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
@js.native
class ɵBrowserDomAdapter () extends ɵangularPackagesPlatformBrowserPlatformBrowserO {
  def createElement(tagName: String): HTMLElement = js.native
  def createElement(tagName: String, doc: Document_): HTMLElement = js.native
  def dispatchEvent(el: Node, evt: js.Any): Unit = js.native
  def getProperty(el: Node, name: String): js.Any = js.native
  def getValue(el: js.Any): String = js.native
  def isElementNode(node: Node): Boolean = js.native
  def log(error: String): Unit = js.native
  def logGroup(error: String): Unit = js.native
  def onAndCancel(el: Node, evt: js.Any, listener: js.Any): js.Function = js.native
  def remove(node: Node): Node = js.native
}

/* static members */
@JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
@js.native
object ɵBrowserDomAdapter extends js.Object {
  def makeCurrent(): Unit = js.native
}

