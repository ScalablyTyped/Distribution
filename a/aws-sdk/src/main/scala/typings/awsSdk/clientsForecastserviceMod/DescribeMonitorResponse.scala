package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMonitorResponse extends StObject {
  
  /**
    * Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring results for an auto predictor.
    */
  var Baseline: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Baseline] = js.undefined
  
  /**
    * The timestamp for when the monitor resource was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
    */
  var EstimatedEvaluationTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * The state of the monitor's latest evaluation.
    */
  var LastEvaluationState: js.UndefOr[EvaluationState] = js.undefined
  
  /**
    * The timestamp of the latest evaluation completed by the monitor.
    */
  var LastEvaluationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the latest modification to the monitor.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An error message, if any, for the monitor.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource described.
    */
  var MonitorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the monitor.
    */
  var MonitorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the auto predictor being monitored.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the monitor resource.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object DescribeMonitorResponse {
  
  inline def apply(): DescribeMonitorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMonitorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMonitorResponse] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Baseline): Self = StObject.set(x, "Baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "Baseline", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEstimatedEvaluationTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedEvaluationTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedEvaluationTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedEvaluationTimeRemainingInMinutes", js.undefined)
    
    inline def setLastEvaluationState(value: EvaluationState): Self = StObject.set(x, "LastEvaluationState", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluationStateUndefined: Self = StObject.set(x, "LastEvaluationState", js.undefined)
    
    inline def setLastEvaluationTime(value: js.Date): Self = StObject.set(x, "LastEvaluationTime", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluationTimeUndefined: Self = StObject.set(x, "LastEvaluationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setMonitorName(value: Name): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setMonitorNameUndefined: Self = StObject.set(x, "MonitorName", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
