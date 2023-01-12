package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPercentilesRequest extends StObject {
  
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.undefined
  
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The percentile groups returned.
    */
  var percents: js.UndefOr[PercentList] = js.undefined
  
  /**
    * The search query string.
    */
  var queryString: QueryString
  
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}
object GetPercentilesRequest {
  
  inline def apply(queryString: QueryString): GetPercentilesRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPercentilesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPercentilesRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregationField(value: AggregationField): Self = StObject.set(x, "aggregationField", value.asInstanceOf[js.Any])
    
    inline def setAggregationFieldUndefined: Self = StObject.set(x, "aggregationField", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setPercents(value: PercentList): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
    
    inline def setPercentsUndefined: Self = StObject.set(x, "percents", js.undefined)
    
    inline def setPercentsVarargs(value: Percent*): Self = StObject.set(x, "percents", js.Array(value*))
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
  }
}
