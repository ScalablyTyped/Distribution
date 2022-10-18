package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationExecution extends StObject {
  
  var AlarmConfiguration: js.UndefOr[typings.awsSdk.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.clientsSsmMod.AssociationVersion] = js.undefined
  
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The execution ID for the association.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
  
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.ResourceCountByStatus] = js.undefined
  
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The CloudWatch alarms that were invoked by the association.
    */
  var TriggeredAlarms: js.UndefOr[AlarmStateInformationList] = js.undefined
}
object AssociationExecution {
  
  inline def apply(): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecution]
  }
  
  extension [Self <: AssociationExecution](x: Self) {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    inline def setExecutionId(value: AssociationExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    inline def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    inline def setResourceCountByStatus(value: ResourceCountByStatus): Self = StObject.set(x, "ResourceCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceCountByStatusUndefined: Self = StObject.set(x, "ResourceCountByStatus", js.undefined)
    
    inline def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTriggeredAlarms(value: AlarmStateInformationList): Self = StObject.set(x, "TriggeredAlarms", value.asInstanceOf[js.Any])
    
    inline def setTriggeredAlarmsUndefined: Self = StObject.set(x, "TriggeredAlarms", js.undefined)
    
    inline def setTriggeredAlarmsVarargs(value: AlarmStateInformation*): Self = StObject.set(x, "TriggeredAlarms", js.Array(value*))
  }
}
