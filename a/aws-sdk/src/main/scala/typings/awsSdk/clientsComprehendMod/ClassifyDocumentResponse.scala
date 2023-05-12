package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyDocumentResponse extends StObject {
  
  /**
    * The classes used by the document being analyzed. These are used for multi-class trained models. Individual classes are mutually exclusive and each document is expected to have only a single class assigned to it. For example, an animal can be a dog or a cat, but not both at the same time. 
    */
  var Classes: js.UndefOr[ListOfClasses] = js.undefined
  
  /**
    * Extraction information about the document. This field is present in the response only if your request includes the Byte parameter. 
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentMetadata] = js.undefined
  
  /**
    * The document type for each page in the input document. This field is present in the response only if your request includes the Byte parameter. 
    */
  var DocumentType: js.UndefOr[ListOfDocumentType] = js.undefined
  
  /**
    * Page-level errors that the system detected while processing the input document. The field is empty if the system encountered no errors.
    */
  var Errors: js.UndefOr[ListOfErrors] = js.undefined
  
  /**
    * The labels used the document being analyzed. These are used for multi-label trained models. Individual labels represent different categories that are related in some manner and are not mutually exclusive. For example, a movie can be just an action movie, or it can be an action movie, a science fiction movie, and a comedy, all at the same time. 
    */
  var Labels: js.UndefOr[ListOfLabels] = js.undefined
  
  /**
    * Warnings detected while processing the input document. The response includes a warning if there is a mismatch between the input document type and the model type associated with the endpoint that you specified. The response can also include warnings for individual pages that have a mismatch.  The field is empty if the system generated no warnings.
    */
  var Warnings: js.UndefOr[ListOfWarnings] = js.undefined
}
object ClassifyDocumentResponse {
  
  inline def apply(): ClassifyDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyDocumentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassifyDocumentResponse] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: ListOfClasses): Self = StObject.set(x, "Classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "Classes", js.undefined)
    
    inline def setClassesVarargs(value: DocumentClass*): Self = StObject.set(x, "Classes", js.Array(value*))
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setDocumentType(value: ListOfDocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setDocumentTypeVarargs(value: DocumentTypeListItem*): Self = StObject.set(x, "DocumentType", js.Array(value*))
    
    inline def setErrors(value: ListOfErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorsListItem*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setLabels(value: ListOfLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: DocumentLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setWarnings(value: ListOfWarnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: WarningsListItem*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
