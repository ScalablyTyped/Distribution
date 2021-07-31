package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdTaskPaneType
import typings.activexMshtml.MSHTML.IHTMLDocument2
import typings.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.HTMLTaskPaneObject")
@js.native
class HTMLTaskPaneObject protected ()
  extends StObject
     with typings.activexInfopath.InfoPath.HTMLTaskPaneObject {
  
  /* CompleteClass */
  override val HTMLDocument: IHTMLDocument2 = js.native
  
  /* CompleteClass */
  override def HTMLWindow(pvarIndex: js.Any): js.Any = js.native
  /* CompleteClass */
  @JSName("HTMLWindow")
  override val HTMLWindow_Original: IHTMLWindow2 = js.native
  
  /* CompleteClass */
  @JSName("InfoPath.HTMLTaskPaneObject_typekey")
  var InfoPathDotHTMLTaskPaneObject_typekey: typings.activexInfopath.InfoPath.HTMLTaskPaneObject = js.native
  
  /* CompleteClass */
  override def Navigate(bstrURL: String): Unit = js.native
  
  /* CompleteClass */
  override val Type: XdTaskPaneType = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
}
