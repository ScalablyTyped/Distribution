package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRumMetricDefinitionRequest extends StObject {
  
  /**
    * The name of the CloudWatch RUM app monitor that sends these metrics.
    */
  var AppMonitorName: typings.awsSdk.clientsRumMod.AppMonitorName
  
  /**
    * The destination to send the metrics to. Valid values are CloudWatch and Evidently. If you specify Evidently, you must also specify the ARN of the CloudWatchEvidently experiment that will receive the metrics and an IAM role that has permission to write to the experiment.
    */
  var Destination: MetricDestination
  
  /**
    * This parameter is required if Destination is Evidently. If Destination is CloudWatch, do not use this parameter. This parameter specifies the ARN of the Evidently experiment that is to receive the metrics. You must have already defined this experiment as a valid destination. For more information, see PutRumMetricsDestination.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRumMod.DestinationArn] = js.undefined
  
  /**
    * A structure that contains the new definition that you want to use for this metric.
    */
  var MetricDefinition: MetricDefinitionRequest
  
  /**
    * The ID of the metric definition to update.
    */
  var MetricDefinitionId: typings.awsSdk.clientsRumMod.MetricDefinitionId
}
object UpdateRumMetricDefinitionRequest {
  
  inline def apply(
    AppMonitorName: AppMonitorName,
    Destination: MetricDestination,
    MetricDefinition: MetricDefinitionRequest,
    MetricDefinitionId: MetricDefinitionId
  ): UpdateRumMetricDefinitionRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], MetricDefinition = MetricDefinition.asInstanceOf[js.Any], MetricDefinitionId = MetricDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRumMetricDefinitionRequest]
  }
  
  extension [Self <: UpdateRumMetricDefinitionRequest](x: Self) {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setMetricDefinition(value: MetricDefinitionRequest): Self = StObject.set(x, "MetricDefinition", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionId(value: MetricDefinitionId): Self = StObject.set(x, "MetricDefinitionId", value.asInstanceOf[js.Any])
  }
}
