package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLunaClientResponse extends js.Object {
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[Certificate] = js.undefined
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[ClientArn] = js.undefined
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[Label] = js.undefined
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
}

object DescribeLunaClientResponse {
  @scala.inline
  def apply(
    Certificate: Certificate = null,
    CertificateFingerprint: CertificateFingerprint = null,
    ClientArn: ClientArn = null,
    Label: Label = null,
    LastModifiedTimestamp: Timestamp = null
  ): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CertificateFingerprint != null) __obj.updateDynamic("CertificateFingerprint")(CertificateFingerprint)
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp)
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
}

