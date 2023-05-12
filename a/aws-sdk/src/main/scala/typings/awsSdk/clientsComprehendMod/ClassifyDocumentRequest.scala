package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyDocumentRequest extends StObject {
  
  /**
    * Use the Bytes parameter to input a text, PDF, Word or image file. You can also use the Bytes parameter to input an Amazon Textract DetectDocumentText or AnalyzeDocument output file. Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to classify documents, the SDK may encode the document file bytes for you.  The maximum length of this field depends on the input document type. For details, see  Inputs for real-time custom analysis in the Comprehend Developer Guide.  If you use the Bytes parameter, do not use the Text parameter.
    */
  var Bytes: js.UndefOr[SemiStructuredDocumentBlob] = js.undefined
  
  /**
    * Provides configuration parameters to override the default actions for extracting text from PDF documents and image files.
    */
  var DocumentReaderConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentReaderConfig] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint. For information about endpoints, see Managing endpoints.
    */
  var EndpointArn: DocumentClassifierEndpointArn
  
  /**
    * The document text to be analyzed. If you enter text using this parameter, do not use the Bytes parameter.
    */
  var Text: js.UndefOr[CustomerInputString] = js.undefined
}
object ClassifyDocumentRequest {
  
  inline def apply(EndpointArn: DocumentClassifierEndpointArn): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassifyDocumentRequest] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: SemiStructuredDocumentBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    inline def setDocumentReaderConfig(value: DocumentReaderConfig): Self = StObject.set(x, "DocumentReaderConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentReaderConfigUndefined: Self = StObject.set(x, "DocumentReaderConfig", js.undefined)
    
    inline def setEndpointArn(value: DocumentClassifierEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
