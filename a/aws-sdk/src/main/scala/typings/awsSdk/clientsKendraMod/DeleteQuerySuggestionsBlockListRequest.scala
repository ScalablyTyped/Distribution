package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQuerySuggestionsBlockListRequest extends StObject {
  
  /**
    * The identifier of the block list you want to delete.
    */
  var Id: QuerySuggestionsBlockListId
  
  /**
    * The identifier of the index for the block list.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object DeleteQuerySuggestionsBlockListRequest {
  
  inline def apply(Id: QuerySuggestionsBlockListId, IndexId: IndexId): DeleteQuerySuggestionsBlockListRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQuerySuggestionsBlockListRequest]
  }
  
  extension [Self <: DeleteQuerySuggestionsBlockListRequest](x: Self) {
    
    inline def setId(value: QuerySuggestionsBlockListId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
