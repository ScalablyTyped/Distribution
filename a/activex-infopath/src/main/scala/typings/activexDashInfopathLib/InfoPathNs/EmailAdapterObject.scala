package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.EmailAdapterObject")
@js.native
class EmailAdapterObject protected () extends js.Object {
  var AttachmentFileName: java.lang.String = js.native
  var AttachmentType: XdAttachmentType = js.native
  var BCC: java.lang.String = js.native
  var CC: java.lang.String = js.native
  var `InfoPath.EmailAdapterObject_typekey`: EmailAdapterObject = js.native
  var Intro: java.lang.String = js.native
  val Name: java.lang.String = js.native
  val QueryAllowed: scala.Boolean = js.native
  var Subject: java.lang.String = js.native
  val SubmitAllowed: scala.Boolean = js.native
  var To: java.lang.String = js.native
  def Query(): scala.Unit = js.native
  def Submit(): scala.Unit = js.native
  def SubmitData(pData: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode): scala.Unit = js.native
}

