package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsPathsResult extends StObject {
  
  /**
    * Information about the paths.
    */
  var NetworkInsightsPaths: js.UndefOr[NetworkInsightsPathList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInsightsPathsResult {
  
  inline def apply(): DescribeNetworkInsightsPathsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsPathsResult]
  }
  
  extension [Self <: DescribeNetworkInsightsPathsResult](x: Self) {
    
    inline def setNetworkInsightsPaths(value: NetworkInsightsPathList): Self = StObject.set(x, "NetworkInsightsPaths", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathsUndefined: Self = StObject.set(x, "NetworkInsightsPaths", js.undefined)
    
    inline def setNetworkInsightsPathsVarargs(value: NetworkInsightsPath*): Self = StObject.set(x, "NetworkInsightsPaths", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
