package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRumMetricDefinitionsRequest extends StObject {
  
  /**
    * The name of the CloudWatch RUM app monitor that is sending these metrics.
    */
  var AppMonitorName: typings.awsSdk.clientsRumMod.AppMonitorName
  
  /**
    * Defines the destination where you want to stop sending the specified metrics. Valid values are CloudWatch and Evidently. If you specify Evidently, you must also specify the ARN of the CloudWatchEvidently experiment that is to be the destination and an IAM role that has permission to write to the experiment.
    */
  var Destination: MetricDestination
  
  /**
    * This parameter is required if Destination is Evidently. If Destination is CloudWatch, do not use this parameter.  This parameter specifies the ARN of the Evidently experiment that was receiving the metrics that are being deleted.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRumMod.DestinationArn] = js.undefined
  
  /**
    * An array of structures which define the metrics that you want to stop sending.
    */
  var MetricDefinitionIds: typings.awsSdk.clientsRumMod.MetricDefinitionIds
}
object BatchDeleteRumMetricDefinitionsRequest {
  
  inline def apply(
    AppMonitorName: AppMonitorName,
    Destination: MetricDestination,
    MetricDefinitionIds: MetricDefinitionIds
  ): BatchDeleteRumMetricDefinitionsRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], MetricDefinitionIds = MetricDefinitionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRumMetricDefinitionsRequest]
  }
  
  extension [Self <: BatchDeleteRumMetricDefinitionsRequest](x: Self) {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setMetricDefinitionIds(value: MetricDefinitionIds): Self = StObject.set(x, "MetricDefinitionIds", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionIdsVarargs(value: MetricDefinitionId*): Self = StObject.set(x, "MetricDefinitionIds", js.Array(value*))
  }
}
