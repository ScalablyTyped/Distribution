package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainValidation extends js.Object {
  /**
    * A fully qualified domain name (FQDN) in the certificate. For example, www.example.com or example.com. 
    */
  var DomainName: DomainNameString = js.native
  /**
    * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership.
    */
  var ResourceRecord: js.UndefOr[typings.awsSdk.acmMod.ResourceRecord] = js.native
  /**
    * The domain name that ACM used to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[DomainNameString] = js.native
  /**
    * A list of email addresses that ACM used to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[ValidationEmailList] = js.native
  /**
    * Specifies the domain validation method.
    */
  var ValidationMethod: js.UndefOr[typings.awsSdk.acmMod.ValidationMethod] = js.native
  /**
    * The validation status of the domain name. This can be one of the following values:    PENDING_VALIDATION     SUCCESS    FAILED  
    */
  var ValidationStatus: js.UndefOr[DomainStatus] = js.native
}

object DomainValidation {
  @scala.inline
  def apply(
    DomainName: DomainNameString,
    ResourceRecord: ResourceRecord = null,
    ValidationDomain: DomainNameString = null,
    ValidationEmails: ValidationEmailList = null,
    ValidationMethod: ValidationMethod = null,
    ValidationStatus: DomainStatus = null
  ): DomainValidation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (ResourceRecord != null) __obj.updateDynamic("ResourceRecord")(ResourceRecord.asInstanceOf[js.Any])
    if (ValidationDomain != null) __obj.updateDynamic("ValidationDomain")(ValidationDomain.asInstanceOf[js.Any])
    if (ValidationEmails != null) __obj.updateDynamic("ValidationEmails")(ValidationEmails.asInstanceOf[js.Any])
    if (ValidationMethod != null) __obj.updateDynamic("ValidationMethod")(ValidationMethod.asInstanceOf[js.Any])
    if (ValidationStatus != null) __obj.updateDynamic("ValidationStatus")(ValidationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidation]
  }
}

