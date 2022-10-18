package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketsAggregationResponse extends StObject {
  
  /**
    * The main part of the response with a list of buckets. Each bucket contains a keyValue and a count.  keyValue: The aggregation field value counted for the particular bucket.  count: The number of documents that have that value.
    */
  var buckets: js.UndefOr[Buckets] = js.undefined
  
  /**
    * The total number of things that fit the query string criteria.
    */
  var totalCount: js.UndefOr[Count] = js.undefined
}
object GetBucketsAggregationResponse {
  
  inline def apply(): GetBucketsAggregationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketsAggregationResponse]
  }
  
  extension [Self <: GetBucketsAggregationResponse](x: Self) {
    
    inline def setBuckets(value: Buckets): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setTotalCount(value: Count): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
