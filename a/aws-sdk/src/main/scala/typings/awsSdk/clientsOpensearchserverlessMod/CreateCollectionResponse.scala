package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionResponse extends StObject {
  
  /**
    * Details about the collection.
    */
  var createCollectionDetail: js.UndefOr[CreateCollectionDetail] = js.undefined
}
object CreateCollectionResponse {
  
  inline def apply(): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateCollectionDetail(value: CreateCollectionDetail): Self = StObject.set(x, "createCollectionDetail", value.asInstanceOf[js.Any])
    
    inline def setCreateCollectionDetailUndefined: Self = StObject.set(x, "createCollectionDetail", js.undefined)
  }
}
