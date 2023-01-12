package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionRequest extends StObject {
  
  /**
    * ID of the collection to delete.
    */
  var CollectionId: typings.awsSdk.clientsRekognitionMod.CollectionId
}
object DeleteCollectionRequest {
  
  inline def apply(CollectionId: CollectionId): DeleteCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectionRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
  }
}
