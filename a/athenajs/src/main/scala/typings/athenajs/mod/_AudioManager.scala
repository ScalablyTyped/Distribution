package typings.athenajs.mod

import typings.std.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _AudioManager extends StObject {
  
  /**
    * Adds a new sound element to the audio cache.
    * *Note* if a sound with the same id has already been added, it will be replaced
    * by the new one.
    *
    */
  def addSound(id: String, element: HTMLAudioElement): Unit = js.native
  
  var audioCache: JSObject = js.native
  
  var enabled: Boolean = js.native
  
  /**
    * Plays the specified sound with `id`.
    *
    */
  def play(id: String): js.Any = js.native
  def play(id: String, loop: js.UndefOr[scala.Nothing], volume: js.UndefOr[scala.Nothing], panning: Double): js.Any = js.native
  def play(id: String, loop: js.UndefOr[scala.Nothing], volume: Double): js.Any = js.native
  def play(id: String, loop: js.UndefOr[scala.Nothing], volume: Double, panning: Double): js.Any = js.native
  def play(id: String, loop: Boolean): js.Any = js.native
  def play(id: String, loop: Boolean, volume: js.UndefOr[scala.Nothing], panning: Double): js.Any = js.native
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
