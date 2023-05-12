package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferenceStoresResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of reference stores.
    */
  var referenceStores: ReferenceStoreDetailList
}
object ListReferenceStoresResponse {
  
  inline def apply(referenceStores: ReferenceStoreDetailList): ListReferenceStoresResponse = {
    val __obj = js.Dynamic.literal(referenceStores = referenceStores.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReferenceStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReferenceStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReferenceStores(value: ReferenceStoreDetailList): Self = StObject.set(x, "referenceStores", value.asInstanceOf[js.Any])
    
    inline def setReferenceStoresVarargs(value: ReferenceStoreDetail*): Self = StObject.set(x, "referenceStores", js.Array(value*))
  }
}
