package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingStatus extends js.Object {
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[TStamp] = js.native
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.native
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.native
}

object LoggingStatus {
  @scala.inline
  def apply(
    BucketName: String = null,
    LastFailureMessage: String = null,
    LastFailureTime: TStamp = null,
    LastSuccessfulDeliveryTime: TStamp = null,
    LoggingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    S3KeyPrefix: String = null
  ): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage.asInstanceOf[js.Any])
    if (LastFailureTime != null) __obj.updateDynamic("LastFailureTime")(LastFailureTime.asInstanceOf[js.Any])
    if (LastSuccessfulDeliveryTime != null) __obj.updateDynamic("LastSuccessfulDeliveryTime")(LastSuccessfulDeliveryTime.asInstanceOf[js.Any])
    if (!js.isUndefined(LoggingEnabled)) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingStatus]
  }
}

