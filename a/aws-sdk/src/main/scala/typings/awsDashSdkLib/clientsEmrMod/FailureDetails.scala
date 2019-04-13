package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureDetails extends js.Object {
  /**
    * The path to the log file where the step failure root cause was originally recorded.
    */
  var LogFile: js.UndefOr[String] = js.undefined
  /**
    * The descriptive message including the error the EMR service has identified as the cause of step failure. This is text from an error log that describes the root cause of the failure.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The reason for the step failure. In the case where the service cannot successfully determine the root cause of the failure, it returns "Unknown Error" as a reason.
    */
  var Reason: js.UndefOr[String] = js.undefined
}

object FailureDetails {
  @scala.inline
  def apply(LogFile: String = null, Message: String = null, Reason: String = null): FailureDetails = {
    val __obj = js.Dynamic.literal()
    if (LogFile != null) __obj.updateDynamic("LogFile")(LogFile)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[FailureDetails]
  }
}

