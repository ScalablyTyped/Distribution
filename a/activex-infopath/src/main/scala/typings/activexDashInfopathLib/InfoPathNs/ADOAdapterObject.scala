package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ADOAdapterObject")
@js.native
class ADOAdapterObject protected () extends js.Object {
  var Command: java.lang.String = js.native
  var Connection: java.lang.String = js.native
  var `InfoPath.ADOAdapterObject_typekey`: ADOAdapterObject = js.native
  val Name: java.lang.String = js.native
  val QueryAllowed: scala.Boolean = js.native
  val SubmitAllowed: scala.Boolean = js.native
  var Timeout: scala.Double = js.native
  def BuildSQLFromXMLNodes(pXmlNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode): java.lang.String = js.native
  def Query(): scala.Unit = js.native
  def Submit(): scala.Unit = js.native
}

