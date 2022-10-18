package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactsConfiguration extends StObject {
  
  /**
    * The configuration for the audio artifacts.
    */
  var Audio: AudioArtifactsConfiguration
  
  /**
    * Enables video compositing.
    */
  var CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration] = js.undefined
  
  /**
    * The configuration for the content artifacts.
    */
  var Content: ContentArtifactsConfiguration
  
  /**
    * The configuration for the video artifacts.
    */
  var Video: VideoArtifactsConfiguration
}
object ArtifactsConfiguration {
  
  inline def apply(
    Audio: AudioArtifactsConfiguration,
    Content: ContentArtifactsConfiguration,
    Video: VideoArtifactsConfiguration
  ): ArtifactsConfiguration = {
    val __obj = js.Dynamic.literal(Audio = Audio.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsConfiguration]
  }
  
  extension [Self <: ArtifactsConfiguration](x: Self) {
    
    inline def setAudio(value: AudioArtifactsConfiguration): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setCompositedVideo(value: CompositedVideoArtifactsConfiguration): Self = StObject.set(x, "CompositedVideo", value.asInstanceOf[js.Any])
    
    inline def setCompositedVideoUndefined: Self = StObject.set(x, "CompositedVideo", js.undefined)
    
    inline def setContent(value: ContentArtifactsConfiguration): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: VideoArtifactsConfiguration): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
