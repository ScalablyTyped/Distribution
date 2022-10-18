package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceLinkedRoleDeletionStatusRequest extends StObject {
  
  /**
    * The deletion task identifier. This identifier is returned by the DeleteServiceLinkedRole operation in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
    */
  var DeletionTaskId: DeletionTaskIdType
}
object GetServiceLinkedRoleDeletionStatusRequest {
  
  inline def apply(DeletionTaskId: DeletionTaskIdType): GetServiceLinkedRoleDeletionStatusRequest = {
    val __obj = js.Dynamic.literal(DeletionTaskId = DeletionTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceLinkedRoleDeletionStatusRequest]
  }
  
  extension [Self <: GetServiceLinkedRoleDeletionStatusRequest](x: Self) {
    
    inline def setDeletionTaskId(value: DeletionTaskIdType): Self = StObject.set(x, "DeletionTaskId", value.asInstanceOf[js.Any])
  }
}
