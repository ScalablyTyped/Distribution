package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHITRequest extends StObject {
  
  /**
    * The ID of the HIT to be deleted.
    */
  var HITId: EntityId
}
object DeleteHITRequest {
  
  inline def apply(HITId: EntityId): DeleteHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHITRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHITRequest] (val x: Self) extends AnyVal {
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
  }
}
