package typings.audioContext

import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Gets an audio context from your web browser.
    * @param options Takes an Options object or just provide a sample rate.
    * @returns the audio context or null if there was an error or not a web browser.
    */
  @JSImport("audio-context", JSImport.Namespace)
  @js.native
  def apply(): AudioContext | Null = js.native
  @JSImport("audio-context", JSImport.Namespace)
  @js.native
  def apply(options: Double): AudioContext | Null = js.native
  @JSImport("audio-context", JSImport.Namespace)
  @js.native
  def apply(options: Options): AudioContext | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var channels: js.UndefOr[Double] = js.native
    
    var contextAttributes: js.UndefOr[js.Object] = js.native
    
    var latencyHint: js.UndefOr[String | Double] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var offline: js.UndefOr[Boolean] = js.native
    
    var sampleRate: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setContextAttributes(value: js.Object): Self = StObject.set(x, "contextAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextAttributesUndefined: Self = StObject.set(x, "contextAttributes", js.undefined)
      
      @scala.inline
      def setLatencyHint(value: String | Double): Self = StObject.set(x, "latencyHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyHintUndefined: Self = StObject.set(x, "latencyHint", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
}
