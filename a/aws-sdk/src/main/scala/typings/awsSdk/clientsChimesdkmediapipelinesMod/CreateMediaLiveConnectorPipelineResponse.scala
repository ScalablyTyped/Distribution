package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaLiveConnectorPipelineResponse extends StObject {
  
  /**
    * The new media pipeline.
    */
  var MediaLiveConnectorPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaLiveConnectorPipeline] = js.undefined
}
object CreateMediaLiveConnectorPipelineResponse {
  
  inline def apply(): CreateMediaLiveConnectorPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaLiveConnectorPipelineResponse]
  }
  
  extension [Self <: CreateMediaLiveConnectorPipelineResponse](x: Self) {
    
    inline def setMediaLiveConnectorPipeline(value: MediaLiveConnectorPipeline): Self = StObject.set(x, "MediaLiveConnectorPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaLiveConnectorPipelineUndefined: Self = StObject.set(x, "MediaLiveConnectorPipeline", js.undefined)
  }
}
