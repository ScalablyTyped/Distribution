package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMitigationActionsTaskSummary extends StObject {
  
  /**
    *  The definition of the actions. 
    */
  var actionsDefinition: js.UndefOr[MitigationActionList] = js.undefined
  
  /**
    *  Includes only active violations. 
    */
  var onlyActiveViolationsIncluded: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    *  Includes suppressed alerts. 
    */
  var suppressedAlertsIncluded: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    *  Specifies the ML Detect findings to which the mitigation actions are applied. 
    */
  var target: js.UndefOr[DetectMitigationActionsTaskTarget] = js.undefined
  
  /**
    *  The date the task ended. 
    */
  var taskEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
  
  /**
    *  The date the task started. 
    */
  var taskStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The statistics of a mitigation action task. 
    */
  var taskStatistics: js.UndefOr[DetectMitigationActionsTaskStatistics] = js.undefined
  
  /**
    *  The status of the task. 
    */
  var taskStatus: js.UndefOr[DetectMitigationActionsTaskStatus] = js.undefined
  
  /**
    *  Specifies the time period of which violation events occurred between. 
    */
  var violationEventOccurrenceRange: js.UndefOr[ViolationEventOccurrenceRange] = js.undefined
}
object DetectMitigationActionsTaskSummary {
  
  inline def apply(): DetectMitigationActionsTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMitigationActionsTaskSummary]
  }
  
  extension [Self <: DetectMitigationActionsTaskSummary](x: Self) {
    
    inline def setActionsDefinition(value: MitigationActionList): Self = StObject.set(x, "actionsDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionsDefinitionUndefined: Self = StObject.set(x, "actionsDefinition", js.undefined)
    
    inline def setActionsDefinitionVarargs(value: MitigationAction*): Self = StObject.set(x, "actionsDefinition", js.Array(value*))
    
    inline def setOnlyActiveViolationsIncluded(value: PrimitiveBoolean): Self = StObject.set(x, "onlyActiveViolationsIncluded", value.asInstanceOf[js.Any])
    
    inline def setOnlyActiveViolationsIncludedUndefined: Self = StObject.set(x, "onlyActiveViolationsIncluded", js.undefined)
    
    inline def setSuppressedAlertsIncluded(value: PrimitiveBoolean): Self = StObject.set(x, "suppressedAlertsIncluded", value.asInstanceOf[js.Any])
    
    inline def setSuppressedAlertsIncludedUndefined: Self = StObject.set(x, "suppressedAlertsIncluded", js.undefined)
    
    inline def setTarget(value: DetectMitigationActionsTaskTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTaskEndTime(value: js.Date): Self = StObject.set(x, "taskEndTime", value.asInstanceOf[js.Any])
    
    inline def setTaskEndTimeUndefined: Self = StObject.set(x, "taskEndTime", js.undefined)
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTaskStartTime(value: js.Date): Self = StObject.set(x, "taskStartTime", value.asInstanceOf[js.Any])
    
    inline def setTaskStartTimeUndefined: Self = StObject.set(x, "taskStartTime", js.undefined)
    
    inline def setTaskStatistics(value: DetectMitigationActionsTaskStatistics): Self = StObject.set(x, "taskStatistics", value.asInstanceOf[js.Any])
    
    inline def setTaskStatisticsUndefined: Self = StObject.set(x, "taskStatistics", js.undefined)
    
    inline def setTaskStatus(value: DetectMitigationActionsTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
    
    inline def setViolationEventOccurrenceRange(value: ViolationEventOccurrenceRange): Self = StObject.set(x, "violationEventOccurrenceRange", value.asInstanceOf[js.Any])
    
    inline def setViolationEventOccurrenceRangeUndefined: Self = StObject.set(x, "violationEventOccurrenceRange", js.undefined)
  }
}
