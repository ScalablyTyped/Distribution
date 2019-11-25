package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaDashSdk.alexaDashSdkStrings.STARTED
  - typings.alexaDashSdk.alexaDashSdkStrings.IN_PROGRESS
  - typings.alexaDashSdk.alexaDashSdkStrings.COMPLETED
*/
trait DialogStates extends js.Object

object DialogStates {
  @scala.inline
  def COMPLETED: typings.alexaDashSdk.alexaDashSdkStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def IN_PROGRESS: typings.alexaDashSdk.alexaDashSdkStrings.IN_PROGRESS = this.cast("IN_PROGRESS")
  @scala.inline
  def STARTED: typings.alexaDashSdk.alexaDashSdkStrings.STARTED = this.cast("STARTED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

