package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditCheckDetails extends StObject {
  
  /**
    * True if the check is complete and found all resources compliant.
    */
  var checkCompliant: js.UndefOr[CheckCompliant] = js.undefined
  
  /**
    * The completion status of this check. One of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
    */
  var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.undefined
  
  /**
    * The code of any error encountered when this check is performed during this audit. One of "INSUFFICIENT_PERMISSIONS" or "AUDIT_CHECK_DISABLED".
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The message associated with any error encountered when this check is performed during this audit.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The number of resources that were found noncompliant during the check.
    */
  var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.undefined
  
  /**
    *  Describes how many of the non-compliant resources created during the evaluation of an audit check were marked as suppressed. 
    */
  var suppressedNonCompliantResourcesCount: js.UndefOr[SuppressedNonCompliantResourcesCount] = js.undefined
  
  /**
    * The number of resources on which the check was performed.
    */
  var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.undefined
}
object AuditCheckDetails {
  
  inline def apply(): AuditCheckDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditCheckDetails]
  }
  
  extension [Self <: AuditCheckDetails](x: Self) {
    
    inline def setCheckCompliant(value: CheckCompliant): Self = StObject.set(x, "checkCompliant", value.asInstanceOf[js.Any])
    
    inline def setCheckCompliantUndefined: Self = StObject.set(x, "checkCompliant", js.undefined)
    
    inline def setCheckRunStatus(value: AuditCheckRunStatus): Self = StObject.set(x, "checkRunStatus", value.asInstanceOf[js.Any])
    
    inline def setCheckRunStatusUndefined: Self = StObject.set(x, "checkRunStatus", js.undefined)
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNonCompliantResourcesCount(value: NonCompliantResourcesCount): Self = StObject.set(x, "nonCompliantResourcesCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantResourcesCountUndefined: Self = StObject.set(x, "nonCompliantResourcesCount", js.undefined)
    
    inline def setSuppressedNonCompliantResourcesCount(value: SuppressedNonCompliantResourcesCount): Self = StObject.set(x, "suppressedNonCompliantResourcesCount", value.asInstanceOf[js.Any])
    
    inline def setSuppressedNonCompliantResourcesCountUndefined: Self = StObject.set(x, "suppressedNonCompliantResourcesCount", js.undefined)
    
    inline def setTotalResourcesCount(value: TotalResourcesCount): Self = StObject.set(x, "totalResourcesCount", value.asInstanceOf[js.Any])
    
    inline def setTotalResourcesCountUndefined: Self = StObject.set(x, "totalResourcesCount", js.undefined)
  }
}
