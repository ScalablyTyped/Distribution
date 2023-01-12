package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetMetricRequest extends StObject {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.undefined
  
  /**
    * The type of the aggregation query.
    */
  var aggregationType: js.UndefOr[AggregationType] = js.undefined
  
  /**
    * The description of the fleet metric.
    */
  var description: js.UndefOr[FleetMetricDescription] = js.undefined
  
  /**
    * The expected version of the fleet metric record in the registry.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the index to search.
    */
  var indexName: IndexName
  
  /**
    * The name of the fleet metric to update.
    */
  var metricName: FleetMetricName
  
  /**
    * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
    */
  var period: js.UndefOr[FleetMetricPeriod] = js.undefined
  
  /**
    * The search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The version of the query.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  
  /**
    * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by CW metric.
    */
  var unit: js.UndefOr[FleetMetricUnit] = js.undefined
}
object UpdateFleetMetricRequest {
  
  inline def apply(indexName: IndexName, metricName: FleetMetricName): UpdateFleetMetricRequest = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetMetricRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFleetMetricRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setAggregationFieldUndefined: Self = StObject.set(x, "aggregationField", js.undefined)
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setAggregationTypeUndefined: Self = StObject.set(x, "aggregationType", js.undefined)
    
    inline def setDescription(value: FleetMetricDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: FleetMetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    inline def setUnit(value: FleetMetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
