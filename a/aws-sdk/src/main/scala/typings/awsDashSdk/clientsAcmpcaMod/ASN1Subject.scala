package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASN1Subject extends js.Object {
  /**
    * Fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var CommonName: js.UndefOr[String64] = js.undefined
  /**
    * Two-digit code that specifies the country in which the certificate subject located.
    */
  var Country: js.UndefOr[CountryCodeString] = js.undefined
  /**
    * Disambiguating information for the certificate subject.
    */
  var DistinguishedNameQualifier: js.UndefOr[DistinguishedNameQualifierString] = js.undefined
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var GenerationQualifier: js.UndefOr[String3] = js.undefined
  /**
    * First name.
    */
  var GivenName: js.UndefOr[String16] = js.undefined
  /**
    * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the SurName.
    */
  var Initials: js.UndefOr[String5] = js.undefined
  /**
    * The locality (such as a city or town) in which the certificate subject is located.
    */
  var Locality: js.UndefOr[String128] = js.undefined
  /**
    * Legal name of the organization with which the certificate subject is affiliated. 
    */
  var Organization: js.UndefOr[String64] = js.undefined
  /**
    * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated.
    */
  var OrganizationalUnit: js.UndefOr[String64] = js.undefined
  /**
    * Typically a shortened version of a longer GivenName. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza.
    */
  var Pseudonym: js.UndefOr[String128] = js.undefined
  /**
    * The certificate serial number.
    */
  var SerialNumber: js.UndefOr[String64] = js.undefined
  /**
    * State in which the subject of the certificate is located.
    */
  var State: js.UndefOr[String128] = js.undefined
  /**
    * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first.
    */
  var Surname: js.UndefOr[String40] = js.undefined
  /**
    * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
    */
  var Title: js.UndefOr[String64] = js.undefined
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
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (DistinguishedNameQualifier != null) __obj.updateDynamic("DistinguishedNameQualifier")(DistinguishedNameQualifier)
    if (GenerationQualifier != null) __obj.updateDynamic("GenerationQualifier")(GenerationQualifier)
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName)
    if (Initials != null) __obj.updateDynamic("Initials")(Initials)
    if (Locality != null) __obj.updateDynamic("Locality")(Locality)
    if (Organization != null) __obj.updateDynamic("Organization")(Organization)
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit)
    if (Pseudonym != null) __obj.updateDynamic("Pseudonym")(Pseudonym)
    if (SerialNumber != null) __obj.updateDynamic("SerialNumber")(SerialNumber)
    if (State != null) __obj.updateDynamic("State")(State)
    if (Surname != null) __obj.updateDynamic("Surname")(Surname)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[ASN1Subject]
  }
}

