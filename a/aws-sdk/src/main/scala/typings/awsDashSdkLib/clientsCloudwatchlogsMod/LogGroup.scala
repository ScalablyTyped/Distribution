package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

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
    creationTime: js.UndefOr[Timestamp] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    logGroupName: LogGroupName = null,
    metricFilterCount: js.UndefOr[FilterCount] = js.undefined,
    retentionInDays: js.UndefOr[Days] = js.undefined,
    storedBytes: js.UndefOr[StoredBytes] = js.undefined
  ): LogGroup = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (!js.isUndefined(metricFilterCount)) __obj.updateDynamic("metricFilterCount")(metricFilterCount)
    if (!js.isUndefined(retentionInDays)) __obj.updateDynamic("retentionInDays")(retentionInDays)
    if (!js.isUndefined(storedBytes)) __obj.updateDynamic("storedBytes")(storedBytes)
    __obj.asInstanceOf[LogGroup]
  }
}

