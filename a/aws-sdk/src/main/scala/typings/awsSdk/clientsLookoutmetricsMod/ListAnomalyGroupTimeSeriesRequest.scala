package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupTimeSeriesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the anomaly detector.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: UUID
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MaxResults] = js.undefined
  
  /**
    * The name of the measure field.
    */
  var MetricName: typings.awsSdk.clientsLookoutmetricsMod.MetricName
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object ListAnomalyGroupTimeSeriesRequest {
  
  inline def apply(AnomalyDetectorArn: Arn, AnomalyGroupId: UUID, MetricName: MetricName): ListAnomalyGroupTimeSeriesRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any], AnomalyGroupId = AnomalyGroupId.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomalyGroupTimeSeriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnomalyGroupTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
