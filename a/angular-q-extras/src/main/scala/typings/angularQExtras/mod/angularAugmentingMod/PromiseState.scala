package typings.angularQExtras.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularQExtras.angularQExtrasStrings.fulfilled
  - typings.angularQExtras.angularQExtrasStrings.rejected
*/
trait PromiseState extends js.Object

object PromiseState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fulfilled: typings.angularQExtras.angularQExtrasStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def rejected: typings.angularQExtras.angularQExtrasStrings.rejected = this.cast("rejected")
}

