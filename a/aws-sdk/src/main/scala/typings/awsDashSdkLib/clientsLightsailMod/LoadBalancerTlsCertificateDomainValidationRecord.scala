package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
  /**
    * The domain name against which your SSL/TLS certificate was validated.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  /**
    * A fully qualified domain name in the certificate. For example, example.com.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The type of validation record. For example, CNAME for domain validation.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The validation status. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.undefined
  /**
    * The value for that type.
    */
  var value: js.UndefOr[NonEmptyString] = js.undefined
}

object LoadBalancerTlsCertificateDomainValidationRecord {
  @scala.inline
  def apply(
    domainName: DomainName = null,
    name: NonEmptyString = null,
    `type`: NonEmptyString = null,
    validationStatus: LoadBalancerTlsCertificateDomainStatus = null,
    value: NonEmptyString = null
  ): LoadBalancerTlsCertificateDomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
  }
}

