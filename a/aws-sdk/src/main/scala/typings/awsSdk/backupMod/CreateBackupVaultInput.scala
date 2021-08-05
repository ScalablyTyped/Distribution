package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupVaultInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName
  
  /**
    * Metadata that you can assign to help organize the resources that you create. Each tag is a key-value pair.
    */
  var BackupVaultTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
}
object CreateBackupVaultInput {
  
  inline def apply(BackupVaultName: BackupVaultName): CreateBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupVaultInput]
  }
  
  extension [Self <: CreateBackupVaultInput](x: Self) {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultTags(value: Tags): Self = StObject.set(x, "BackupVaultTags", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultTagsUndefined: Self = StObject.set(x, "BackupVaultTags", js.undefined)
    
    inline def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setEncryptionKeyArn(value: ARN): Self = StObject.set(x, "EncryptionKeyArn", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyArnUndefined: Self = StObject.set(x, "EncryptionKeyArn", js.undefined)
  }
}
