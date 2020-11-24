package typings.audioContext.mod

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("audio-context", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Gets an audio context from your web browser.
    * @param options Takes an Options object or just provide a sample rate.
    * @returns the audio context or null if there was an error or not a web browser.
    */
  def apply(): AudioContext | Null = js.native
  def apply(options: Double): AudioContext | Null = js.native
  def apply(options: Options): AudioContext | Null = js.native
}
