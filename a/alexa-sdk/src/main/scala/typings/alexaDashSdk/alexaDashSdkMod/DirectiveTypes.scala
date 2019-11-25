package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlay
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTStop
  - typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTClearQueue
  - typings.alexaDashSdk.alexaDashSdkStrings.DisplayDOTRenderTemplate
  - typings.alexaDashSdk.alexaDashSdkStrings.Hint
  - typings.alexaDashSdk.alexaDashSdkStrings.VideoAppDOTLaunch
*/
trait DirectiveTypes extends js.Object

object DirectiveTypes {
  @scala.inline
  def AudioPlayerDOTClearQueue: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTClearQueue = this.cast("AudioPlayer.ClearQueue")
  @scala.inline
  def AudioPlayerDOTPlay: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlay = this.cast("AudioPlayer.Play")
  @scala.inline
  def AudioPlayerDOTStop: typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTStop = this.cast("AudioPlayer.Stop")
  @scala.inline
  def DisplayDOTRenderTemplate: typings.alexaDashSdk.alexaDashSdkStrings.DisplayDOTRenderTemplate = this.cast("Display.RenderTemplate")
  @scala.inline
  def Hint: typings.alexaDashSdk.alexaDashSdkStrings.Hint = this.cast("Hint")
  @scala.inline
  def VideoAppDOTLaunch: typings.alexaDashSdk.alexaDashSdkStrings.VideoAppDOTLaunch = this.cast("VideoApp.Launch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

