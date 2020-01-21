package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.native
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
  var SerialNumber: js.UndefOr[String64] = js.native
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
  def apply(
    CommonName: String64 = null,
    Country: CountryCodeString = null,
    DistinguishedNameQualifier: DistinguishedNameQualifierString = null,
    GenerationQualifier: String3 = null,
    GivenName: String16 = null,
    Initials: String5 = null,
    Locality: String128 = null,
    Organization: String64 = null,
    OrganizationalUnit: String64 = null,
    Pseudonym: String128 = null,
    SerialNumber: String64 = null,
    State: String128 = null,
    Surname: String40 = null,
    Title: String64 = null
  ): ASN1Subject = {
    val __obj = js.Dynamic.literal()
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (DistinguishedNameQualifier != null) __obj.updateDynamic("DistinguishedNameQualifier")(DistinguishedNameQualifier.asInstanceOf[js.Any])
    if (GenerationQualifier != null) __obj.updateDynamic("GenerationQualifier")(GenerationQualifier.asInstanceOf[js.Any])
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName.asInstanceOf[js.Any])
    if (Initials != null) __obj.updateDynamic("Initials")(Initials.asInstanceOf[js.Any])
    if (Locality != null) __obj.updateDynamic("Locality")(Locality.asInstanceOf[js.Any])
    if (Organization != null) __obj.updateDynamic("Organization")(Organization.asInstanceOf[js.Any])
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    if (Pseudonym != null) __obj.updateDynamic("Pseudonym")(Pseudonym.asInstanceOf[js.Any])
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Surname != null) __obj.updateDynamic("Surname")(Surname.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1Subject]
  }
}

