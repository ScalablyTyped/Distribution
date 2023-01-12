package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearQuerySuggestionsRequest extends StObject {
  
  /**
    * The identifier of the index you want to clear query suggestions from.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
}
object ClearQuerySuggestionsRequest {
  
  inline def apply(IndexId: IndexId): ClearQuerySuggestionsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearQuerySuggestionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearQuerySuggestionsRequest] (val x: Self) extends AnyVal {
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
