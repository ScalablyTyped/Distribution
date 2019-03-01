package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationInfo extends js.Object {
  /** Reason for the cancellation. */
  var reason: java.lang.String
}

object CancellationInfo {
  @scala.inline
  def apply(reason: java.lang.String): CancellationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[CancellationInfo]
  }
}

