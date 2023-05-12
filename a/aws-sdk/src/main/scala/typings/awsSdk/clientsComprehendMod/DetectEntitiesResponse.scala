package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectEntitiesResponse extends StObject {
  
  /**
    * Information about each block of text in the input document. Blocks are nested. A page block contains a block for each line of text, which contains a block for each word.  The Block content for a Word input document does not include a Geometry field. The Block field is not present in the response for plain-text inputs.
    */
  var Blocks: js.UndefOr[ListOfBlocks] = js.undefined
  
  /**
    * Information about the document, discovered during text extraction. This field is present in the response only if your request used the Byte parameter. 
    */
  var DocumentMetadata: js.UndefOr[typings.awsSdk.clientsComprehendMod.DocumentMetadata] = js.undefined
  
  /**
    * The document type for each page in the input document. This field is present in the response only if your request used the Byte parameter. 
    */
  var DocumentType: js.UndefOr[ListOfDocumentType] = js.undefined
  
  /**
    * A collection of entities identified in the input text. For each entity, the response provides the entity text, entity type, where the entity text begins and ends, and the level of confidence that Amazon Comprehend has in the detection.  If your request uses a custom entity recognition model, Amazon Comprehend detects the entities that the model is trained to recognize. Otherwise, it detects the default entity types. For a list of default entity types, see Entities in the Comprehend Developer Guide. 
    */
  var Entities: js.UndefOr[ListOfEntities] = js.undefined
  
  /**
    * Page-level errors that the system detected while processing the input document. The field is empty if the system encountered no errors.
    */
  var Errors: js.UndefOr[ListOfErrors] = js.undefined
}
object DetectEntitiesResponse {
  
  inline def apply(): DetectEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectEntitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectEntitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: ListOfBlocks): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value*))
    
    inline def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    inline def setDocumentType(value: ListOfDocumentType): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setDocumentTypeVarargs(value: DocumentTypeListItem*): Self = StObject.set(x, "DocumentType", js.Array(value*))
    
    inline def setEntities(value: ListOfEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setErrors(value: ListOfErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorsListItem*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
