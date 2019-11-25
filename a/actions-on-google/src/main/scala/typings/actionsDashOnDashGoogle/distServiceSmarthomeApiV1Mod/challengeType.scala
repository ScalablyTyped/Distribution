package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.ackNeeded
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.pinNeeded
  - typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.challengeFailedPinNeeded
*/
trait challengeType extends js.Object

object challengeType {
  @scala.inline
  def ackNeeded: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.ackNeeded = this.cast("ackNeeded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def challengeFailedPinNeeded: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.challengeFailedPinNeeded = this.cast("challengeFailedPinNeeded")
  @scala.inline
  def pinNeeded: typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.pinNeeded = this.cast("pinNeeded")
}

