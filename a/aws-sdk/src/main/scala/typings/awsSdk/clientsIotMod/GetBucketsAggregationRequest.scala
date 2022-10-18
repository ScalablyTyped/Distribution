package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketsAggregationRequest extends StObject {
  
  /**
    * The aggregation field.
    */
  var aggregationField: AggregationField
  
  /**
    * The basic control of the response shape and the bucket aggregation type to perform. 
    */
  var bucketsAggregationType: BucketsAggregationType
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The search query string.
    */
  var queryString: QueryString
  
  /**
    * The version of the query.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}
object GetBucketsAggregationRequest {
  
  inline def apply(
    aggregationField: AggregationField,
    bucketsAggregationType: BucketsAggregationType,
    queryString: QueryString
  ): GetBucketsAggregationRequest = {
    val __obj = js.Dynamic.literal(aggregationField = aggregationField.asInstanceOf[js.Any], bucketsAggregationType = bucketsAggregationType.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketsAggregationRequest]
  }
  
  extension [Self <: GetBucketsAggregationRequest](x: Self) {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setBucketsAggregationType(value: BucketsAggregationType): Self = StObject.set(x, "bucketsAggregationType", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
  }
}
