package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreBackupRequest extends StObject {
  
  /**
    * The ID of the backup to be restored. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typings.awsSdk.clientsCloudhsmv2Mod.BackupId
}
object RestoreBackupRequest {
  
  inline def apply(BackupId: BackupId): RestoreBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreBackupRequest]
  }
  
  extension [Self <: RestoreBackupRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
  }
}
