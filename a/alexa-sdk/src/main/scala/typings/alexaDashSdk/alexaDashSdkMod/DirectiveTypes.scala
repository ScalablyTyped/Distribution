package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlay
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotStop
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotClearQueue
  - typings.alexaDashSdk.alexaDashSdkStrings.DisplayDotRenderTemplate
  - typings.alexaDashSdk.alexaDashSdkStrings.Hint
  - typings.alexaDashSdk.alexaDashSdkStrings.VideoAppDotLaunch
*/
trait DirectiveTypes extends js.Object

object DirectiveTypes {
  @scala.inline
  def AudioPlayerDotClearQueue: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotClearQueue = this.cast("AudioPlayer.ClearQueue")
  @scala.inline
  def AudioPlayerDotPlay: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlay = this.cast("AudioPlayer.Play")
  @scala.inline
  def AudioPlayerDotStop: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotStop = this.cast("AudioPlayer.Stop")
  @scala.inline
  def DisplayDotRenderTemplate: typings.alexaDashSdk.alexaDashSdkStrings.DisplayDotRenderTemplate = this.cast("Display.RenderTemplate")
  @scala.inline
  def Hint: typings.alexaDashSdk.alexaDashSdkStrings.Hint = this.cast("Hint")
  @scala.inline
  def VideoAppDotLaunch: typings.alexaDashSdk.alexaDashSdkStrings.VideoAppDotLaunch = this.cast("VideoApp.Launch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

