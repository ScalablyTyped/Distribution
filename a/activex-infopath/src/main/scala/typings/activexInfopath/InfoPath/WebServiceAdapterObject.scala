package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServiceAdapterObject extends js.Object {
  
  val ErrorsLocation: IXMLDOMNode = js.native
  
  def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode = js.native
  
  @JSName("InfoPath.WebServiceAdapterObject_typekey")
  var InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject = js.native
  
  var Input: String = js.native
  
  val Name: String = js.native
  
  var Operation: String = js.native
  
  val OutputLocation: IXMLDOMNode = js.native
  
  def Query(): Unit = js.native
  
  val QueryAllowed: Boolean = js.native
  
  def Submit(): Unit = js.native
  
  val SubmitAllowed: Boolean = js.native
  
  var Timeout: Double = js.native
  
  val WSDLURL: String = js.native
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
  
  @scala.inline
  implicit class WebServiceAdapterObjectOps[Self <: WebServiceAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsLocation(value: IXMLDOMNode): Self = this.set("ErrorsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDataSetDiffGram(value: IXMLDOMNode => IXMLDOMNode): Self = this.set("GenerateDataSetDiffGram", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfoPathDotWebServiceAdapterObject_typekey(value: WebServiceAdapterObject): Self = this.set("InfoPath.WebServiceAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: IXMLDOMNode): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = this.set("QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = this.set("Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = this.set("SubmitAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWSDLURL(value: String): Self = this.set("WSDLURL", value.asInstanceOf[js.Any])
  }
}
