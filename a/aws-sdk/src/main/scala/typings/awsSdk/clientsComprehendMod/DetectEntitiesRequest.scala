package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectEntitiesRequest extends StObject {
  
  /**
    * This field applies only when you use a custom entity recognition model that was trained with PDF annotations. For other cases, enter your text input in the Text field.  Use the Bytes parameter to input a text, PDF, Word or image file. Using a plain-text file in the Bytes parameter is equivelent to using the Text parameter (the Entities field in the response is identical). You can also use the Bytes parameter to input an Amazon Textract DetectDocumentText or AnalyzeDocument output file. Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to detect entities, the SDK may encode the document file bytes for you.  The maximum length of this field depends on the input document type. For details, see  Inputs for real-time custom analysis in the Comprehend Developer Guide.  If you use the Bytes parameter, do not use the Text parameter.
    */
  var Bytes: js.UndefOr[SemiStructuredDocumentBlob] = js.undefined
  
  /**
    * Provides configuration parameters to override the default actions for extracting text from PDF documents and image files.
    */
  var DocumentReaderConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentReaderConfig] = js.undefined
  
  /**
    * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an endpoint if you want to detect entities by using your own custom model instead of the default model that is used by Amazon Comprehend. If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language code that you provide in your request. For information about endpoints, see Managing endpoints.
    */
  var EndpointArn: js.UndefOr[EntityRecognizerEndpointArn] = js.undefined
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language of your custom model, and it ignores any language code that you specify here. All input documents must be in the same language.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsComprehendMod.LanguageCode] = js.undefined
  
  /**
    * A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use the Bytes parameter.
    */
  var Text: js.UndefOr[CustomerInputString] = js.undefined
}
object DetectEntitiesRequest {
  
  inline def apply(): DetectEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectEntitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectEntitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: SemiStructuredDocumentBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    inline def setDocumentReaderConfig(value: DocumentReaderConfig): Self = StObject.set(x, "DocumentReaderConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentReaderConfigUndefined: Self = StObject.set(x, "DocumentReaderConfig", js.undefined)
    
    inline def setEndpointArn(value: EntityRecognizerEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
