package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.EmailAdapterObject")
@js.native
class EmailAdapterObject protected () extends js.Object {
  var AttachmentFileName: String = js.native
  var AttachmentType: XdAttachmentType = js.native
  var BCC: String = js.native
  var CC: String = js.native
  var `InfoPath.EmailAdapterObject_typekey`: EmailAdapterObject = js.native
  var Intro: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  var Subject: String = js.native
  val SubmitAllowed: Boolean = js.native
  var To: String = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
  def SubmitData(pData: IXMLDOMNode): Unit = js.native
}

