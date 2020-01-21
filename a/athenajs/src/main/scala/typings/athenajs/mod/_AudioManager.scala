package typings.athenajs.mod

import typings.std.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _AudioManager extends js.Object {
  var audioCache: JSObject = js.native
  var enabled: Boolean = js.native
  /**
    * Adds a new sound element to the audio cache.
    * *Note* if a sound with the same id has already been added, it will be replaced
    * by the new one.
    *
    */
  def addSound(id: String, element: HTMLAudioElement): Unit = js.native
  /**
    * Plays the specified sound with `id`.
    *
    */
  def play(id: String): js.Any = js.native
  def play(id: String, loop: Boolean): js.Any = js.native
  def play(id: String, loop: Boolean, volume: Double): js.Any = js.native
  def play(id: String, loop: Boolean, volume: Double, panning: Double): js.Any = js.native
  /**
    * Stops playing the sound id
    *
    */
  def stop(id: String, instanceId: js.Any): Unit = js.native
  /**
    * Toggles global sound playback
    *
    */
  def toggleSound(bool: Boolean): Unit = js.native
}

