package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedInstancesResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of Reserved Instances in the current Region.
    */
  var ReservedInstances: js.UndefOr[ReservedInstanceList] = js.undefined
}
object DescribeReservedInstancesResponse {
  
  inline def apply(): DescribeReservedInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesResponse]
  }
  
  extension [Self <: DescribeReservedInstancesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedInstances(value: ReservedInstanceList): Self = StObject.set(x, "ReservedInstances", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesUndefined: Self = StObject.set(x, "ReservedInstances", js.undefined)
    
    inline def setReservedInstancesVarargs(value: ReservedInstance*): Self = StObject.set(x, "ReservedInstances", js.Array(value*))
  }
}
