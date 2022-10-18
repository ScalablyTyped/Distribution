package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStoredQueryRequest extends StObject {
  
  /**
    * A list of StoredQuery objects. The mandatory fields are QueryName and Expression.  When you are creating a query, you must provide a query name and an expression. When you are updating a query, you must provide a query name but updating the description is optional. 
    */
  var StoredQuery: typings.awsSdk.clientsConfigserviceMod.StoredQuery
  
  /**
    * A list of Tags object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object PutStoredQueryRequest {
  
  inline def apply(StoredQuery: StoredQuery): PutStoredQueryRequest = {
    val __obj = js.Dynamic.literal(StoredQuery = StoredQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStoredQueryRequest]
  }
  
  extension [Self <: PutStoredQueryRequest](x: Self) {
    
    inline def setStoredQuery(value: StoredQuery): Self = StObject.set(x, "StoredQuery", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
