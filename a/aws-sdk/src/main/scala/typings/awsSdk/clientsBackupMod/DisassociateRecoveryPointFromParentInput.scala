package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRecoveryPointFromParentInput extends StObject {
  
  /**
    * This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.clientsBackupMod.BackupVaultName
  
  /**
    * This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45. 
    */
  var RecoveryPointArn: ARN
}
object DisassociateRecoveryPointFromParentInput {
  
  inline def apply(BackupVaultName: BackupVaultName, RecoveryPointArn: ARN): DisassociateRecoveryPointFromParentInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRecoveryPointFromParentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateRecoveryPointFromParentInput] (val x: Self) extends AnyVal {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
  }
}
