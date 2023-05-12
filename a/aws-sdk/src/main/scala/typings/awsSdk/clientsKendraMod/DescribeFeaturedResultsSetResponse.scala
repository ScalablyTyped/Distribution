package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeaturedResultsSetResponse extends StObject {
  
  /**
    * The Unix timestamp when the set of the featured results was created.
    */
  var CreationTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The description for the set of featured results.
    */
  var Description: js.UndefOr[FeaturedResultsSetDescription] = js.undefined
  
  /**
    * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot feature these documents if they don't exist in the index. You can check the status of a document and its ID or check for documents with status errors using the BatchGetDocumentStatus API.
    */
  var FeaturedDocumentsMissing: js.UndefOr[FeaturedDocumentMissingList] = js.undefined
  
  /**
    * The list of document IDs for the documents you want to feature with their metadata information. For more information on the list of featured documents, see FeaturedResultsSet.
    */
  var FeaturedDocumentsWithMetadata: js.UndefOr[FeaturedDocumentWithMetadataList] = js.undefined
  
  /**
    * The identifier of the set of featured results.
    */
  var FeaturedResultsSetId: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetId] = js.undefined
  
  /**
    * The name for the set of featured results.
    */
  var FeaturedResultsSetName: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetName] = js.undefined
  
  /**
    * The timestamp when the set of featured results was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The list of queries for featuring results. For more information on the list of queries, see FeaturedResultsSet.
    */
  var QueryTexts: js.UndefOr[QueryTextList] = js.undefined
  
  /**
    * The current status of the set of featured results. When the value is ACTIVE, featured results are ready for use. You can still configure your settings before setting the status to ACTIVE. You can set the status to ACTIVE or INACTIVE using the UpdateFeaturedResultsSet API. The queries you specify for featured results must be unique per featured results set for each index, whether the status is ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[FeaturedResultsSetStatus] = js.undefined
}
object DescribeFeaturedResultsSetResponse {
  
  inline def apply(): DescribeFeaturedResultsSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeaturedResultsSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFeaturedResultsSetResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: Long): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDescription(value: FeaturedResultsSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeaturedDocumentsMissing(value: FeaturedDocumentMissingList): Self = StObject.set(x, "FeaturedDocumentsMissing", value.asInstanceOf[js.Any])
    
    inline def setFeaturedDocumentsMissingUndefined: Self = StObject.set(x, "FeaturedDocumentsMissing", js.undefined)
    
    inline def setFeaturedDocumentsMissingVarargs(value: FeaturedDocumentMissing*): Self = StObject.set(x, "FeaturedDocumentsMissing", js.Array(value*))
    
    inline def setFeaturedDocumentsWithMetadata(value: FeaturedDocumentWithMetadataList): Self = StObject.set(x, "FeaturedDocumentsWithMetadata", value.asInstanceOf[js.Any])
    
    inline def setFeaturedDocumentsWithMetadataUndefined: Self = StObject.set(x, "FeaturedDocumentsWithMetadata", js.undefined)
    
    inline def setFeaturedDocumentsWithMetadataVarargs(value: FeaturedDocumentWithMetadata*): Self = StObject.set(x, "FeaturedDocumentsWithMetadata", js.Array(value*))
    
    inline def setFeaturedResultsSetId(value: FeaturedResultsSetId): Self = StObject.set(x, "FeaturedResultsSetId", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetIdUndefined: Self = StObject.set(x, "FeaturedResultsSetId", js.undefined)
    
    inline def setFeaturedResultsSetName(value: FeaturedResultsSetName): Self = StObject.set(x, "FeaturedResultsSetName", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetNameUndefined: Self = StObject.set(x, "FeaturedResultsSetName", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: Long): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setQueryTexts(value: QueryTextList): Self = StObject.set(x, "QueryTexts", value.asInstanceOf[js.Any])
    
    inline def setQueryTextsUndefined: Self = StObject.set(x, "QueryTexts", js.undefined)
    
    inline def setQueryTextsVarargs(value: QueryText*): Self = StObject.set(x, "QueryTexts", js.Array(value*))
    
    inline def setStatus(value: FeaturedResultsSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
