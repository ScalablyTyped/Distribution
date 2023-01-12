package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatisticsRequest extends StObject {
  
  /**
    * The aggregation field name.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.undefined
  
  /**
    * The name of the index to search. The default value is AWS_Things.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your Amazon Web Services account.
    */
  var queryString: QueryString
  
  /**
    * The version of the query used to search.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}
object GetStatisticsRequest {
  
  inline def apply(queryString: QueryString): GetStatisticsRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatisticsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStatisticsRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setAggregationFieldUndefined: Self = StObject.set(x, "aggregationField", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
  }
}
