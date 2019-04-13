package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingStatus extends js.Object {
  /**
    * The name of the S3 bucket where the log files are stored.
    */
  var BucketName: js.UndefOr[String] = js.undefined
  /**
    * The message indicating that logs failed to be delivered.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  /**
    * The last time when logs failed to be delivered.
    */
  var LastFailureTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The last time that logs were delivered.
    */
  var LastSuccessfulDeliveryTime: js.UndefOr[TStamp] = js.undefined
  /**
    *  true if logging is on, false if logging is off.
    */
  var LoggingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The prefix applied to the log file names.
    */
  var S3KeyPrefix: js.UndefOr[String] = js.undefined
}

object LoggingStatus {
  @scala.inline
  def apply(
    BucketName: String = null,
    LastFailureMessage: String = null,
    LastFailureTime: TStamp = null,
    LastSuccessfulDeliveryTime: TStamp = null,
    LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
    S3KeyPrefix: String = null
  ): LoggingStatus = {
    val __obj = js.Dynamic.literal()
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName)
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage)
    if (LastFailureTime != null) __obj.updateDynamic("LastFailureTime")(LastFailureTime)
    if (LastSuccessfulDeliveryTime != null) __obj.updateDynamic("LastSuccessfulDeliveryTime")(LastSuccessfulDeliveryTime)
    if (!js.isUndefined(LoggingEnabled)) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    __obj.asInstanceOf[LoggingStatus]
  }
}

