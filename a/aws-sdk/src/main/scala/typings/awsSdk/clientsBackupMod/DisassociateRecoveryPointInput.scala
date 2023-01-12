package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRecoveryPointInput extends StObject {
  
  /**
    * The unique name of an Backup vault.
    */
  var BackupVaultName: typings.awsSdk.clientsBackupMod.BackupVaultName
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies an Backup recovery point.
    */
  var RecoveryPointArn: ARN
}
object DisassociateRecoveryPointInput {
  
  inline def apply(BackupVaultName: BackupVaultName, RecoveryPointArn: ARN): DisassociateRecoveryPointInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRecoveryPointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateRecoveryPointInput] (val x: Self) extends AnyVal {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
  }
}
