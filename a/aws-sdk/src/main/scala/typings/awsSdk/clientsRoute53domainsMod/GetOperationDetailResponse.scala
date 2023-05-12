package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperationDetailResponse extends StObject {
  
  /**
    * The name of a domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.DomainName] = js.undefined
  
  /**
    *  The date when the operation was last updated. 
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Detailed information on the status including possible errors.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The identifier for the operation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.OperationId] = js.undefined
  
  /**
    * The current status of the requested operation in the system.
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    *  Lists any outstanding operations that require customer action. Valid values are:    PENDING_ACCEPTANCE: The operation is waiting for acceptance from the account that is receiving the domain.    PENDING_CUSTOMER_ACTION: The operation is waiting for customer action, for example, returning an email.    PENDING_AUTHORIZATION: The operation is waiting for the form of authorization. For more information, see ResendOperationAuthorization.    PENDING_PAYMENT_VERIFICATION: The operation is waiting for the payment method to validate.    PENDING_SUPPORT_CASE: The operation includes a support case and is waiting for its resolution.  
    */
  var StatusFlag: js.UndefOr[typings.awsSdk.clientsRoute53domainsMod.StatusFlag] = js.undefined
  
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of operation that was requested.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
}
object GetOperationDetailResponse {
  
  inline def apply(): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOperationDetailResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusFlag(value: StatusFlag): Self = StObject.set(x, "StatusFlag", value.asInstanceOf[js.Any])
    
    inline def setStatusFlagUndefined: Self = StObject.set(x, "StatusFlag", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubmittedDate(value: js.Date): Self = StObject.set(x, "SubmittedDate", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDateUndefined: Self = StObject.set(x, "SubmittedDate", js.undefined)
    
    inline def setType(value: OperationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
