package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringAlertSummary extends StObject {
  
  /**
    * A list of alert actions taken in response to an alert going into InAlert status.
    */
  var Actions: MonitoringAlertActions
  
  /**
    * The current status of an alert.
    */
  var AlertStatus: MonitoringAlertStatus
  
  /**
    * A timestamp that indicates when a monitor alert was created.
    */
  var CreationTime: js.Date
  
  /**
    * Within EvaluationPeriod, how many execution failures will raise an alert.
    */
  var DatapointsToAlert: MonitoringDatapointsToAlert
  
  /**
    * The number of most recent monitoring executions to consider when evaluating alert status.
    */
  var EvaluationPeriod: MonitoringEvaluationPeriod
  
  /**
    * A timestamp that indicates when a monitor alert was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The name of a monitoring alert.
    */
  var MonitoringAlertName: typings.awsSdk.clientsSagemakerMod.MonitoringAlertName
}
object MonitoringAlertSummary {
  
  inline def apply(
    Actions: MonitoringAlertActions,
    AlertStatus: MonitoringAlertStatus,
    CreationTime: js.Date,
    DatapointsToAlert: MonitoringDatapointsToAlert,
    EvaluationPeriod: MonitoringEvaluationPeriod,
    LastModifiedTime: js.Date,
    MonitoringAlertName: MonitoringAlertName
  ): MonitoringAlertSummary = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], AlertStatus = AlertStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], DatapointsToAlert = DatapointsToAlert.asInstanceOf[js.Any], EvaluationPeriod = EvaluationPeriod.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringAlertName = MonitoringAlertName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringAlertSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringAlertSummary] (val x: Self) extends AnyVal {
    
    inline def setActions(value: MonitoringAlertActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setAlertStatus(value: MonitoringAlertStatus): Self = StObject.set(x, "AlertStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDatapointsToAlert(value: MonitoringDatapointsToAlert): Self = StObject.set(x, "DatapointsToAlert", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriod(value: MonitoringEvaluationPeriod): Self = StObject.set(x, "EvaluationPeriod", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertName(value: MonitoringAlertName): Self = StObject.set(x, "MonitoringAlertName", value.asInstanceOf[js.Any])
  }
}
