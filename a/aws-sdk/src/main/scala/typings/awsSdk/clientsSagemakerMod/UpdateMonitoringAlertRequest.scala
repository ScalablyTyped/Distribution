package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitoringAlertRequest extends StObject {
  
  /**
    * Within EvaluationPeriod, how many execution failures will raise an alert.
    */
  var DatapointsToAlert: MonitoringDatapointsToAlert
  
  /**
    * The number of most recent monitoring executions to consider when evaluating alert status.
    */
  var EvaluationPeriod: MonitoringEvaluationPeriod
  
  /**
    * The name of a monitoring alert.
    */
  var MonitoringAlertName: typings.awsSdk.clientsSagemakerMod.MonitoringAlertName
  
  /**
    * The name of a monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
}
object UpdateMonitoringAlertRequest {
  
  inline def apply(
    DatapointsToAlert: MonitoringDatapointsToAlert,
    EvaluationPeriod: MonitoringEvaluationPeriod,
    MonitoringAlertName: MonitoringAlertName,
    MonitoringScheduleName: MonitoringScheduleName
  ): UpdateMonitoringAlertRequest = {
    val __obj = js.Dynamic.literal(DatapointsToAlert = DatapointsToAlert.asInstanceOf[js.Any], EvaluationPeriod = EvaluationPeriod.asInstanceOf[js.Any], MonitoringAlertName = MonitoringAlertName.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringAlertRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMonitoringAlertRequest] (val x: Self) extends AnyVal {
    
    inline def setDatapointsToAlert(value: MonitoringDatapointsToAlert): Self = StObject.set(x, "DatapointsToAlert", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriod(value: MonitoringEvaluationPeriod): Self = StObject.set(x, "EvaluationPeriod", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertName(value: MonitoringAlertName): Self = StObject.set(x, "MonitoringAlertName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
