package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateInstanceEventWindowRequest extends StObject {
  
  /**
    * One or more targets associated with the specified event window.
    */
  var AssociationTarget: InstanceEventWindowAssociationRequest
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: typings.awsSdk.clientsEc2Mod.InstanceEventWindowId
}
object AssociateInstanceEventWindowRequest {
  
  inline def apply(
    AssociationTarget: InstanceEventWindowAssociationRequest,
    InstanceEventWindowId: InstanceEventWindowId
  ): AssociateInstanceEventWindowRequest = {
    val __obj = js.Dynamic.literal(AssociationTarget = AssociationTarget.asInstanceOf[js.Any], InstanceEventWindowId = InstanceEventWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateInstanceEventWindowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateInstanceEventWindowRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationTarget(value: InstanceEventWindowAssociationRequest): Self = StObject.set(x, "AssociationTarget", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
  }
}
