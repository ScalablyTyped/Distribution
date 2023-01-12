package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowUpdate extends StObject {
  
  /**
    * The status of the investigation into the finding. The workflow status is specific to an individual finding. It does not affect the generation of new findings. For example, setting the workflow status to SUPPRESSED or RESOLVED does not prevent a new finding for the same issue. The allowed values are the following.    NEW - The initial state of a finding, before it is reviewed. Security Hub also resets WorkFlowStatus from NOTIFIED or RESOLVED to NEW in the following cases:   The record state changes from ARCHIVED to ACTIVE.   The compliance status changes from PASSED to either WARNING, FAILED, or NOT_AVAILABLE.      NOTIFIED - Indicates that you notified the resource owner about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.    SUPPRESSED - Indicates that you reviewed the finding and do not believe that any action is needed. The finding is no longer updated.  
    */
  var Status: js.UndefOr[WorkflowStatus] = js.undefined
}
object WorkflowUpdate {
  
  inline def apply(): WorkflowUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowUpdate] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: WorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
