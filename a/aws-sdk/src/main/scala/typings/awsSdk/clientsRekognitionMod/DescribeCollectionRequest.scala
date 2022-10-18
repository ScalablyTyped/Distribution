package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCollectionRequest extends StObject {
  
  /**
    * The ID of the collection to describe.
    */
  var CollectionId: typings.awsSdk.clientsRekognitionMod.CollectionId
}
object DescribeCollectionRequest {
  
  inline def apply(CollectionId: CollectionId): DescribeCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCollectionRequest]
  }
  
  extension [Self <: DescribeCollectionRequest](x: Self) {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
  }
}
