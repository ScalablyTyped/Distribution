package typings.audioContext

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Gets an audio context from your web browser.
    * @param options Takes an Options object or just provide a sample rate.
    * @returns the audio context or null if there was an error or not a web browser.
    */
  inline def apply(): AudioContext | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AudioContext | Null]
  inline def apply(options: Double): AudioContext | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AudioContext | Null]
  inline def apply(options: Options): AudioContext | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AudioContext | Null]
  
  @JSImport("audio-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var channels: js.UndefOr[Double] = js.undefined
    
    var contextAttributes: js.UndefOr[js.Object] = js.undefined
    
    var latencyHint: js.UndefOr[String | Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var offline: js.UndefOr[Boolean] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setContextAttributes(value: js.Object): Self = StObject.set(x, "contextAttributes", value.asInstanceOf[js.Any])
      
      inline def setContextAttributesUndefined: Self = StObject.set(x, "contextAttributes", js.undefined)
      
      inline def setLatencyHint(value: String | Double): Self = StObject.set(x, "latencyHint", value.asInstanceOf[js.Any])
      
      inline def setLatencyHintUndefined: Self = StObject.set(x, "latencyHint", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
}
