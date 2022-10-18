package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClustersRequest extends StObject {
  
  /**
    * One or more filters to limit the items returned in the response. Use the clusterIds filter to return only the specified clusters. Specify clusters by their cluster identifier (ID). Use the vpcIds filter to return only the clusters in the specified virtual private clouds (VPCs). Specify VPCs by their VPC identifier (ID). Use the states filter to return only clusters that match the specified state.
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.Filters] = js.undefined
  
  /**
    * The maximum number of clusters to return in the response. When there are more clusters than the number you specify, the response contains a NextToken value.
    */
  var MaxResults: js.UndefOr[ClustersMaxSize] = js.undefined
  
  /**
    * The NextToken value that you received in the previous response. Use this value to get more clusters.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.NextToken] = js.undefined
}
object DescribeClustersRequest {
  
  inline def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  
  extension [Self <: DescribeClustersRequest](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: ClustersMaxSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
