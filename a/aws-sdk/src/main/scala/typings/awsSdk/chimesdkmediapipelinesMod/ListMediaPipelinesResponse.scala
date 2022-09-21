package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMediaPipelinesResponse extends StObject {
  
  /**
    * The media pipeline objects in the list.
    */
  var MediaPipelines: js.UndefOr[MediaPipelineList] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMediaPipelinesResponse {
  
  inline def apply(): ListMediaPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMediaPipelinesResponse]
  }
  
  extension [Self <: ListMediaPipelinesResponse](x: Self) {
    
    inline def setMediaPipelines(value: MediaPipelineList): Self = StObject.set(x, "MediaPipelines", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelinesUndefined: Self = StObject.set(x, "MediaPipelines", js.undefined)
    
    inline def setMediaPipelinesVarargs(value: MediaPipelineSummary*): Self = StObject.set(x, "MediaPipelines", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
