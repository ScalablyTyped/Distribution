package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePacksRequest extends StObject {
  
  /**
    * Comma-separated list of conformance pack names for which you want details. If you do not specify any names, Config returns details for all your conformance packs. 
    */
  var ConformancePackNames: js.UndefOr[ConformancePackNamesList] = js.undefined
  
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeConformancePacksRequest {
  
  inline def apply(): DescribeConformancePacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePacksRequest]
  }
  
  extension [Self <: DescribeConformancePacksRequest](x: Self) {
    
    inline def setConformancePackNames(value: ConformancePackNamesList): Self = StObject.set(x, "ConformancePackNames", value.asInstanceOf[js.Any])
    
    inline def setConformancePackNamesUndefined: Self = StObject.set(x, "ConformancePackNames", js.undefined)
    
    inline def setConformancePackNamesVarargs(value: ConformancePackName*): Self = StObject.set(x, "ConformancePackNames", js.Array(value*))
    
    inline def setLimit(value: PageSizeLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
