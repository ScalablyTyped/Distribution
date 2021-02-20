package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServiceAdapterObject extends StObject {
  
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
  implicit class WebServiceAdapterObjectMutableBuilder[Self <: WebServiceAdapterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorsLocation(value: IXMLDOMNode): Self = StObject.set(x, "ErrorsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDataSetDiffGram(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "GenerateDataSetDiffGram", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfoPathDotWebServiceAdapterObject_typekey(value: WebServiceAdapterObject): Self = StObject.set(x, "InfoPath.WebServiceAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: IXMLDOMNode): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWSDLURL(value: String): Self = StObject.set(x, "WSDLURL", value.asInstanceOf[js.Any])
  }
}
