package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASN1Subject extends StObject {
  
  /**
    * For CA and end-entity certificates in a private PKI, the common name (CN) can be any string within the length limit.  Note: In publicly trusted certificates, the common name must be a fully qualified domain name (FQDN) associated with the certificate subject.
    */
  var CommonName: js.UndefOr[String64] = js.undefined
  
  /**
    * Two-digit code that specifies the country in which the certificate subject located.
    */
  var Country: js.UndefOr[CountryCodeString] = js.undefined
  
  /**
    *  Contains a sequence of one or more X.500 relative distinguished names (RDNs), each of which consists of an object identifier (OID) and a value. For more information, see NIST’s definition of Object Identifier (OID).  Custom attributes cannot be used in combination with standard attributes. 
    */
  var CustomAttributes: js.UndefOr[CustomAttributeList] = js.undefined
  
  /**
    * Disambiguating information for the certificate subject.
    */
  var DistinguishedNameQualifier: js.UndefOr[ASN1PrintableString64] = js.undefined
  
  /**
    * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third.
    */
  var GenerationQualifier: js.UndefOr[String3] = js.undefined
  
  /**
    * First name.
    */
  var GivenName: js.UndefOr[String16] = js.undefined
  
  /**
    * Concatenation that typically contains the first letter of the GivenName, the first letter of the middle name if one exists, and the first letter of the Surname.
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
  var SerialNumber: js.UndefOr[ASN1PrintableString64] = js.undefined
  
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
  
  inline def apply(): ASN1Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ASN1Subject]
  }
  
  extension [Self <: ASN1Subject](x: Self) {
    
    inline def setCommonName(value: String64): Self = StObject.set(x, "CommonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "CommonName", js.undefined)
    
    inline def setCountry(value: CountryCodeString): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setCustomAttributes(value: CustomAttributeList): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "CustomAttributes", js.Array(value*))
    
    inline def setDistinguishedNameQualifier(value: ASN1PrintableString64): Self = StObject.set(x, "DistinguishedNameQualifier", value.asInstanceOf[js.Any])
    
    inline def setDistinguishedNameQualifierUndefined: Self = StObject.set(x, "DistinguishedNameQualifier", js.undefined)
    
    inline def setGenerationQualifier(value: String3): Self = StObject.set(x, "GenerationQualifier", value.asInstanceOf[js.Any])
    
    inline def setGenerationQualifierUndefined: Self = StObject.set(x, "GenerationQualifier", js.undefined)
    
    inline def setGivenName(value: String16): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    inline def setInitials(value: String5): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
    
    inline def setInitialsUndefined: Self = StObject.set(x, "Initials", js.undefined)
    
    inline def setLocality(value: String128): Self = StObject.set(x, "Locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "Locality", js.undefined)
    
    inline def setOrganization(value: String64): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
    
    inline def setOrganizationalUnit(value: String64): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
    
    inline def setPseudonym(value: String128): Self = StObject.set(x, "Pseudonym", value.asInstanceOf[js.Any])
    
    inline def setPseudonymUndefined: Self = StObject.set(x, "Pseudonym", js.undefined)
    
    inline def setSerialNumber(value: ASN1PrintableString64): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setState(value: String128): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSurname(value: String40): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    inline def setTitle(value: String64): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
