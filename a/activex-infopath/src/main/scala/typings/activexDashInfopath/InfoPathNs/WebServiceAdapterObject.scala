package typings.activexDashInfopath.InfoPathNs

import typings.activexDashMsxml2.MSXML2Ns.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.WebServiceAdapterObject")
@js.native
class WebServiceAdapterObject protected () extends js.Object {
  val ErrorsLocation: IXMLDOMNode = js.native
  var `InfoPath.WebServiceAdapterObject_typekey`: WebServiceAdapterObject = js.native
  var Input: String = js.native
  val Name: String = js.native
  var Operation: String = js.native
  val OutputLocation: IXMLDOMNode = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  var Timeout: Double = js.native
  val WSDLURL: String = js.native
  def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

