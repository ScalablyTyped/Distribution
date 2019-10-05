package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CACertificateDescription extends js.Object {
  /**
    * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
    */
  var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The CA certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The CA certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The customer version of the CA certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
  /**
    * The generation ID of the CA certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  /**
    * The date the CA certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The owner of the CA certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The status of a CA certificate.
    */
  var status: js.UndefOr[CACertificateStatus] = js.undefined
  /**
    * When the CA certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.undefined
}

object CACertificateDescription {
  @scala.inline
  def apply(
    autoRegistrationStatus: AutoRegistrationStatus = null,
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    creationDate: DateType = null,
    customerVersion: Int | Double = null,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    ownedBy: AwsAccountId = null,
    status: CACertificateStatus = null,
    validity: CertificateValidity = null
  ): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    if (autoRegistrationStatus != null) __obj.updateDynamic("autoRegistrationStatus")(autoRegistrationStatus.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (customerVersion != null) __obj.updateDynamic("customerVersion")(customerVersion.asInstanceOf[js.Any])
    if (generationId != null) __obj.updateDynamic("generationId")(generationId)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (ownedBy != null) __obj.updateDynamic("ownedBy")(ownedBy)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validity != null) __obj.updateDynamic("validity")(validity)
    __obj.asInstanceOf[CACertificateDescription]
  }
}

