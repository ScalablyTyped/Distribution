package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.auth0Strings.pending
  - typings.auth0.auth0Strings.processing
  - typings.auth0.auth0Strings.completed
  - typings.auth0.auth0Strings.failed
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.auth0.auth0Strings.completed = this.cast("completed")
  @scala.inline
  def failed: typings.auth0.auth0Strings.failed = this.cast("failed")
  @scala.inline
  def pending: typings.auth0.auth0Strings.pending = this.cast("pending")
  @scala.inline
  def processing: typings.auth0.auth0Strings.processing = this.cast("processing")
}

