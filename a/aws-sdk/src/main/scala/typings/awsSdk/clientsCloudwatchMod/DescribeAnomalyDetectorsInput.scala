package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectorsInput extends StObject {
  
  /**
    * The anomaly detector types to request when using DescribeAnomalyDetectorsInput. If empty, defaults to SINGLE_METRIC.
    */
  var AnomalyDetectorTypes: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AnomalyDetectorTypes] = js.undefined
  
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're all returned.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  
  /**
    * The maximum number of results to return in one operation. The maximum value that you can specify is 100. To retrieve the remaining results, make another call with the returned NextToken value. 
    */
  var MaxResults: js.UndefOr[MaxReturnedResultsCount] = js.undefined
  
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified metric name. If there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all returned.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricName] = js.undefined
  
  /**
    * Limits the results to only the anomaly detection models that are associated with the specified namespace.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Namespace] = js.undefined
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object DescribeAnomalyDetectorsInput {
  
  inline def apply(): DescribeAnomalyDetectorsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectorsInput]
  }
  
  extension [Self <: DescribeAnomalyDetectorsInput](x: Self) {
    
    inline def setAnomalyDetectorTypes(value: AnomalyDetectorTypes): Self = StObject.set(x, "AnomalyDetectorTypes", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorTypesUndefined: Self = StObject.set(x, "AnomalyDetectorTypes", js.undefined)
    
    inline def setAnomalyDetectorTypesVarargs(value: AnomalyDetectorType*): Self = StObject.set(x, "AnomalyDetectorTypes", js.Array(value*))
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setMaxResults(value: MaxReturnedResultsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
