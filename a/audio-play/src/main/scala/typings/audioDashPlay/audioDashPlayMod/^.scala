package typings.audioDashPlay.audioDashPlayMod

import typings.std.AudioBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("audio-play", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(buffer: AudioBuffer, how: Options, cb: js.Function0[Unit]): AudioPlayHandle = js.native
}

