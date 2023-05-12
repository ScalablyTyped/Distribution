package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPipeline extends StObject {
  
  /**
    * A pipeline that enables users to capture audio and video.
    */
  var MediaCapturePipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaCapturePipeline] = js.undefined
  
  /**
    * The media concatenation pipeline in a media pipeline.
    */
  var MediaConcatenationPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaConcatenationPipeline] = js.undefined
  
  /**
    * The media insights pipeline of a media pipeline.
    */
  var MediaInsightsPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaInsightsPipeline] = js.undefined
  
  /**
    * The connector pipeline of the media pipeline.
    */
  var MediaLiveConnectorPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaLiveConnectorPipeline] = js.undefined
}
object MediaPipeline {
  
  inline def apply(): MediaPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaPipeline] (val x: Self) extends AnyVal {
    
    inline def setMediaCapturePipeline(value: MediaCapturePipeline): Self = StObject.set(x, "MediaCapturePipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaCapturePipelineUndefined: Self = StObject.set(x, "MediaCapturePipeline", js.undefined)
    
    inline def setMediaConcatenationPipeline(value: MediaConcatenationPipeline): Self = StObject.set(x, "MediaConcatenationPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaConcatenationPipelineUndefined: Self = StObject.set(x, "MediaConcatenationPipeline", js.undefined)
    
    inline def setMediaInsightsPipeline(value: MediaInsightsPipeline): Self = StObject.set(x, "MediaInsightsPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaInsightsPipelineUndefined: Self = StObject.set(x, "MediaInsightsPipeline", js.undefined)
    
    inline def setMediaLiveConnectorPipeline(value: MediaLiveConnectorPipeline): Self = StObject.set(x, "MediaLiveConnectorPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaLiveConnectorPipelineUndefined: Self = StObject.set(x, "MediaLiveConnectorPipeline", js.undefined)
  }
}
