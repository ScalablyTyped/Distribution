package typings.actionsDashOnDashGoogle.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationInfo extends js.Object {
  /** Reason for the cancellation. */
  var reason: String
}

object CancellationInfo {
  @scala.inline
  def apply(reason: String): CancellationInfo = {
    val __obj = js.Dynamic.literal(reason = reason)
  
    __obj.asInstanceOf[CancellationInfo]
  }
}

