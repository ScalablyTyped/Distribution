package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCoipPoolsResult extends StObject {
  
  /**
    * Information about the address pools.
    */
  var CoipPools: js.UndefOr[CoipPoolSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCoipPoolsResult {
  
  inline def apply(): DescribeCoipPoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCoipPoolsResult]
  }
  
  extension [Self <: DescribeCoipPoolsResult](x: Self) {
    
    inline def setCoipPools(value: CoipPoolSet): Self = StObject.set(x, "CoipPools", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolsUndefined: Self = StObject.set(x, "CoipPools", js.undefined)
    
    inline def setCoipPoolsVarargs(value: CoipPool*): Self = StObject.set(x, "CoipPools", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
