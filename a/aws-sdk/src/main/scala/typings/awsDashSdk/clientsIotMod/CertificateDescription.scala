package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateDescription extends js.Object {
  /**
    * The certificate ID of the CA certificate used to sign this certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The customer version of the certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
  /**
    * The generation ID of the certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  /**
    * The date and time the certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The ID of the AWS account that owns the certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The ID of the AWS account of the previous owner of the certificate.
    */
  var previousOwnedBy: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The status of the certificate.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
  /**
    * The transfer data.
    */
  var transferData: js.UndefOr[TransferData] = js.undefined
  /**
    * When the certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.undefined
}

object CertificateDescription {
  @scala.inline
  def apply(
    caCertificateId: CertificateId = null,
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    creationDate: DateType = null,
    customerVersion: js.UndefOr[CustomerVersion] = js.undefined,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    ownedBy: AwsAccountId = null,
    previousOwnedBy: AwsAccountId = null,
    status: CertificateStatus = null,
    transferData: TransferData = null,
    validity: CertificateValidity = null
  ): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    if (caCertificateId != null) __obj.updateDynamic("caCertificateId")(caCertificateId)
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(customerVersion)) __obj.updateDynamic("customerVersion")(customerVersion)
    if (generationId != null) __obj.updateDynamic("generationId")(generationId)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (ownedBy != null) __obj.updateDynamic("ownedBy")(ownedBy)
    if (previousOwnedBy != null) __obj.updateDynamic("previousOwnedBy")(previousOwnedBy)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transferData != null) __obj.updateDynamic("transferData")(transferData)
    if (validity != null) __obj.updateDynamic("validity")(validity)
    __obj.asInstanceOf[CertificateDescription]
  }
}

