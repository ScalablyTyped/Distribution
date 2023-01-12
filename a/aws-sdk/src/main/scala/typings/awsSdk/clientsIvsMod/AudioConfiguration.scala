package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConfiguration extends StObject {
  
  /**
    * Number of audio channels.
    */
  var channels: js.UndefOr[Integer] = js.undefined
  
  /**
    * Codec used for the audio encoding.
    */
  var codec: js.UndefOr[String] = js.undefined
  
  /**
    * Number of audio samples recorded per second.
    */
  var sampleRate: js.UndefOr[Integer] = js.undefined
  
  /**
    * The expected ingest bitrate (bits per second). This is configured in the encoder.
    */
  var targetBitrate: js.UndefOr[Integer] = js.undefined
}
object AudioConfiguration {
  
  inline def apply(): AudioConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioConfiguration] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: Integer): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setSampleRate(value: Integer): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setTargetBitrate(value: Integer): Self = StObject.set(x, "targetBitrate", value.asInstanceOf[js.Any])
    
    inline def setTargetBitrateUndefined: Self = StObject.set(x, "targetBitrate", js.undefined)
  }
}
