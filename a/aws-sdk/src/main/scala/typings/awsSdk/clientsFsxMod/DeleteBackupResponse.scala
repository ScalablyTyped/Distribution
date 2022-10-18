package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupResponse extends StObject {
  
  /**
    * The ID of the backup that was deleted.
    */
  var BackupId: js.UndefOr[typings.awsSdk.clientsFsxMod.BackupId] = js.undefined
  
  /**
    * The lifecycle status of the backup. If the DeleteBackup operation is successful, the status is DELETED.
    */
  var Lifecycle: js.UndefOr[BackupLifecycle] = js.undefined
}
object DeleteBackupResponse {
  
  inline def apply(): DeleteBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackupResponse]
  }
  
  extension [Self <: DeleteBackupResponse](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    inline def setLifecycle(value: BackupLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
  }
}
