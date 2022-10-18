package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestConfiguration extends StObject {
  
  /**
    * Encoder settings for audio.
    */
  var audio: js.UndefOr[AudioConfiguration] = js.undefined
  
  /**
    * Encoder settings for video.
    */
  var video: js.UndefOr[VideoConfiguration] = js.undefined
}
object IngestConfiguration {
  
  inline def apply(): IngestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestConfiguration]
  }
  
  extension [Self <: IngestConfiguration](x: Self) {
    
    inline def setAudio(value: AudioConfiguration): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setVideo(value: VideoConfiguration): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
