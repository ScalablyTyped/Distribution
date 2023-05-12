package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaLiveConnectorPipelineResponse extends StObject {
  
  /**
    * The new media live connector pipeline.
    */
  var MediaLiveConnectorPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaLiveConnectorPipeline] = js.undefined
}
object CreateMediaLiveConnectorPipelineResponse {
  
  inline def apply(): CreateMediaLiveConnectorPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaLiveConnectorPipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaLiveConnectorPipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaLiveConnectorPipeline(value: MediaLiveConnectorPipeline): Self = StObject.set(x, "MediaLiveConnectorPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaLiveConnectorPipelineUndefined: Self = StObject.set(x, "MediaLiveConnectorPipeline", js.undefined)
  }
}
