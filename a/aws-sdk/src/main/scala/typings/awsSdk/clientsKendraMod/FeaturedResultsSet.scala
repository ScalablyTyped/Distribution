package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedResultsSet extends StObject {
  
  /**
    * The Unix timestamp when the set of featured results was created.
    */
  var CreationTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The description for the set of featured results.
    */
  var Description: js.UndefOr[FeaturedResultsSetDescription] = js.undefined
  
  /**
    * The list of document IDs for the documents you want to feature at the top of the search results page. You can use the Query API to search for specific documents with their document IDs included in the result items, or you can use the console. You can add up to four featured documents. You can request to increase this limit by contacting Support. Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact match, then one or more specific documents are featured in the results. The exact match applies to the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?' will not render the featured results. Featured results are designed for specific queries, rather than queries that are too broad in scope.
    */
  var FeaturedDocuments: js.UndefOr[FeaturedDocumentList] = js.undefined
  
  /**
    * The identifier of the set of featured results.
    */
  var FeaturedResultsSetId: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetId] = js.undefined
  
  /**
    * The name for the set of featured results.
    */
  var FeaturedResultsSetName: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSetName] = js.undefined
  
  /**
    * The Unix timestamp when the set of featured results was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Long] = js.undefined
  
  /**
    * The list of queries for featuring results. Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact match, then one or more specific documents are featured in the results. The exact match applies to the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?' will not render the featured results. Featured results are designed for specific queries, rather than queries that are too broad in scope.
    */
  var QueryTexts: js.UndefOr[QueryTextList] = js.undefined
  
  /**
    * The current status of the set of featured results. When the value is ACTIVE, featured results are ready for use. You can still configure your settings before setting the status to ACTIVE. You can set the status to ACTIVE or INACTIVE using the UpdateFeaturedResultsSet API. The queries you specify for featured results must be unique per featured results set for each index, whether the status is ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[FeaturedResultsSetStatus] = js.undefined
}
object FeaturedResultsSet {
  
  inline def apply(): FeaturedResultsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedResultsSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedResultsSet] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: Long): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDescription(value: FeaturedResultsSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeaturedDocuments(value: FeaturedDocumentList): Self = StObject.set(x, "FeaturedDocuments", value.asInstanceOf[js.Any])
    
    inline def setFeaturedDocumentsUndefined: Self = StObject.set(x, "FeaturedDocuments", js.undefined)
    
    inline def setFeaturedDocumentsVarargs(value: FeaturedDocument*): Self = StObject.set(x, "FeaturedDocuments", js.Array(value*))
    
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
