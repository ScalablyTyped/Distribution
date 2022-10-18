package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStoredQueryResponse extends StObject {
  
  /**
    * Returns a StoredQuery object.
    */
  var StoredQuery: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.StoredQuery] = js.undefined
}
object GetStoredQueryResponse {
  
  inline def apply(): GetStoredQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStoredQueryResponse]
  }
  
  extension [Self <: GetStoredQueryResponse](x: Self) {
    
    inline def setStoredQuery(value: StoredQuery): Self = StObject.set(x, "StoredQuery", value.asInstanceOf[js.Any])
    
    inline def setStoredQueryUndefined: Self = StObject.set(x, "StoredQuery", js.undefined)
  }
}
