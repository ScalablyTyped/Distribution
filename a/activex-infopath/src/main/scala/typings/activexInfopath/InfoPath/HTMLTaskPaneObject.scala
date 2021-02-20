package typings.activexInfopath.InfoPath

import typings.activexMshtml.MSHTML.IHTMLDocument2
import typings.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLTaskPaneObject extends StObject {
  
  val HTMLDocument: IHTMLDocument2 = js.native
  
  def HTMLWindow(pvarIndex: js.Any): js.Any = js.native
  @JSName("HTMLWindow")
  val HTMLWindow_Original: IHTMLWindow2 = js.native
  
  @JSName("InfoPath.HTMLTaskPaneObject_typekey")
  var InfoPathDotHTMLTaskPaneObject_typekey: HTMLTaskPaneObject = js.native
  
  def Navigate(bstrURL: String): Unit = js.native
  
  val Type: XdTaskPaneType = js.native
  
  var Visible: Boolean = js.native
}
