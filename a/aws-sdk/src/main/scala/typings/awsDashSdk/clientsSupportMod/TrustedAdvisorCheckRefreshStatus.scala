package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckRefreshStatus extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  /**
    * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
    */
  var millisUntilNextRefreshable: Long = js.native
  /**
    * The status of the Trusted Advisor check for which a refresh has been requested:     none: The check is not refreshed or the non-success status exceeds the timeout    enqueued: The check refresh requests has entered the refresh queue    processing: The check refresh request is picked up by the rule processing engine    success: The check is successfully refreshed    abandoned: The check refresh has failed  
    */
  var status: String = js.native
}

object TrustedAdvisorCheckRefreshStatus {
  @scala.inline
  def apply(checkId: String, millisUntilNextRefreshable: Long, status: String): TrustedAdvisorCheckRefreshStatus = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any], millisUntilNextRefreshable = millisUntilNextRefreshable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrustedAdvisorCheckRefreshStatus]
  }
}

