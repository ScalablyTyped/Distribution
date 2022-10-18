package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePacksResponse extends StObject {
  
  /**
    * Returns a list of ConformancePackDetail objects.
    */
  var ConformancePackDetails: js.UndefOr[ConformancePackDetailList] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeConformancePacksResponse {
  
  inline def apply(): DescribeConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePacksResponse]
  }
  
  extension [Self <: DescribeConformancePacksResponse](x: Self) {
    
    inline def setConformancePackDetails(value: ConformancePackDetailList): Self = StObject.set(x, "ConformancePackDetails", value.asInstanceOf[js.Any])
    
    inline def setConformancePackDetailsUndefined: Self = StObject.set(x, "ConformancePackDetails", js.undefined)
    
    inline def setConformancePackDetailsVarargs(value: ConformancePackDetail*): Self = StObject.set(x, "ConformancePackDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
