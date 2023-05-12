package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLedgerRequest extends StObject {
  
  /**
    * Specifies whether the ledger is protected from being deleted by any user. If not defined during ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it by calling the UpdateLedger operation to set this parameter to false.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.clientsQldbMod.DeletionProtection] = js.undefined
  
  /**
    * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more information, see Encryption at rest in the Amazon QLDB Developer Guide. Use one of the following options to specify this parameter:    AWS_OWNED_KMS_KEY: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.    Undefined: By default, use an Amazon Web Services owned KMS key.    A valid symmetric customer managed KMS key: Use the specified symmetric encryption KMS key in your account that you create, own, and manage. Amazon QLDB does not support asymmetric keys. For more information, see Using symmetric and asymmetric keys in the Key Management Service Developer Guide.   To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a key in a different Amazon Web Services account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    For more information, see Key identifiers (KeyId) in the Key Management Service Developer Guide.
    */
  var KmsKey: js.UndefOr[typings.awsSdk.clientsQldbMod.KmsKey] = js.undefined
  
  /**
    * The name of the ledger that you want to create. The name must be unique among all of the ledgers in your Amazon Web Services account in the current Region. Naming constraints for ledger names are defined in Quotas in Amazon QLDB in the Amazon QLDB Developer Guide.
    */
  var Name: LedgerName
  
  /**
    * The permissions mode to assign to the ledger that you want to create. This parameter can have one of the following values:    ALLOW_ALL: A legacy permissions mode that enables access control with API-level granularity for ledgers. This mode allows users who have the SendCommand API permission for this ledger to run all PartiQL commands (hence, ALLOW_ALL) on any tables in the specified ledger. This mode disregards any table-level or command-level IAM permissions policies that you create for the ledger.    STANDARD: (Recommended) A permissions mode that enables access control with finer granularity for ledgers, tables, and PartiQL commands. By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL actions, in addition to the SendCommand API permission for the ledger. For information, see Getting started with the standard permissions mode in the Amazon QLDB Developer Guide.    We strongly recommend using the STANDARD permissions mode to maximize the security of your ledger data. 
    */
  var PermissionsMode: typings.awsSdk.clientsQldbMod.PermissionsMode
  
  /**
    * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsQldbMod.Tags] = js.undefined
}
object CreateLedgerRequest {
  
  inline def apply(Name: LedgerName, PermissionsMode: PermissionsMode): CreateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionsMode = PermissionsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLedgerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLedgerRequest] (val x: Self) extends AnyVal {
    
    inline def setDeletionProtection(value: DeletionProtection): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    inline def setKmsKey(value: KmsKey): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissionsMode(value: PermissionsMode): Self = StObject.set(x, "PermissionsMode", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
