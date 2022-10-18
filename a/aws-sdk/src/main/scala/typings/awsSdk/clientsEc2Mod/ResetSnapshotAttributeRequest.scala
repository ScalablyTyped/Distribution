package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetSnapshotAttributeRequest extends StObject {
  
  /**
    * The attribute to reset. Currently, only the attribute for permission to create volumes can be reset.
    */
  var Attribute: SnapshotAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsSdk.clientsEc2Mod.SnapshotId
}
object ResetSnapshotAttributeRequest {
  
  inline def apply(Attribute: SnapshotAttributeName, SnapshotId: SnapshotId): ResetSnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetSnapshotAttributeRequest]
  }
  
  extension [Self <: ResetSnapshotAttributeRequest](x: Self) {
    
    inline def setAttribute(value: SnapshotAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
