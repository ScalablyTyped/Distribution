package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.NONE
  - typings.alexaSdk.alexaSdkStrings.DENIED
  - typings.alexaSdk.alexaSdkStrings.CONFIRMED
*/
trait ConfirmationStatuses extends js.Object

object ConfirmationStatuses {
  @scala.inline
  def CONFIRMED: typings.alexaSdk.alexaSdkStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def DENIED: typings.alexaSdk.alexaSdkStrings.DENIED = this.cast("DENIED")
  @scala.inline
  def NONE: typings.alexaSdk.alexaSdkStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

