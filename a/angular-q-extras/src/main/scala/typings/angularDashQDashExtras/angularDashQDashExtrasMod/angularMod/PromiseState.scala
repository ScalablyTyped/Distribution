package typings.angularDashQDashExtras.angularDashQDashExtrasMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularDashQDashExtras.angularDashQDashExtrasStrings.fulfilled
  - typings.angularDashQDashExtras.angularDashQDashExtrasStrings.rejected
*/
trait PromiseState extends js.Object

object PromiseState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fulfilled: typings.angularDashQDashExtras.angularDashQDashExtrasStrings.fulfilled = this.cast("fulfilled")
  @scala.inline
  def rejected: typings.angularDashQDashExtras.angularDashQDashExtrasStrings.rejected = this.cast("rejected")
}

