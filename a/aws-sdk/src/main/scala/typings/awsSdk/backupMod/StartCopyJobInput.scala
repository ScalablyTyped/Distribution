package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCopyJobInput extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: ARN
  
  /**
    * Specifies the IAM role ARN used to copy the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to StartCopyJob. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.undefined
  
  /**
    * An ARN that uniquely identifies a recovery point to use for the copy job; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45. 
    */
  var RecoveryPointArn: ARN
  
  /**
    * The name of a logical source container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var SourceBackupVaultName: BackupVaultName
}
object StartCopyJobInput {
  
  inline def apply(
    DestinationBackupVaultArn: ARN,
    IamRoleArn: IAMRoleArn,
    RecoveryPointArn: ARN,
    SourceBackupVaultName: BackupVaultName
  ): StartCopyJobInput = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any], SourceBackupVaultName = SourceBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCopyJobInput]
  }
  
  extension [Self <: StartCopyJobInput](x: Self) {
    
    inline def setDestinationBackupVaultArn(value: ARN): Self = StObject.set(x, "DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "SourceBackupVaultName", value.asInstanceOf[js.Any])
  }
}
