package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the table. If enabled (true), server-side encryption type is set to KMS. If disabled (false) or not specified, server-side encryption is set to AWS owned CMK.
    */
  var Enabled: js.UndefOr[SSEEnabled] = js.undefined
  /**
    * The KMS Master Key (CMK) which should be used for the KMS encryption. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS Master Key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[KMSMasterKeyId] = js.undefined
  /**
    * Server-side encryption type:    AES256 - Server-side encryption which uses the AES256 algorithm (not applicable).    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[SSEType] = js.undefined
}

