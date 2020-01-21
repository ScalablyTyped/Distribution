package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.IDLE
  - typings.alexaSdk.alexaSdkStrings.PAUSED
  - typings.alexaSdk.alexaSdkStrings.PLAYING
  - typings.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN
  - typings.alexaSdk.alexaSdkStrings.FINISHED
  - typings.alexaSdk.alexaSdkStrings.STOPPED
*/
trait AudioPlayerActivity extends js.Object

object AudioPlayerActivity {
  @scala.inline
  def BUFFER_UNDERRUN: typings.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN = this.cast("BUFFER_UNDERRUN")
  @scala.inline
  def FINISHED: typings.alexaSdk.alexaSdkStrings.FINISHED = this.cast("FINISHED")
  @scala.inline
  def IDLE: typings.alexaSdk.alexaSdkStrings.IDLE = this.cast("IDLE")
  @scala.inline
  def PAUSED: typings.alexaSdk.alexaSdkStrings.PAUSED = this.cast("PAUSED")
  @scala.inline
  def PLAYING: typings.alexaSdk.alexaSdkStrings.PLAYING = this.cast("PLAYING")
  @scala.inline
  def STOPPED: typings.alexaSdk.alexaSdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

