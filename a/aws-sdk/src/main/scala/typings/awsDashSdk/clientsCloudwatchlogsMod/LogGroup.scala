package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the log group.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The number of metric filters.
    */
  var metricFilterCount: js.UndefOr[FilterCount] = js.undefined
  var retentionInDays: js.UndefOr[Days] = js.undefined
  /**
    * The number of bytes stored.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.undefined
}

object LogGroup {
  @scala.inline
  def apply(
    arn: Arn = null,
    creationTime: Int | Double = null,
    kmsKeyId: KmsKeyId = null,
    logGroupName: LogGroupName = null,
    metricFilterCount: Int | Double = null,
    retentionInDays: Int | Double = null,
    storedBytes: Int | Double = null
  ): LogGroup = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (metricFilterCount != null) __obj.updateDynamic("metricFilterCount")(metricFilterCount.asInstanceOf[js.Any])
    if (retentionInDays != null) __obj.updateDynamic("retentionInDays")(retentionInDays.asInstanceOf[js.Any])
    if (storedBytes != null) __obj.updateDynamic("storedBytes")(storedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogGroup]
  }
}

