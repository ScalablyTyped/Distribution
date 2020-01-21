package typings.alexaSdk.mod

import typings.alexaSdk.alexaSdkStrings.completed_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.alexaSdk.alexaSdkStrings.active
  - typings.alexaSdk.alexaSdkStrings.completed_
*/
trait ListItemObjectStatus extends js.Object

object ListItemObjectStatus {
  @scala.inline
  def active: typings.alexaSdk.alexaSdkStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: completed_ = this.cast("completed")
}

