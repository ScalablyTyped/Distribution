package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded
  - typings.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded
  - typings.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded
*/
trait challengeType extends js.Object

object challengeType {
  @scala.inline
  def ackNeeded: typings.actionsOnGoogle.actionsOnGoogleStrings.ackNeeded = this.cast("ackNeeded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def challengeFailedPinNeeded: typings.actionsOnGoogle.actionsOnGoogleStrings.challengeFailedPinNeeded = this.cast("challengeFailedPinNeeded")
  @scala.inline
  def pinNeeded: typings.actionsOnGoogle.actionsOnGoogleStrings.pinNeeded = this.cast("pinNeeded")
}

