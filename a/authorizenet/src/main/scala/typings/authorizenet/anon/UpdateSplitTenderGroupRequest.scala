package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSplitTenderGroupRequest extends StObject {
  
  var updateSplitTenderGroupRequest: typings.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest
}
object UpdateSplitTenderGroupRequest {
  
  inline def apply(updateSplitTenderGroupRequest: typings.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest): UpdateSplitTenderGroupRequest = {
    val __obj = js.Dynamic.literal(updateSplitTenderGroupRequest = updateSplitTenderGroupRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSplitTenderGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSplitTenderGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setUpdateSplitTenderGroupRequest(value: typings.authorizenet.mod.APIContracts.UpdateSplitTenderGroupRequest): Self = StObject.set(x, "updateSplitTenderGroupRequest", value.asInstanceOf[js.Any])
  }
}
