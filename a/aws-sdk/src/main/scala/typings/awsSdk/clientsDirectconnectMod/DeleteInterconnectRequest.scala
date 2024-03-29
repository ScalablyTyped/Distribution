package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInterconnectRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId
}
object DeleteInterconnectRequest {
  
  inline def apply(interconnectId: InterconnectId): DeleteInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInterconnectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInterconnectRequest] (val x: Self) extends AnyVal {
    
    inline def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
  }
}
