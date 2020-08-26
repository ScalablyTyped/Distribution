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
    * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership. Note: The CNAME information that you need does not include the name of your domain. If you include&#x2028; your domain name in the DNS database CNAME record, validation fails.&#x2028; For example, if the name is "_a79865eb4cd1a6ab990a45779b4e0b96.yourdomain.com", only "_a79865eb4cd1a6ab990a45779b4e0b96" must be used.
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
  def apply(DomainName: DomainNameString): DomainValidation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidation]
  }
  @scala.inline
  implicit class DomainValidationOps[Self <: DomainValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainNameString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRecord(value: ResourceRecord): Self = this.set("ResourceRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecord: Self = this.set("ResourceRecord", js.undefined)
    @scala.inline
    def setValidationDomain(value: DomainNameString): Self = this.set("ValidationDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationDomain: Self = this.set("ValidationDomain", js.undefined)
    @scala.inline
    def setValidationEmailsVarargs(value: String*): Self = this.set("ValidationEmails", js.Array(value :_*))
    @scala.inline
    def setValidationEmails(value: ValidationEmailList): Self = this.set("ValidationEmails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationEmails: Self = this.set("ValidationEmails", js.undefined)
    @scala.inline
    def setValidationMethod(value: ValidationMethod): Self = this.set("ValidationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationMethod: Self = this.set("ValidationMethod", js.undefined)
    @scala.inline
    def setValidationStatus(value: DomainStatus): Self = this.set("ValidationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationStatus: Self = this.set("ValidationStatus", js.undefined)
  }
  
}

