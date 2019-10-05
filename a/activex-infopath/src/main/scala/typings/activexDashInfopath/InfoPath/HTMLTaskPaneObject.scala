package typings.activexDashInfopath.InfoPath

import typings.activexDashMshtml.MSHTML.IHTMLDocument2
import typings.activexDashMshtml.MSHTML.IHTMLWindow2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.HTMLTaskPaneObject")
@js.native
class HTMLTaskPaneObject protected () extends js.Object {
  val HTMLDocument: IHTMLDocument2 = js.native
  @JSName("HTMLWindow")
  val HTMLWindow_Original: IHTMLWindow2 = js.native
  var `InfoPath.HTMLTaskPaneObject_typekey`: HTMLTaskPaneObject = js.native
  val Type: XdTaskPaneType = js.native
  var Visible: Boolean = js.native
  def HTMLWindow(pvarIndex: js.Any): js.Any = js.native
  def Navigate(bstrURL: String): Unit = js.native
}

