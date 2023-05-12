package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionResponse extends StObject {
  
  /**
    * Details of the deleted collection.
    */
  var deleteCollectionDetail: js.UndefOr[DeleteCollectionDetail] = js.undefined
}
object DeleteCollectionResponse {
  
  inline def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setDeleteCollectionDetail(value: DeleteCollectionDetail): Self = StObject.set(x, "deleteCollectionDetail", value.asInstanceOf[js.Any])
    
    inline def setDeleteCollectionDetailUndefined: Self = StObject.set(x, "deleteCollectionDetail", js.undefined)
  }
}
