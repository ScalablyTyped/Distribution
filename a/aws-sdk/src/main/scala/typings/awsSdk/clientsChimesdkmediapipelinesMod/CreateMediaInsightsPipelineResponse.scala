package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaInsightsPipelineResponse extends StObject {
  
  /**
    * The media insights pipeline object.
    */
  var MediaInsightsPipeline: typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsPipeline
}
object CreateMediaInsightsPipelineResponse {
  
  inline def apply(MediaInsightsPipeline: MediaInsightsPipeline): CreateMediaInsightsPipelineResponse = {
    val __obj = js.Dynamic.literal(MediaInsightsPipeline = MediaInsightsPipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaInsightsPipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaInsightsPipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaInsightsPipeline(value: MediaInsightsPipeline): Self = StObject.set(x, "MediaInsightsPipeline", value.asInstanceOf[js.Any])
  }
}
