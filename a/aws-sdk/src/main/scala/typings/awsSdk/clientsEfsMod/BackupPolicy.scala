package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPolicy extends StObject {
  
  /**
    * Describes the status of the file system's backup policy.     ENABLED  - EFS is automatically backing up the file system.     ENABLING  - EFS is turning on automatic backups for the file system.     DISABLED  - Automatic back ups are turned off for the file system.     DISABLING  - EFS is turning off automatic backups for the file system.  
    */
  var Status: typings.awsSdk.clientsEfsMod.Status
}
object BackupPolicy {
  
  inline def apply(Status: Status): BackupPolicy = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPolicy]
  }
  
  extension [Self <: BackupPolicy](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
