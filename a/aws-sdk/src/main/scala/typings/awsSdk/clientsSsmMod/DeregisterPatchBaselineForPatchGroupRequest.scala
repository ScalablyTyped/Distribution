package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterPatchBaselineForPatchGroupRequest extends StObject {
  
  /**
    * The ID of the patch baseline to deregister the patch group from.
    */
  var BaselineId: typings.awsSdk.clientsSsmMod.BaselineId
  
  /**
    * The name of the patch group that should be deregistered from the patch baseline.
    */
  var PatchGroup: typings.awsSdk.clientsSsmMod.PatchGroup
}
object DeregisterPatchBaselineForPatchGroupRequest {
  
  inline def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): DeregisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
  }
  
  extension [Self <: DeregisterPatchBaselineForPatchGroupRequest](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
