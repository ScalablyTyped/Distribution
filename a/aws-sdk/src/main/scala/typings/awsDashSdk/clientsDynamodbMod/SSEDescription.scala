package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEDescription extends js.Object {
  /**
    * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible for more than seven days from this date.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[_Date] = js.native
  /**
    * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.KMSMasterKeyArn] = js.native
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.SSEType] = js.native
  /**
    * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.native
}

object SSEDescription {
  @scala.inline
  def apply(
    InaccessibleEncryptionDateTime: _Date = null,
    KMSMasterKeyArn: KMSMasterKeyArn = null,
    SSEType: SSEType = null,
    Status: SSEStatus = null
  ): SSEDescription = {
    val __obj = js.Dynamic.literal()
    if (InaccessibleEncryptionDateTime != null) __obj.updateDynamic("InaccessibleEncryptionDateTime")(InaccessibleEncryptionDateTime.asInstanceOf[js.Any])
    if (KMSMasterKeyArn != null) __obj.updateDynamic("KMSMasterKeyArn")(KMSMasterKeyArn.asInstanceOf[js.Any])
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEDescription]
  }
}

