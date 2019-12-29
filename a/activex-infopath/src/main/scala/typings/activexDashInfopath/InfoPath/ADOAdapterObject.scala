package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ADOAdapterObject")
@js.native
class ADOAdapterObject protected () extends js.Object {
  var Command: String = js.native
  var Connection: String = js.native
  @JSName("InfoPath.ADOAdapterObject_typekey")
  var InfoPathDotADOAdapterObject_typekey: ADOAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  var Timeout: Double = js.native
  def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

