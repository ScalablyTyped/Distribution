package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEbsDefaultKmsKeyIdRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption. If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is specified, the encrypted state must be true. You can specify the KMS key using any of the following:   Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails. Amazon EBS does not support asymmetric KMS keys.
    */
  var KmsKeyId: typings.awsSdk.clientsEc2Mod.KmsKeyId
}
object ModifyEbsDefaultKmsKeyIdRequest {
  
  inline def apply(KmsKeyId: KmsKeyId): ModifyEbsDefaultKmsKeyIdRequest = {
    val __obj = js.Dynamic.literal(KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEbsDefaultKmsKeyIdRequest]
  }
  
  extension [Self <: ModifyEbsDefaultKmsKeyIdRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
  }
}
