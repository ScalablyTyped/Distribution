package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPostLaunchActionsLaunchStatus extends StObject {
  
  /**
    * AWS Systems Manager Document's execution ID of the of the Job Post Launch Actions.
    */
  var executionID: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * AWS Systems Manager Document's execution status.
    */
  var executionStatus: js.UndefOr[PostLaunchActionExecutionStatus] = js.undefined
  
  /**
    * AWS Systems Manager Document's failure reason.
    */
  var failureReason: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * AWS Systems Manager's Document of the of the Job Post Launch Actions.
    */
  var ssmDocument: js.UndefOr[SsmDocument] = js.undefined
  
  /**
    * AWS Systems Manager Document type.
    */
  var ssmDocumentType: js.UndefOr[SsmDocumentType] = js.undefined
}
object JobPostLaunchActionsLaunchStatus {
  
  inline def apply(): JobPostLaunchActionsLaunchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobPostLaunchActionsLaunchStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobPostLaunchActionsLaunchStatus] (val x: Self) extends AnyVal {
    
    inline def setExecutionID(value: BoundedString): Self = StObject.set(x, "executionID", value.asInstanceOf[js.Any])
    
    inline def setExecutionIDUndefined: Self = StObject.set(x, "executionID", js.undefined)
    
    inline def setExecutionStatus(value: PostLaunchActionExecutionStatus): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setFailureReason(value: BoundedString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setSsmDocument(value: SsmDocument): Self = StObject.set(x, "ssmDocument", value.asInstanceOf[js.Any])
    
    inline def setSsmDocumentType(value: SsmDocumentType): Self = StObject.set(x, "ssmDocumentType", value.asInstanceOf[js.Any])
    
    inline def setSsmDocumentTypeUndefined: Self = StObject.set(x, "ssmDocumentType", js.undefined)
    
    inline def setSsmDocumentUndefined: Self = StObject.set(x, "ssmDocument", js.undefined)
  }
}
