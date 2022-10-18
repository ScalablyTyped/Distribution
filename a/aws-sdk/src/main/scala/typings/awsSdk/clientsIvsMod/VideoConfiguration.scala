package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoConfiguration extends StObject {
  
  /**
    * Indicates the degree of required decoder performance for a profile. Normally this is set automatically by the encoder. For details, see the H.264 specification.
    */
  var avcLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates to the decoder the requirements for decoding the stream. For definitions of the valid values, see the H.264 specification.
    */
  var avcProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Codec used for the video encoding.
    */
  var codec: js.UndefOr[String] = js.undefined
  
  /**
    * Software or hardware used to encode the video.
    */
  var encoder: js.UndefOr[String] = js.undefined
  
  /**
    * The expected ingest bitrate (bits per second). This is configured in the encoder.
    */
  var targetBitrate: js.UndefOr[Integer] = js.undefined
  
  /**
    * The expected ingest framerate. This is configured in the encoder.
    */
  var targetFramerate: js.UndefOr[Integer] = js.undefined
  
  /**
    * Video-resolution height in pixels.
    */
  var videoHeight: js.UndefOr[Integer] = js.undefined
  
  /**
    * Video-resolution width in pixels.
    */
  var videoWidth: js.UndefOr[Integer] = js.undefined
}
object VideoConfiguration {
  
  inline def apply(): VideoConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoConfiguration]
  }
  
  extension [Self <: VideoConfiguration](x: Self) {
    
    inline def setAvcLevel(value: String): Self = StObject.set(x, "avcLevel", value.asInstanceOf[js.Any])
    
    inline def setAvcLevelUndefined: Self = StObject.set(x, "avcLevel", js.undefined)
    
    inline def setAvcProfile(value: String): Self = StObject.set(x, "avcProfile", value.asInstanceOf[js.Any])
    
    inline def setAvcProfileUndefined: Self = StObject.set(x, "avcProfile", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setEncoder(value: String): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    
    inline def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
    
    inline def setTargetBitrate(value: Integer): Self = StObject.set(x, "targetBitrate", value.asInstanceOf[js.Any])
    
    inline def setTargetBitrateUndefined: Self = StObject.set(x, "targetBitrate", js.undefined)
    
    inline def setTargetFramerate(value: Integer): Self = StObject.set(x, "targetFramerate", value.asInstanceOf[js.Any])
    
    inline def setTargetFramerateUndefined: Self = StObject.set(x, "targetFramerate", js.undefined)
    
    inline def setVideoHeight(value: Integer): Self = StObject.set(x, "videoHeight", value.asInstanceOf[js.Any])
    
    inline def setVideoHeightUndefined: Self = StObject.set(x, "videoHeight", js.undefined)
    
    inline def setVideoWidth(value: Integer): Self = StObject.set(x, "videoWidth", value.asInstanceOf[js.Any])
    
    inline def setVideoWidthUndefined: Self = StObject.set(x, "videoWidth", js.undefined)
  }
}
