package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceRecommendationsJobRequest extends StObject {
  
  /**
    * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobName: RecommendationJobName
}
object DescribeInferenceRecommendationsJobRequest {
  
  inline def apply(JobName: RecommendationJobName): DescribeInferenceRecommendationsJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInferenceRecommendationsJobRequest]
  }
  
  extension [Self <: DescribeInferenceRecommendationsJobRequest](x: Self) {
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
