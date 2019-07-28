package typings.actionsDashOnDashGoogle.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnInfo extends js.Object {
  /** Reason for the return. */
  var reason: String
}

object ReturnInfo {
  @scala.inline
  def apply(reason: String): ReturnInfo = {
    val __obj = js.Dynamic.literal(reason = reason)
  
    __obj.asInstanceOf[ReturnInfo]
  }
}

