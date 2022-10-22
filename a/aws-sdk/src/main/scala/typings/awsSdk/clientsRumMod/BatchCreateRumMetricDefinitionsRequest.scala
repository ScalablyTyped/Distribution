package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRumMetricDefinitionsRequest extends StObject {
  
  /**
    * The name of the CloudWatch RUM app monitor that is to send the metrics.
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
    * An array of structures which define the metrics that you want to send.
    */
  var MetricDefinitions: MetricDefinitionsRequest
}
object BatchCreateRumMetricDefinitionsRequest {
  
  inline def apply(
    AppMonitorName: AppMonitorName,
    Destination: MetricDestination,
    MetricDefinitions: MetricDefinitionsRequest
  ): BatchCreateRumMetricDefinitionsRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], MetricDefinitions = MetricDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateRumMetricDefinitionsRequest]
  }
  
  extension [Self <: BatchCreateRumMetricDefinitionsRequest](x: Self) {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setMetricDefinitions(value: MetricDefinitionsRequest): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinitionRequest*): Self = StObject.set(x, "MetricDefinitions", js.Array(value*))
  }
}
