package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewalSummary extends StObject {
  
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to ACM's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var DomainValidationOptions: DomainValidationList = js.native
  
  /**
    * The status of ACM's managed renewal of the certificate.
    */
  var RenewalStatus: typings.awsSdk.acmMod.RenewalStatus = js.native
  
  /**
    * The reason that a renewal request was unsuccessful.
    */
  var RenewalStatusReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The time at which the renewal summary was last updated.
    */
  var UpdatedAt: TStamp = js.native
}
object RenewalSummary {
  
  @scala.inline
  def apply(DomainValidationOptions: DomainValidationList, RenewalStatus: RenewalStatus, UpdatedAt: TStamp): RenewalSummary = {
    val __obj = js.Dynamic.literal(DomainValidationOptions = DomainValidationOptions.asInstanceOf[js.Any], RenewalStatus = RenewalStatus.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSummary]
  }
  
  @scala.inline
  implicit class RenewalSummaryMutableBuilder[Self <: RenewalSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainValidationOptions(value: DomainValidationList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setRenewalStatus(value: RenewalStatus): Self = StObject.set(x, "RenewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReason(value: FailureReason): Self = StObject.set(x, "RenewalStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReasonUndefined: Self = StObject.set(x, "RenewalStatusReason", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: TStamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
