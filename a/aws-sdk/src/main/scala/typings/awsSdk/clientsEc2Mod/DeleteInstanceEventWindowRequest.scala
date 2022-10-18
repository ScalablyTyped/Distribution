package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceEventWindowRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify true to force delete the event window. Use the force delete parameter if the event window is currently associated with targets.
    */
  var ForceDelete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: typings.awsSdk.clientsEc2Mod.InstanceEventWindowId
}
object DeleteInstanceEventWindowRequest {
  
  inline def apply(InstanceEventWindowId: InstanceEventWindowId): DeleteInstanceEventWindowRequest = {
    val __obj = js.Dynamic.literal(InstanceEventWindowId = InstanceEventWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceEventWindowRequest]
  }
  
  extension [Self <: DeleteInstanceEventWindowRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
  }
}
