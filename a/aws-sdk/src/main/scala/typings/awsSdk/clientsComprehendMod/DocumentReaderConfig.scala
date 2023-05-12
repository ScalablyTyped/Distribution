package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReaderConfig extends StObject {
  
  /**
    * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files and image files. Enter one of the following values:    TEXTRACT_DETECT_DOCUMENT_TEXT - The Amazon Comprehend service uses the DetectDocumentText API operation.     TEXTRACT_ANALYZE_DOCUMENT - The Amazon Comprehend service uses the AnalyzeDocument API operation.   
    */
  var DocumentReadAction: typings.awsSdk.clientsComprehendMod.DocumentReadAction
  
  /**
    * Determines the text extraction actions for PDF files. Enter one of the following values:    SERVICE_DEFAULT - use the Amazon Comprehend service defaults for PDF files.    FORCE_DOCUMENT_READ_ACTION - Amazon Comprehend uses the Textract API specified by DocumentReadAction for all PDF files, including digital PDF files.   
    */
  var DocumentReadMode: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentReadMode] = js.undefined
  
  /**
    * Specifies the type of Amazon Textract features to apply. If you chose TEXTRACT_ANALYZE_DOCUMENT as the read action, you must specify one or both of the following values:    TABLES - Returns information about any tables that are detected in the input document.     FORMS - Returns information and the data from any forms that are detected in the input document.   
    */
  var FeatureTypes: js.UndefOr[ListOfDocumentReadFeatureTypes] = js.undefined
}
object DocumentReaderConfig {
  
  inline def apply(DocumentReadAction: DocumentReadAction): DocumentReaderConfig = {
    val __obj = js.Dynamic.literal(DocumentReadAction = DocumentReadAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReaderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReaderConfig] (val x: Self) extends AnyVal {
    
    inline def setDocumentReadAction(value: DocumentReadAction): Self = StObject.set(x, "DocumentReadAction", value.asInstanceOf[js.Any])
    
    inline def setDocumentReadMode(value: DocumentReadMode): Self = StObject.set(x, "DocumentReadMode", value.asInstanceOf[js.Any])
    
    inline def setDocumentReadModeUndefined: Self = StObject.set(x, "DocumentReadMode", js.undefined)
    
    inline def setFeatureTypes(value: ListOfDocumentReadFeatureTypes): Self = StObject.set(x, "FeatureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesUndefined: Self = StObject.set(x, "FeatureTypes", js.undefined)
    
    inline def setFeatureTypesVarargs(value: DocumentReadFeatureTypes*): Self = StObject.set(x, "FeatureTypes", js.Array(value*))
  }
}
