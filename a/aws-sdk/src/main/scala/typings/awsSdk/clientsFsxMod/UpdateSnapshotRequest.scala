package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the snapshot to update.
    */
  var Name: SnapshotName
  
  /**
    * The ID of the snapshot that you want to update, in the format fsvolsnap-0123456789abcdef0.
    */
  var SnapshotId: typings.awsSdk.clientsFsxMod.SnapshotId
}
object UpdateSnapshotRequest {
  
  inline def apply(Name: SnapshotName, SnapshotId: SnapshotId): UpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSnapshotRequest]
  }
  
  extension [Self <: UpdateSnapshotRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: SnapshotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
