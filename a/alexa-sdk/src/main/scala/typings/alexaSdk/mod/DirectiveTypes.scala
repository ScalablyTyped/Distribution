package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay
  - typings.alexaSdk.alexaSdkStrings.AudioPlayerDotStop
  - typings.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue
  - typings.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate
  - typings.alexaSdk.alexaSdkStrings.Hint
  - typings.alexaSdk.alexaSdkStrings.VideoAppDotLaunch
*/
trait DirectiveTypes extends js.Object

object DirectiveTypes {
  @scala.inline
  def AudioPlayerDotClearQueue: typings.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue = this.cast("AudioPlayer.ClearQueue")
  @scala.inline
  def AudioPlayerDotPlay: typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay = this.cast("AudioPlayer.Play")
  @scala.inline
  def AudioPlayerDotStop: typings.alexaSdk.alexaSdkStrings.AudioPlayerDotStop = this.cast("AudioPlayer.Stop")
  @scala.inline
  def DisplayDotRenderTemplate: typings.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate = this.cast("Display.RenderTemplate")
  @scala.inline
  def Hint: typings.alexaSdk.alexaSdkStrings.Hint = this.cast("Hint")
  @scala.inline
  def VideoAppDotLaunch: typings.alexaSdk.alexaSdkStrings.VideoAppDotLaunch = this.cast("VideoApp.Launch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

