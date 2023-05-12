package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeaturedResultsSetRequest extends StObject {
  
  /**
    * A new description for the set of featured results.
    */
  var Description: js.UndefOr[FeaturedResultsSetDescription] = js.undefined
  
  /**
    * A list of document IDs for the documents you want to feature at the top of the search results page. For more information on the list of featured documents, see FeaturedResultsSet.
    */
  var FeaturedDocuments: js.UndefOr[FeaturedDocumentList] = js.undefined
  
  /**
    * The identifier of the set of featured results that you want to update.
    */
  var FeaturedResultsSetId: typings.awsSdk.clientsKendraMod.FeaturedResultsSetId
  
  /**
    * A new name for the set of featured results.
    */
  var FeaturedResultsSetName: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetName] = js.undefined
  
  /**
    * The identifier of the index used for featuring results.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A list of queries for featuring results. For more information on the list of queries, see FeaturedResultsSet.
    */
  var QueryTexts: js.UndefOr[QueryTextList] = js.undefined
  
  /**
    * You can set the status to ACTIVE or INACTIVE. When the value is ACTIVE, featured results are ready for use. You can still configure your settings before setting the status to ACTIVE. The queries you specify for featured results must be unique per featured results set for each index, whether the status is ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[FeaturedResultsSetStatus] = js.undefined
}
object UpdateFeaturedResultsSetRequest {
  
  inline def apply(FeaturedResultsSetId: FeaturedResultsSetId, IndexId: IndexId): UpdateFeaturedResultsSetRequest = {
    val __obj = js.Dynamic.literal(FeaturedResultsSetId = FeaturedResultsSetId.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFeaturedResultsSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFeaturedResultsSetRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FeaturedResultsSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeaturedDocuments(value: FeaturedDocumentList): Self = StObject.set(x, "FeaturedDocuments", value.asInstanceOf[js.Any])
    
    inline def setFeaturedDocumentsUndefined: Self = StObject.set(x, "FeaturedDocuments", js.undefined)
    
    inline def setFeaturedDocumentsVarargs(value: FeaturedDocument*): Self = StObject.set(x, "FeaturedDocuments", js.Array(value*))
    
    inline def setFeaturedResultsSetId(value: FeaturedResultsSetId): Self = StObject.set(x, "FeaturedResultsSetId", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetName(value: FeaturedResultsSetName): Self = StObject.set(x, "FeaturedResultsSetName", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetNameUndefined: Self = StObject.set(x, "FeaturedResultsSetName", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setQueryTexts(value: QueryTextList): Self = StObject.set(x, "QueryTexts", value.asInstanceOf[js.Any])
    
    inline def setQueryTextsUndefined: Self = StObject.set(x, "QueryTexts", js.undefined)
    
    inline def setQueryTextsVarargs(value: QueryText*): Self = StObject.set(x, "QueryTexts", js.Array(value*))
    
    inline def setStatus(value: FeaturedResultsSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
