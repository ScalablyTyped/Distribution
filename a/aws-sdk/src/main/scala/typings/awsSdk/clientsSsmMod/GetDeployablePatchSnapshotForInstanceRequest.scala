package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeployablePatchSnapshotForInstanceRequest extends StObject {
  
  /**
    * Defines the basic information about a patch baseline override.
    */
  var BaselineOverride: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineOverride] = js.undefined
  
  /**
    * The ID of the managed node for which the appropriate patch snapshot should be retrieved.
    */
  var InstanceId: typings.awsSdk.clientsSsmMod.InstanceId
  
  /**
    * The snapshot ID provided by the user when running AWS-RunPatchBaseline.
    */
  var SnapshotId: typings.awsSdk.clientsSsmMod.SnapshotId
}
object GetDeployablePatchSnapshotForInstanceRequest {
  
  inline def apply(InstanceId: InstanceId, SnapshotId: SnapshotId): GetDeployablePatchSnapshotForInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeployablePatchSnapshotForInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setBaselineOverride(value: BaselineOverride): Self = StObject.set(x, "BaselineOverride", value.asInstanceOf[js.Any])
    
    inline def setBaselineOverrideUndefined: Self = StObject.set(x, "BaselineOverride", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
