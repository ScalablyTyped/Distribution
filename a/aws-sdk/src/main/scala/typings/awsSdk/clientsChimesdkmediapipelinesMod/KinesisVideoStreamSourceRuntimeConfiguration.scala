package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStreamSourceRuntimeConfiguration extends StObject {
  
  /**
    * Specifies the encoding of your input audio. Supported format: PCM (only signed 16-bit little-endian audio formats, which does not include WAV) For more information, see Media formats in the Amazon Transcribe Developer Guide.
    */
  var MediaEncoding: typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaEncoding
  
  /**
    * The sample rate of the input audio (in hertz). Low-quality audio, such as telephone audio, is typically around 8,000 Hz. High-quality audio typically ranges from 16,000 Hz to 48,000 Hz. Note that the sample rate you specify must match that of your audio. Valid Range: Minimum value of 8000. Maximum value of 48000.
    */
  var MediaSampleRate: MediaSampleRateHertz
  
  /**
    * The streams in the source runtime configuration of a Kinesis video stream.
    */
  var Streams: typings.awsSdk.clientsChimesdkmediapipelinesMod.Streams
}
object KinesisVideoStreamSourceRuntimeConfiguration {
  
  inline def apply(MediaEncoding: MediaEncoding, MediaSampleRate: MediaSampleRateHertz, Streams: Streams): KinesisVideoStreamSourceRuntimeConfiguration = {
    val __obj = js.Dynamic.literal(MediaEncoding = MediaEncoding.asInstanceOf[js.Any], MediaSampleRate = MediaSampleRate.asInstanceOf[js.Any], Streams = Streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisVideoStreamSourceRuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KinesisVideoStreamSourceRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMediaEncoding(value: MediaEncoding): Self = StObject.set(x, "MediaEncoding", value.asInstanceOf[js.Any])
    
    inline def setMediaSampleRate(value: MediaSampleRateHertz): Self = StObject.set(x, "MediaSampleRate", value.asInstanceOf[js.Any])
    
    inline def setStreams(value: Streams): Self = StObject.set(x, "Streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: StreamConfiguration*): Self = StObject.set(x, "Streams", js.Array(value*))
  }
}
