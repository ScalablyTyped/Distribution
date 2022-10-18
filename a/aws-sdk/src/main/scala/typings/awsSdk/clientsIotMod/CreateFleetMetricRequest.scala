package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetMetricRequest extends StObject {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: AggregationField
  
  /**
    * The type of the aggregation query.
    */
  var aggregationType: AggregationType
  
  /**
    * The fleet metric description.
    */
  var description: js.UndefOr[FleetMetricDescription] = js.undefined
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The name of the fleet metric to create.
    */
  var metricName: FleetMetricName
  
  /**
    * The time in seconds between fleet metric emissions. Range [60(1 min), 86400(1 day)] and must be multiple of 60.
    */
  var period: FleetMetricPeriod
  
  /**
    * The search query string.
    */
  var queryString: QueryString
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  
  /**
    * Metadata, which can be used to manage the fleet metric.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Used to support unit transformation such as milliseconds to seconds. The unit must be supported by CW metric. Default to null.
    */
  var unit: js.UndefOr[FleetMetricUnit] = js.undefined
}
object CreateFleetMetricRequest {
  
  inline def apply(
    aggregationField: AggregationField,
    aggregationType: AggregationType,
    metricName: FleetMetricName,
    period: FleetMetricPeriod,
    queryString: QueryString
  ): CreateFleetMetricRequest = {
    val __obj = js.Dynamic.literal(aggregationField = aggregationField.asInstanceOf[js.Any], aggregationType = aggregationType.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetMetricRequest]
  }
  
  extension [Self <: CreateFleetMetricRequest](x: Self) {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FleetMetricDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setMetricName(value: FleetMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: FleetMetricPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUnit(value: FleetMetricUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
