package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCollectionResponse extends StObject {
  
  /**
    * Details about the updated collection.
    */
  var updateCollectionDetail: js.UndefOr[UpdateCollectionDetail] = js.undefined
}
object UpdateCollectionResponse {
  
  inline def apply(): UpdateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdateCollectionDetail(value: UpdateCollectionDetail): Self = StObject.set(x, "updateCollectionDetail", value.asInstanceOf[js.Any])
    
    inline def setUpdateCollectionDetailUndefined: Self = StObject.set(x, "updateCollectionDetail", js.undefined)
  }
}
