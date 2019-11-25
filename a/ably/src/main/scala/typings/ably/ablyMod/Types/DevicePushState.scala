package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ably.ablyStrings.ACTIVE
  - typings.ably.ablyStrings.FAILING
  - typings.ably.ablyStrings.FAILED
*/
trait DevicePushState extends js.Object

object DevicePushState {
  @scala.inline
  def ACTIVE: typings.ably.ablyStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def FAILED: typings.ably.ablyStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FAILING: typings.ably.ablyStrings.FAILING = this.cast("FAILING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

