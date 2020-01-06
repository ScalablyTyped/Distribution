package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * The path to the log file where the step failure root cause was originally recorded.
    */
  var LogFile: js.UndefOr[String] = js.native
  /**
    * The descriptive message including the error the EMR service has identified as the cause of step failure. This is text from an error log that describes the root cause of the failure.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The reason for the step failure. In the case where the service cannot successfully determine the root cause of the failure, it returns "Unknown Error" as a reason.
    */
  var Reason: js.UndefOr[String] = js.native
}

object FailureDetails {
  @scala.inline
  def apply(LogFile: String = null, Message: String = null, Reason: String = null): FailureDetails = {
    val __obj = js.Dynamic.literal()
    if (LogFile != null) __obj.updateDynamic("LogFile")(LogFile.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
}

