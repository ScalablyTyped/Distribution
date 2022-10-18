package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuerySuggestionsBlockListResponse extends StObject {
  
  /**
    * The unique identifier of the created block list.
    */
  var Id: js.UndefOr[QuerySuggestionsBlockListId] = js.undefined
}
object CreateQuerySuggestionsBlockListResponse {
  
  inline def apply(): CreateQuerySuggestionsBlockListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQuerySuggestionsBlockListResponse]
  }
  
  extension [Self <: CreateQuerySuggestionsBlockListResponse](x: Self) {
    
    inline def setId(value: QuerySuggestionsBlockListId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
