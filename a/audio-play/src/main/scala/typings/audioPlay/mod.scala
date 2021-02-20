package typings.audioPlay

import typings.std.AudioBuffer
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("audio-play", JSImport.Namespace)
  @js.native
  def apply(buffer: AudioBuffer, how: Options, cb: js.Function0[Unit]): AudioPlayHandle = js.native
  
  @js.native
  trait AudioPlayHandle extends StObject {
    
    def pause(): js.Any = js.native
    
    def play(): js.Any = js.native
  }
  object AudioPlayHandle {
    
    @scala.inline
    def apply(pause: () => js.Any, play: () => js.Any): AudioPlayHandle = {
      val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play))
      __obj.asInstanceOf[AudioPlayHandle]
    }
    
    @scala.inline
    implicit class AudioPlayHandleMutableBuilder[Self <: AudioPlayHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPause(value: () => js.Any): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlay(value: () => js.Any): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Various options for audio playback
    * @param start The timestamp at which to start the audio. Can be negative to start from end. (Default: 0)
    * @param end The timestamp the audio ends at. (Default: length of audio buffer)
    * @param autoplay Plays back the audio immediately upon loading. (Default: false)
    * @param loop Continuously loops the buffer until paused. (Default: false)
    * @param context Handle to an audio context. If not provided, one is provided for you.
    * @param volume (not implemented) Playback the audio at a percentage of full volume. (Default: 1)
    * @param detune (not implemented) Percentage of fine-tuning. (Default: 0)
    * @param rate (not implemented) Playback rate, in percent, of the audio. (Default: 1)
    */
  @js.native
  trait Options extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var context: js.UndefOr[AudioContext] = js.native
    
    var detune: js.UndefOr[Double] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var rate: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var volume: js.UndefOr[Double] = js.native
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
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
