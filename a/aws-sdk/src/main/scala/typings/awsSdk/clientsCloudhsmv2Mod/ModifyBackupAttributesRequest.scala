package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyBackupAttributesRequest extends StObject {
  
  /**
    * The identifier (ID) of the backup to modify. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typings.awsSdk.clientsCloudhsmv2Mod.BackupId
  
  /**
    * Specifies whether the service should exempt a backup from the retention policy for the cluster. True exempts a backup from the retention policy. False means the service applies the backup retention policy defined at the cluster.
    */
  var NeverExpires: Boolean
}
object ModifyBackupAttributesRequest {
  
  inline def apply(BackupId: BackupId, NeverExpires: Boolean): ModifyBackupAttributesRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], NeverExpires = NeverExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyBackupAttributesRequest]
  }
  
  extension [Self <: ModifyBackupAttributesRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setNeverExpires(value: Boolean): Self = StObject.set(x, "NeverExpires", value.asInstanceOf[js.Any])
  }
}
