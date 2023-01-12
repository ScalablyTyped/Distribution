package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInferenceRecommendationsJobRequest extends StObject {
  
  /**
    * The name of the job you want to stop.
    */
  var JobName: RecommendationJobName
}
object StopInferenceRecommendationsJobRequest {
  
  inline def apply(JobName: RecommendationJobName): StopInferenceRecommendationsJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInferenceRecommendationsJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopInferenceRecommendationsJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
  }
}
