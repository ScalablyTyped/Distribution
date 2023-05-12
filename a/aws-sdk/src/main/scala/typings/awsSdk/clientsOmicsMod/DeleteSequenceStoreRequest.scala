package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSequenceStoreRequest extends StObject {
  
  /**
    * The sequence store's ID.
    */
  var id: SequenceStoreId
}
object DeleteSequenceStoreRequest {
  
  inline def apply(id: SequenceStoreId): DeleteSequenceStoreRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSequenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSequenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: SequenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
