package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.WebServiceAdapterObject")
@js.native
class WebServiceAdapterObject protected () extends js.Object {
  val ErrorsLocation: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  var `InfoPath.WebServiceAdapterObject_typekey`: WebServiceAdapterObject = js.native
  var Input: java.lang.String = js.native
  val Name: java.lang.String = js.native
  var Operation: java.lang.String = js.native
  val OutputLocation: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  val QueryAllowed: scala.Boolean = js.native
  val SubmitAllowed: scala.Boolean = js.native
  var Timeout: scala.Double = js.native
  val WSDLURL: java.lang.String = js.native
  def GenerateDataSetDiffGram(pNode: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode): activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  def Query(): scala.Unit = js.native
  def Submit(): scala.Unit = js.native
}

