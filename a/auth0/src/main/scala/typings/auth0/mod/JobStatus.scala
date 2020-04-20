package typings.auth0.mod

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
  def completed: typings.auth0.auth0Strings.completed = "completed".asInstanceOf[typings.auth0.auth0Strings.completed]
  @scala.inline
  def failed: typings.auth0.auth0Strings.failed = "failed".asInstanceOf[typings.auth0.auth0Strings.failed]
  @scala.inline
  def pending: typings.auth0.auth0Strings.pending = "pending".asInstanceOf[typings.auth0.auth0Strings.pending]
  @scala.inline
  def processing: typings.auth0.auth0Strings.processing = "processing".asInstanceOf[typings.auth0.auth0Strings.processing]
}

