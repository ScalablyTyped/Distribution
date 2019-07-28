package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true), server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.undefined
  /**
    * The KMS Customer Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB Customer Master Key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.KMSMasterKeyId
  ] = js.undefined
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.SSEType
  ] = js.undefined
}

object SSESpecification {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[SSEEnabled] = js.undefined,
    KMSMasterKeyId: KMSMasterKeyId = null,
    SSEType: SSEType = null
  ): SSESpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (KMSMasterKeyId != null) __obj.updateDynamic("KMSMasterKeyId")(KMSMasterKeyId)
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
}

