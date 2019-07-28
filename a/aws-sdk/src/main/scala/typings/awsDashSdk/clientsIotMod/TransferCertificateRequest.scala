package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
  /**
    * The AWS account.
    */
  var targetAwsAccount: AwsAccountId
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.undefined
}

object TransferCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId, targetAwsAccount: AwsAccountId, transferMessage: Message = null): TransferCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId, targetAwsAccount = targetAwsAccount)
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage)
    __obj.asInstanceOf[TransferCertificateRequest]
  }
}

