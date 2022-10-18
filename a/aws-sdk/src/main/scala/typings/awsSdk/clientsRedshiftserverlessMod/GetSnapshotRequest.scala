package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotRequest extends StObject {
  
  /**
    * The owner Amazon Web Services account of a snapshot shared with another user.
    */
  var ownerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot to return.
    */
  var snapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the snapshot to return.
    */
  var snapshotName: js.UndefOr[String] = js.undefined
}
object GetSnapshotRequest {
  
  inline def apply(): GetSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotRequest]
  }
  
  extension [Self <: GetSnapshotRequest](x: Self) {
    
    inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "snapshotArn", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "snapshotName", js.undefined)
  }
}
