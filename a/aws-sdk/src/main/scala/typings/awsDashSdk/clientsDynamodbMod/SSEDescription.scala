package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSEDescription extends js.Object {
  /**
    * The KMS customer master key (CMK) ARN used for the KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.KMSMasterKeyArn] = js.undefined
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption which uses AWS Key Management Service. Key is stored in your account and is managed by AWS KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.SSEType] = js.undefined
  /**
    * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.undefined
}

object SSEDescription {
  @scala.inline
  def apply(KMSMasterKeyArn: KMSMasterKeyArn = null, SSEType: SSEType = null, Status: SSEStatus = null): SSEDescription = {
    val __obj = js.Dynamic.literal()
    if (KMSMasterKeyArn != null) __obj.updateDynamic("KMSMasterKeyArn")(KMSMasterKeyArn)
    if (SSEType != null) __obj.updateDynamic("SSEType")(SSEType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEDescription]
  }
}

