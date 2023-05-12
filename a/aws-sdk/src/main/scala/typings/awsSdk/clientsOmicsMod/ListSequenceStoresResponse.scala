package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSequenceStoresResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of sequence stores.
    */
  var sequenceStores: SequenceStoreDetailList
}
object ListSequenceStoresResponse {
  
  inline def apply(sequenceStores: SequenceStoreDetailList): ListSequenceStoresResponse = {
    val __obj = js.Dynamic.literal(sequenceStores = sequenceStores.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSequenceStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSequenceStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSequenceStores(value: SequenceStoreDetailList): Self = StObject.set(x, "sequenceStores", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoresVarargs(value: SequenceStoreDetail*): Self = StObject.set(x, "sequenceStores", js.Array(value*))
  }
}
