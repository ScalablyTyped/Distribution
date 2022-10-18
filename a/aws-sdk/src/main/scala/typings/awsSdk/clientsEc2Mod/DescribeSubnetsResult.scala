package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubnetsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more subnets.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
}
object DescribeSubnetsResult {
  
  inline def apply(): DescribeSubnetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetsResult]
  }
  
  extension [Self <: DescribeSubnetsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
