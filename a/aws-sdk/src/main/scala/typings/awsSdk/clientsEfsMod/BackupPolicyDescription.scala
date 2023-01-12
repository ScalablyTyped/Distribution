package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPolicyDescription extends StObject {
  
  /**
    * Describes the file system's backup policy, indicating whether automatic backups are turned on or off.
    */
  var BackupPolicy: js.UndefOr[typings.awsSdk.clientsEfsMod.BackupPolicy] = js.undefined
}
object BackupPolicyDescription {
  
  inline def apply(): BackupPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPolicyDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupPolicyDescription] (val x: Self) extends AnyVal {
    
    inline def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    inline def setBackupPolicyUndefined: Self = StObject.set(x, "BackupPolicy", js.undefined)
  }
}
