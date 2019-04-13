package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingCertificate extends js.Object {
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The certificate creation date.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The date the transfer was initiated.
    */
  var transferDate: js.UndefOr[DateType] = js.undefined
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.undefined
  /**
    * The AWS account to which the transfer was made.
    */
  var transferredTo: js.UndefOr[AwsAccountId] = js.undefined
}

object OutgoingCertificate {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    creationDate: DateType = null,
    transferDate: DateType = null,
    transferMessage: Message = null,
    transferredTo: AwsAccountId = null
  ): OutgoingCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (transferDate != null) __obj.updateDynamic("transferDate")(transferDate)
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage)
    if (transferredTo != null) __obj.updateDynamic("transferredTo")(transferredTo)
    __obj.asInstanceOf[OutgoingCertificate]
  }
}

