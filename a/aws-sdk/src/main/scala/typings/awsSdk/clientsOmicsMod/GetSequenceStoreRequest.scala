package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSequenceStoreRequest extends StObject {
  
  /**
    * The store's ID.
    */
  var id: SequenceStoreId
}
object GetSequenceStoreRequest {
  
  inline def apply(id: SequenceStoreId): GetSequenceStoreRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSequenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSequenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: SequenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
