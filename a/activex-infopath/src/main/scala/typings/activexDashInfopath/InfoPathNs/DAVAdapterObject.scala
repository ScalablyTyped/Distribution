package typings.activexDashInfopath.InfoPathNs

import typings.activexDashMsxml2.MSXML2Ns.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.DAVAdapterObject")
@js.native
class DAVAdapterObject protected () extends js.Object {
  var FileName: String = js.native
  var FolderURL: String = js.native
  var `InfoPath.DAVAdapterObject_typekey`: DAVAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

