package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetMetricResponse extends StObject {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.undefined
  
  /**
    * The type of the aggregation query.
    */
  var aggregationType: js.UndefOr[AggregationType] = js.undefined
  
  /**
    * The date when the fleet metric is created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The fleet metric description.
    */
  var description: js.UndefOr[FleetMetricDescription] = js.undefined
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The date when the fleet metric is last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the fleet metric to describe.
    */
  var metricArn: js.UndefOr[FleetMetricArn] = js.undefined
  
  /**
    * The name of the fleet metric to describe.
    */
  var metricName: js.UndefOr[FleetMetricName] = js.undefined
  
  /**
    * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
    */
  var period: js.UndefOr[FleetMetricPeriod] = js.undefined
  
  /**
    * The search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  
  /**
    * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by CW metric.
    */
  var unit: js.UndefOr[FleetMetricUnit] = js.undefined
  
  /**
    * The version of the fleet metric.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object DescribeFleetMetricResponse {
  
  inline def apply(): DescribeFleetMetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetMetricResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetMetricResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setAggregationFieldUndefined: Self = StObject.set(x, "aggregationField", js.undefined)
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: FleetMetricDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setMetricArn(value: FleetMetricArn): Self = StObject.set(x, "metricArn", value.asInstanceOf[js.Any])
    
    inline def setMetricArnUndefined: Self = StObject.set(x, "metricArn", js.undefined)
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setPeriod(value: FleetMetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    inline def setUnit(value: FleetMetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
