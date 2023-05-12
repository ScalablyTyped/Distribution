package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCollectionRequest extends StObject {
  
  /**
    * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection endpoint. You can also retrieve it using the ListCollections API.
    */
  var ids: js.UndefOr[CollectionIds] = js.undefined
  
  /**
    * A list of collection names. You can't provide names and IDs in the same request.
    */
  var names: js.UndefOr[CollectionNames] = js.undefined
}
object BatchGetCollectionRequest {
  
  inline def apply(): BatchGetCollectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setIds(value: CollectionIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: CollectionId*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setNames(value: CollectionNames): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: CollectionName*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
