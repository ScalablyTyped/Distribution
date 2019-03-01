package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnInfo extends js.Object {
  /** Reason for the return. */
  var reason: java.lang.String
}

object ReturnInfo {
  @scala.inline
  def apply(reason: java.lang.String): ReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ReturnInfo]
  }
}

