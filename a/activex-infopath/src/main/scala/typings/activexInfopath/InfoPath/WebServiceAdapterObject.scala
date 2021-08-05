package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServiceAdapterObject extends StObject {
  
  val ErrorsLocation: IXMLDOMNode
  
  def GenerateDataSetDiffGram(pNode: IXMLDOMNode): IXMLDOMNode
  
  /* private */ @JSName("InfoPath.WebServiceAdapterObject_typekey")
  var InfoPathDotWebServiceAdapterObject_typekey: WebServiceAdapterObject
  
  var Input: String
  
  val Name: String
  
  var Operation: String
  
  val OutputLocation: IXMLDOMNode
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  var Timeout: Double
  
  val WSDLURL: String
}
object WebServiceAdapterObject {
  
  inline def apply(
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
  
  extension [Self <: WebServiceAdapterObject](x: Self) {
    
    inline def setErrorsLocation(value: IXMLDOMNode): Self = StObject.set(x, "ErrorsLocation", value.asInstanceOf[js.Any])
    
    inline def setGenerateDataSetDiffGram(value: IXMLDOMNode => IXMLDOMNode): Self = StObject.set(x, "GenerateDataSetDiffGram", js.Any.fromFunction1(value))
    
    inline def setInfoPathDotWebServiceAdapterObject_typekey(value: WebServiceAdapterObject): Self = StObject.set(x, "InfoPath.WebServiceAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocation(value: IXMLDOMNode): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "Submit", js.Any.fromFunction0(value))
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setWSDLURL(value: String): Self = StObject.set(x, "WSDLURL", value.asInstanceOf[js.Any])
  }
}
