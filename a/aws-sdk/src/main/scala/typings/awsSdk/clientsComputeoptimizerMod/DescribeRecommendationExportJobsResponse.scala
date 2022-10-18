package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationExportJobsResponse extends StObject {
  
  /**
    * The token to use to advance to the next page of export jobs. This value is null when there are no more pages of export jobs to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that describe recommendation export jobs.
    */
  var recommendationExportJobs: js.UndefOr[RecommendationExportJobs] = js.undefined
}
object DescribeRecommendationExportJobsResponse {
  
  inline def apply(): DescribeRecommendationExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationExportJobsResponse]
  }
  
  extension [Self <: DescribeRecommendationExportJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommendationExportJobs(value: RecommendationExportJobs): Self = StObject.set(x, "recommendationExportJobs", value.asInstanceOf[js.Any])
    
    inline def setRecommendationExportJobsUndefined: Self = StObject.set(x, "recommendationExportJobs", js.undefined)
    
    inline def setRecommendationExportJobsVarargs(value: RecommendationExportJob*): Self = StObject.set(x, "recommendationExportJobs", js.Array(value*))
  }
}
