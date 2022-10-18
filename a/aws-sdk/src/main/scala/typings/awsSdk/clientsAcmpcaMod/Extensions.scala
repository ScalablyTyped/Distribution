package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  /**
    * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID) and optional qualifiers. For more information, see NIST's definition of Object Identifier (OID). In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification paths that include this certificate.
    */
  var CertificatePolicies: js.UndefOr[CertificatePolicyList] = js.undefined
  
  /**
    *  Contains a sequence of one or more X.509 extensions, each of which consists of an object identifier (OID), a base64-encoded value, and the critical flag. For more information, see the Global OID reference database. 
    */
  var CustomExtensions: js.UndefOr[CustomExtensionList] = js.undefined
  
  /**
    * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated in the KeyUsage extension.
    */
  var ExtendedKeyUsage: js.UndefOr[ExtendedKeyUsageList] = js.undefined
  
  var KeyUsage: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.KeyUsage] = js.undefined
  
  /**
    * The subject alternative name extension allows identities to be bound to the subject of the certificate. These identities may be included in addition to or in place of the identity in the subject field of the certificate.
    */
  var SubjectAlternativeNames: js.UndefOr[GeneralNameList] = js.undefined
}
object Extensions {
  
  inline def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setCertificatePolicies(value: CertificatePolicyList): Self = StObject.set(x, "CertificatePolicies", value.asInstanceOf[js.Any])
    
    inline def setCertificatePoliciesUndefined: Self = StObject.set(x, "CertificatePolicies", js.undefined)
    
    inline def setCertificatePoliciesVarargs(value: PolicyInformation*): Self = StObject.set(x, "CertificatePolicies", js.Array(value*))
    
    inline def setCustomExtensions(value: CustomExtensionList): Self = StObject.set(x, "CustomExtensions", value.asInstanceOf[js.Any])
    
    inline def setCustomExtensionsUndefined: Self = StObject.set(x, "CustomExtensions", js.undefined)
    
    inline def setCustomExtensionsVarargs(value: CustomExtension*): Self = StObject.set(x, "CustomExtensions", js.Array(value*))
    
    inline def setExtendedKeyUsage(value: ExtendedKeyUsageList): Self = StObject.set(x, "ExtendedKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageUndefined: Self = StObject.set(x, "ExtendedKeyUsage", js.undefined)
    
    inline def setExtendedKeyUsageVarargs(value: ExtendedKeyUsage*): Self = StObject.set(x, "ExtendedKeyUsage", js.Array(value*))
    
    inline def setKeyUsage(value: KeyUsage): Self = StObject.set(x, "KeyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "KeyUsage", js.undefined)
    
    inline def setSubjectAlternativeNames(value: GeneralNameList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    inline def setSubjectAlternativeNamesVarargs(value: GeneralName*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value*))
  }
}
