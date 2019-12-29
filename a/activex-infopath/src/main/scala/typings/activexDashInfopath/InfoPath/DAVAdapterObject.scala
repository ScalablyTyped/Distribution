package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.DAVAdapterObject")
@js.native
class DAVAdapterObject protected () extends js.Object {
  var FileName: String = js.native
  var FolderURL: String = js.native
  @JSName("InfoPath.DAVAdapterObject_typekey")
  var InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

