package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCollectionResponse extends StObject {
  
  /**
    * Details about each collection.
    */
  var collectionDetails: js.UndefOr[CollectionDetails] = js.undefined
  
  /**
    * Error information for the request.
    */
  var collectionErrorDetails: js.UndefOr[CollectionErrorDetails] = js.undefined
}
object BatchGetCollectionResponse {
  
  inline def apply(): BatchGetCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionDetails(value: CollectionDetails): Self = StObject.set(x, "collectionDetails", value.asInstanceOf[js.Any])
    
    inline def setCollectionDetailsUndefined: Self = StObject.set(x, "collectionDetails", js.undefined)
    
    inline def setCollectionDetailsVarargs(value: CollectionDetail*): Self = StObject.set(x, "collectionDetails", js.Array(value*))
    
    inline def setCollectionErrorDetails(value: CollectionErrorDetails): Self = StObject.set(x, "collectionErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setCollectionErrorDetailsUndefined: Self = StObject.set(x, "collectionErrorDetails", js.undefined)
    
    inline def setCollectionErrorDetailsVarargs(value: CollectionErrorDetail*): Self = StObject.set(x, "collectionErrorDetails", js.Array(value*))
  }
}
