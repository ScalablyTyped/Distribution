package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditMitigationActionsTaskTarget extends StObject {
  
  /**
    * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the audit to which the audit mitigation actions task apply.
    */
  var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter] = js.undefined
  
  /**
    * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.undefined
  
  /**
    * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those findings.
    */
  var findingIds: js.UndefOr[FindingIds] = js.undefined
}
object AuditMitigationActionsTaskTarget {
  
  inline def apply(): AuditMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
  }
  
  extension [Self <: AuditMitigationActionsTaskTarget](x: Self) {
    
    inline def setAuditCheckToReasonCodeFilter(value: AuditCheckToReasonCodeFilter): Self = StObject.set(x, "auditCheckToReasonCodeFilter", value.asInstanceOf[js.Any])
    
    inline def setAuditCheckToReasonCodeFilterUndefined: Self = StObject.set(x, "auditCheckToReasonCodeFilter", js.undefined)
    
    inline def setAuditTaskId(value: AuditTaskId): Self = StObject.set(x, "auditTaskId", value.asInstanceOf[js.Any])
    
    inline def setAuditTaskIdUndefined: Self = StObject.set(x, "auditTaskId", js.undefined)
    
    inline def setFindingIds(value: FindingIds): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsUndefined: Self = StObject.set(x, "findingIds", js.undefined)
    
    inline def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "findingIds", js.Array(value*))
  }
}
