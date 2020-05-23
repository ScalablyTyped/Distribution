package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDataTransfer")
@js.native
class IHTMLDataTransfer protected ()
  extends typings.activexMshtml.MSHTML.IHTMLDataTransfer {
  /* CompleteClass */
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  override var MSHTMLDotIHTMLDataTransfer_typekey: typings.activexMshtml.MSHTML.IHTMLDataTransfer = js.native
  /* CompleteClass */
  override var dropEffect: String = js.native
  /* CompleteClass */
  override var effectAllowed: String = js.native
  /* CompleteClass */
  override def clearData(format: String): Boolean = js.native
  /* CompleteClass */
  override def getData(format: String): js.Any = js.native
  /* CompleteClass */
  override def setData(format: String, data: js.Any): Boolean = js.native
}

