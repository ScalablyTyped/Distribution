package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMediaCapturePipelinesResponse extends StObject {
  
  /**
    * The media pipeline objects in the list.
    */
  var MediaCapturePipelines: js.UndefOr[MediaCapturePipelineSummaryList] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMediaCapturePipelinesResponse {
  
  inline def apply(): ListMediaCapturePipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMediaCapturePipelinesResponse]
  }
  
  extension [Self <: ListMediaCapturePipelinesResponse](x: Self) {
    
    inline def setMediaCapturePipelines(value: MediaCapturePipelineSummaryList): Self = StObject.set(x, "MediaCapturePipelines", value.asInstanceOf[js.Any])
    
    inline def setMediaCapturePipelinesUndefined: Self = StObject.set(x, "MediaCapturePipelines", js.undefined)
    
    inline def setMediaCapturePipelinesVarargs(value: MediaCapturePipelineSummary*): Self = StObject.set(x, "MediaCapturePipelines", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
