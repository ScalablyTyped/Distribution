package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFeaturedResultsSetRequest extends StObject {
  
  /**
    * A token that you provide to identify the request to create a set of featured results. Multiple calls to the CreateFeaturedResultsSet API with the same client token will create only one featured results set.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the set of featured results.
    */
  var Description: js.UndefOr[FeaturedResultsSetDescription] = js.undefined
  
  /**
    * A list of document IDs for the documents you want to feature at the top of the search results page. For more information on the list of documents, see FeaturedResultsSet.
    */
  var FeaturedDocuments: js.UndefOr[FeaturedDocumentList] = js.undefined
  
  /**
    * A name for the set of featured results.
    */
  var FeaturedResultsSetName: typings.awsSdk.clientsKendraMod.FeaturedResultsSetName
  
  /**
    * The identifier of the index that you want to use for featuring results.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * A list of queries for featuring results. For more information on the list of queries, see FeaturedResultsSet.
    */
  var QueryTexts: js.UndefOr[QueryTextList] = js.undefined
  
  /**
    * The current status of the set of featured results. When the value is ACTIVE, featured results are ready for use. You can still configure your settings before setting the status to ACTIVE. You can set the status to ACTIVE or INACTIVE using the UpdateFeaturedResultsSet API. The queries you specify for featured results must be unique per featured results set for each index, whether the status is ACTIVE or INACTIVE.
    */
  var Status: js.UndefOr[FeaturedResultsSetStatus] = js.undefined
  
  /**
    * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following symbols:_ . : / = + - @.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateFeaturedResultsSetRequest {
  
  inline def apply(FeaturedResultsSetName: FeaturedResultsSetName, IndexId: IndexId): CreateFeaturedResultsSetRequest = {
    val __obj = js.Dynamic.literal(FeaturedResultsSetName = FeaturedResultsSetName.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFeaturedResultsSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFeaturedResultsSetRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: FeaturedResultsSetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFeaturedDocuments(value: FeaturedDocumentList): Self = StObject.set(x, "FeaturedDocuments", value.asInstanceOf[js.Any])
    
    inline def setFeaturedDocumentsUndefined: Self = StObject.set(x, "FeaturedDocuments", js.undefined)
    
    inline def setFeaturedDocumentsVarargs(value: FeaturedDocument*): Self = StObject.set(x, "FeaturedDocuments", js.Array(value*))
    
    inline def setFeaturedResultsSetName(value: FeaturedResultsSetName): Self = StObject.set(x, "FeaturedResultsSetName", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setQueryTexts(value: QueryTextList): Self = StObject.set(x, "QueryTexts", value.asInstanceOf[js.Any])
    
    inline def setQueryTextsUndefined: Self = StObject.set(x, "QueryTexts", js.undefined)
    
    inline def setQueryTextsVarargs(value: QueryText*): Self = StObject.set(x, "QueryTexts", js.Array(value*))
    
    inline def setStatus(value: FeaturedResultsSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
