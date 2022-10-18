package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupRequest extends StObject {
  
  /**
    * The ID of the backup to delete. Run the DescribeBackups command to get a list of backup IDs. Backup IDs are in the format ServerName-yyyyMMddHHmmssSSS. 
    */
  var BackupId: typings.awsSdk.clientsOpsworkscmMod.BackupId
}
object DeleteBackupRequest {
  
  inline def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupRequest]
  }
  
  extension [Self <: DeleteBackupRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
  }
}
