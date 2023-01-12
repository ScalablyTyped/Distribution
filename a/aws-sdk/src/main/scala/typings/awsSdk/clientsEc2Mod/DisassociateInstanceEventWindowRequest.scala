package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateInstanceEventWindowRequest extends StObject {
  
  /**
    * One or more targets to disassociate from the specified event window.
    */
  var AssociationTarget: InstanceEventWindowDisassociationRequest
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: typings.awsSdk.clientsEc2Mod.InstanceEventWindowId
}
object DisassociateInstanceEventWindowRequest {
  
  inline def apply(
    AssociationTarget: InstanceEventWindowDisassociationRequest,
    InstanceEventWindowId: InstanceEventWindowId
  ): DisassociateInstanceEventWindowRequest = {
    val __obj = js.Dynamic.literal(AssociationTarget = AssociationTarget.asInstanceOf[js.Any], InstanceEventWindowId = InstanceEventWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateInstanceEventWindowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateInstanceEventWindowRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationTarget(value: InstanceEventWindowDisassociationRequest): Self = StObject.set(x, "AssociationTarget", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
  }
}
