package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _AudioManager extends js.Object {
  var audioCache: JSObject = js.native
  var enabled: scala.Boolean = js.native
  /**
       * Adds a new sound element to the audio cache.
       * *Note* if a sound with the same id has already been added, it will be replaced
       * by the new one.
       *
       */
  def addSound(id: java.lang.String, element: stdLib.HTMLAudioElement): scala.Unit = js.native
  /**
   * Plays the specified sound with `id`.
   *
   */
  def play(id: java.lang.String): js.Any = js.native
  /**
   * Plays the specified sound with `id`.
   *
   */
  def play(id: java.lang.String, loop: scala.Boolean): js.Any = js.native
  /**
   * Plays the specified sound with `id`.
   *
   */
  def play(id: java.lang.String, loop: scala.Boolean, volume: scala.Double): js.Any = js.native
  /**
   * Plays the specified sound with `id`.
   *
   */
  def play(id: java.lang.String, loop: scala.Boolean, volume: scala.Double, panning: scala.Double): js.Any = js.native
  /**
   * Stops playing the sound id
   *
   */
  def stop(id: java.lang.String, instanceId: js.Any): scala.Unit = js.native
  /**
   * Toggles global sound playback
   *
   */
  def toggleSound(bool: scala.Boolean): scala.Unit = js.native
}

