package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRumMetricDefinitionsRequest extends StObject {
  
  /**
    * The name of the CloudWatch RUM app monitor that is sending the metrics.
    */
  var AppMonitorName: typings.awsSdk.clientsRumMod.AppMonitorName
  
  /**
    * The type of destination that you want to view metrics for. Valid values are CloudWatch and Evidently.
    */
  var Destination: MetricDestination
  
  /**
    * This parameter is required if Destination is Evidently. If Destination is CloudWatch, do not use this parameter. This parameter specifies the ARN of the Evidently experiment that corresponds to the destination.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRumMod.DestinationArn] = js.undefined
  
  /**
    * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is 100. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object BatchGetRumMetricDefinitionsRequest {
  
  inline def apply(AppMonitorName: AppMonitorName, Destination: MetricDestination): BatchGetRumMetricDefinitionsRequest = {
    val __obj = js.Dynamic.literal(AppMonitorName = AppMonitorName.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRumMetricDefinitionsRequest]
  }
  
  extension [Self <: BatchGetRumMetricDefinitionsRequest](x: Self) {
    
    inline def setAppMonitorName(value: AppMonitorName): Self = StObject.set(x, "AppMonitorName", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
