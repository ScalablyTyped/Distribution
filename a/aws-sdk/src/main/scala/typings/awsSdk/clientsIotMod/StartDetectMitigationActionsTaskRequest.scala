package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDetectMitigationActionsTaskRequest extends StObject {
  
  /**
    *  The actions to be performed when a device has unexpected behavior. 
    */
  var actions: DetectMitigationActionsToExecuteList
  
  /**
    *  Each mitigation action task must have a unique client request token. If you try to create a new task with the same token as a task that already exists, an exception occurs. If you omit this value, Amazon Web Services SDKs will automatically generate a unique client request. 
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    *  Specifies to list only active violations. 
    */
  var includeOnlyActiveViolations: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  Specifies to include suppressed alerts. 
    */
  var includeSuppressedAlerts: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  Specifies the ML Detect findings to which the mitigation actions are applied. 
    */
  var target: DetectMitigationActionsTaskTarget
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: MitigationActionsTaskId
  
  /**
    *  Specifies the time period of which violation events occurred between. 
    */
  var violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange] = js.undefined
}
object StartDetectMitigationActionsTaskRequest {
  
  inline def apply(
    actions: DetectMitigationActionsToExecuteList,
    clientRequestToken: ClientRequestToken,
    target: DetectMitigationActionsTaskTarget,
    taskId: MitigationActionsTaskId
  ): StartDetectMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], clientRequestToken = clientRequestToken.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDetectMitigationActionsTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDetectMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setActions(value: DetectMitigationActionsToExecuteList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: MitigationActionName*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnlyActiveViolations(value: NullableBoolean): Self = StObject.set(x, "includeOnlyActiveViolations", value.asInstanceOf[js.Any])
    
    inline def setIncludeOnlyActiveViolationsUndefined: Self = StObject.set(x, "includeOnlyActiveViolations", js.undefined)
    
    inline def setIncludeSuppressedAlerts(value: NullableBoolean): Self = StObject.set(x, "includeSuppressedAlerts", value.asInstanceOf[js.Any])
    
    inline def setIncludeSuppressedAlertsUndefined: Self = StObject.set(x, "includeSuppressedAlerts", js.undefined)
    
    inline def setTarget(value: DetectMitigationActionsTaskTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setViolationEventOccurrenceRange(value: ViolationEventOccurrenceRange): Self = StObject.set(x, "violationEventOccurrenceRange", value.asInstanceOf[js.Any])
    
    inline def setViolationEventOccurrenceRangeUndefined: Self = StObject.set(x, "violationEventOccurrenceRange", js.undefined)
  }
}
