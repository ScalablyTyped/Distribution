package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePackStatusResponse extends StObject {
  
  /**
    * A list of ConformancePackStatusDetail objects.
    */
  var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeConformancePackStatusResponse {
  
  inline def apply(): DescribeConformancePackStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePackStatusResponse]
  }
  
  extension [Self <: DescribeConformancePackStatusResponse](x: Self) {
    
    inline def setConformancePackStatusDetails(value: ConformancePackStatusDetailsList): Self = StObject.set(x, "ConformancePackStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setConformancePackStatusDetailsUndefined: Self = StObject.set(x, "ConformancePackStatusDetails", js.undefined)
    
    inline def setConformancePackStatusDetailsVarargs(value: ConformancePackStatusDetail*): Self = StObject.set(x, "ConformancePackStatusDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
