package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.WebServiceAdapterObject")
@js.native
class WebServiceAdapterObject protected () extends js.Object {
  val ErrorsLocation: IXMLDOMNode = js.native
  @JSName("InfoPath.WebServiceAdapterObject_typekey")
  var InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject = js.native
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

