package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedElasticsearchInstancesRequest extends StObject {
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEsMod.MaxResults] = js.undefined
  
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
  
  /**
    * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved Elasticsearch instance ID.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
}
object DescribeReservedElasticsearchInstancesRequest {
  
  inline def apply(): DescribeReservedElasticsearchInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
  }
  
  extension [Self <: DescribeReservedElasticsearchInstancesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedElasticsearchInstanceId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstanceIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceId", js.undefined)
  }
}
