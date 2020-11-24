package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASN1Subject extends js.Object {
  
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var CommonName: js.UndefOr[String64] = js.native
  
  /**
    * Two-digit code that specifies the country in which the certificate subject located.
    */
  var Country: js.UndefOr[CountryCodeString] = js.native
  
  /**
    * Disambiguating information for the certificate subject.
    */
  var DistinguishedNameQualifier: js.UndefOr[ASN1PrintableString64] = js.native
  
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var GenerationQualifier: js.UndefOr[String3] = js.native
  
  /**
    * First name.
    */
  var GivenName: js.UndefOr[String16] = js.native
  
  /**
    * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the SurName.
    */
  var Initials: js.UndefOr[String5] = js.native
  
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var Locality: js.UndefOr[String128] = js.native
  
  /**
    * Legal name of the organization with which the certificate subject is affiliated. 
    */
  var Organization: js.UndefOr[String64] = js.native
  
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var OrganizationalUnit: js.UndefOr[String64] = js.native
  
  /**
    * Typically a shortened version of a longer GivenName. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var Pseudonym: js.UndefOr[String128] = js.native
  
  /**
    * The certificate serial number.
    */
  var SerialNumber: js.UndefOr[ASN1PrintableString64] = js.native
  
  /**
    * State in which the subject of the certificate is located.
    */
  var State: js.UndefOr[String128] = js.native
  
  /**
    * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var Surname: js.UndefOr[String40] = js.native
  
  /**
    * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
    */
  var Title: js.UndefOr[String64] = js.native
}
object ASN1Subject {
  
  @scala.inline
  def apply(): ASN1Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ASN1Subject]
  }
  
  @scala.inline
  implicit class ASN1SubjectOps[Self <: ASN1Subject] (val x: Self) extends AnyVal {
    
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
    def setCommonName(value: String64): Self = this.set("CommonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonName: Self = this.set("CommonName", js.undefined)
    
    @scala.inline
    def setCountry(value: CountryCodeString): Self = this.set("Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("Country", js.undefined)
    
    @scala.inline
    def setDistinguishedNameQualifier(value: ASN1PrintableString64): Self = this.set("DistinguishedNameQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinguishedNameQualifier: Self = this.set("DistinguishedNameQualifier", js.undefined)
    
    @scala.inline
    def setGenerationQualifier(value: String3): Self = this.set("GenerationQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationQualifier: Self = this.set("GenerationQualifier", js.undefined)
    
    @scala.inline
    def setGivenName(value: String16): Self = this.set("GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("GivenName", js.undefined)
    
    @scala.inline
    def setInitials(value: String5): Self = this.set("Initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitials: Self = this.set("Initials", js.undefined)
    
    @scala.inline
    def setLocality(value: String128): Self = this.set("Locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("Locality", js.undefined)
    
    @scala.inline
    def setOrganization(value: String64): Self = this.set("Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("Organization", js.undefined)
    
    @scala.inline
    def setOrganizationalUnit(value: String64): Self = this.set("OrganizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("OrganizationalUnit", js.undefined)
    
    @scala.inline
    def setPseudonym(value: String128): Self = this.set("Pseudonym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePseudonym: Self = this.set("Pseudonym", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: ASN1PrintableString64): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("SerialNumber", js.undefined)
    
    @scala.inline
    def setState(value: String128): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setSurname(value: String40): Self = this.set("Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("Surname", js.undefined)
    
    @scala.inline
    def setTitle(value: String64): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
