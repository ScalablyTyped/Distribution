package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewalSummary extends StObject {
  
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: DomainValidationList
  
  /**
    * The status of ACM's managed renewal of the certificate.
    */
  var RenewalStatus: typings.awsSdk.clientsAcmMod.RenewalStatus
  
  /**
    * The reason that a renewal request was unsuccessful.
    */
  var RenewalStatusReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The time at which the renewal summary was last updated.
    */
  var UpdatedAt: js.Date
}
object RenewalSummary {
  
  inline def apply(DomainValidationOptions: DomainValidationList, RenewalStatus: RenewalStatus, UpdatedAt: js.Date): RenewalSummary = {
    val __obj = js.Dynamic.literal(DomainValidationOptions = DomainValidationOptions.asInstanceOf[js.Any], RenewalStatus = RenewalStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenewalSummary] (val x: Self) extends AnyVal {
    
    inline def setDomainValidationOptions(value: DomainValidationList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value*))
    
    inline def setRenewalStatus(value: RenewalStatus): Self = StObject.set(x, "RenewalStatus", value.asInstanceOf[js.Any])
    
    inline def setRenewalStatusReason(value: FailureReason): Self = StObject.set(x, "RenewalStatusReason", value.asInstanceOf[js.Any])
    
    inline def setRenewalStatusReasonUndefined: Self = StObject.set(x, "RenewalStatusReason", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
