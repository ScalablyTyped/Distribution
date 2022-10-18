package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstancesRequest extends StObject {
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
  
  /**
    * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved OpenSearch instance ID. 
    */
  var ReservedInstanceId: js.UndefOr[GUID] = js.undefined
}
object DescribeReservedInstancesRequest {
  
  inline def apply(): DescribeReservedInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesRequest]
  }
  
  extension [Self <: DescribeReservedInstancesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstanceId(value: GUID): Self = StObject.set(x, "ReservedInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstanceIdUndefined: Self = StObject.set(x, "ReservedInstanceId", js.undefined)
  }
}
