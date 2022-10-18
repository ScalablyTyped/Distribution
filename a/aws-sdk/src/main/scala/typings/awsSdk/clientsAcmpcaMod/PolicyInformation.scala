package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyInformation extends StObject {
  
  /**
    * Specifies the object identifier (OID) of the certificate policy under which the certificate was issued. For more information, see NIST's definition of Object Identifier (OID).
    */
  var CertPolicyId: CustomObjectIdentifier
  
  /**
    * Modifies the given CertPolicyId with a qualifier. ACM Private CA supports the certification practice statement (CPS) qualifier.
    */
  var PolicyQualifiers: js.UndefOr[PolicyQualifierInfoList] = js.undefined
}
object PolicyInformation {
  
  inline def apply(CertPolicyId: CustomObjectIdentifier): PolicyInformation = {
    val __obj = js.Dynamic.literal(CertPolicyId = CertPolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyInformation]
  }
  
  extension [Self <: PolicyInformation](x: Self) {
    
    inline def setCertPolicyId(value: CustomObjectIdentifier): Self = StObject.set(x, "CertPolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiers(value: PolicyQualifierInfoList): Self = StObject.set(x, "PolicyQualifiers", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiersUndefined: Self = StObject.set(x, "PolicyQualifiers", js.undefined)
    
    inline def setPolicyQualifiersVarargs(value: PolicyQualifierInfo*): Self = StObject.set(x, "PolicyQualifiers", js.Array(value*))
  }
}
