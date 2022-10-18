package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySuggestionsBlockListSummary extends StObject {
  
  /**
    * The date-time summary information for a query suggestions block list was last created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of a block list.
    */
  var Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined
  
  /**
    * The number of items in the block list file.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the block list.
    */
  var Name: js.UndefOr[QuerySuggestionsBlockListName] = js.undefined
  
  /**
    * The status of the block list.
    */
  var Status: js.UndefOr[QuerySuggestionsBlockListStatus] = js.undefined
  
  /**
    * The date-time the block list was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object QuerySuggestionsBlockListSummary {
  
  inline def apply(): QuerySuggestionsBlockListSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySuggestionsBlockListSummary]
  }
  
  extension [Self <: QuerySuggestionsBlockListSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setId(value: QuerySuggestionsBlockListId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setName(value: QuerySuggestionsBlockListName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: QuerySuggestionsBlockListStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
