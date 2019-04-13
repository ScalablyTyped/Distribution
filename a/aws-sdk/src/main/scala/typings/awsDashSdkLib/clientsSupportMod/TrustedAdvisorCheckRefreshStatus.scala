package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorCheckRefreshStatus extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String
  /**
    * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
    */
  var millisUntilNextRefreshable: Long
  /**
    * The status of the Trusted Advisor check for which a refresh has been requested: "none", "enqueued", "processing", "success", or "abandoned".
    */
  var status: String
}

object TrustedAdvisorCheckRefreshStatus {
  @scala.inline
  def apply(checkId: String, millisUntilNextRefreshable: Long, status: String): TrustedAdvisorCheckRefreshStatus = {
    val __obj = js.Dynamic.literal(checkId = checkId, millisUntilNextRefreshable = millisUntilNextRefreshable, status = status)
  
    __obj.asInstanceOf[TrustedAdvisorCheckRefreshStatus]
  }
}

