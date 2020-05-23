package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServiceAdapterObject extends js.Object {
  val ErrorsLocation: IXMLDOMNode
  @JSName("InfoPath.WebServiceAdapterObject_typekey")
  var InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject
  var Input: String
  val Name: String
  var Operation: String
  val OutputLocation: IXMLDOMNode
  val QueryAllowed: Boolean
  val SubmitAllowed: Boolean
  var Timeout: Double
  val WSDLURL: String
  def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode
  def Query(): Unit
  def Submit(): Unit
}

object WebServiceAdapterObject {
  @scala.inline
  def apply(
    ErrorsLocation: IXMLDOMNode,
    GenerateDataSetDiffGram: IXMLDOMNode => IXMLDOMNode,
    InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject,
    Input: String,
    Name: String,
    Operation: String,
    OutputLocation: IXMLDOMNode,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean,
    Timeout: Double,
    WSDLURL: String
  ): WebServiceAdapterObject = {
    val __obj = js.Dynamic.literal(ErrorsLocation = ErrorsLocation.asInstanceOf[js.Any], GenerateDataSetDiffGram = js.Any.fromFunction1(GenerateDataSetDiffGram), Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], OutputLocation = OutputLocation.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], WSDLURL = WSDLURL.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.WebServiceAdapterObject_typekey")(InfoPathDotWebServiceAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServiceAdapterObject]
  }
}

