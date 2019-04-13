package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /**
    * The "DatasetAction" objects that automatically create the data set contents.
    */
  var actions: js.UndefOr[DatasetActions] = js.undefined
  /**
    * The ARN of the data set.
    */
  var arn: js.UndefOr[DatasetArn] = js.undefined
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
  /**
    * When the data set was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The last time the data set was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the data set.
    */
  var name: js.UndefOr[DatasetName] = js.undefined
  /**
    * [Optional] How long, in days, message data is kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  /**
    * The status of the data set.
    */
  var status: js.UndefOr[DatasetStatus] = js.undefined
  /**
    * The "DatasetTrigger" objects that specify when the data set is automatically updated.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    actions: DatasetActions = null,
    arn: DatasetArn = null,
    contentDeliveryRules: DatasetContentDeliveryRules = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: DatasetName = null,
    retentionPeriod: RetentionPeriod = null,
    status: DatasetStatus = null,
    triggers: DatasetTriggers = null,
    versioningConfiguration: VersioningConfiguration = null
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (contentDeliveryRules != null) __obj.updateDynamic("contentDeliveryRules")(contentDeliveryRules)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    if (versioningConfiguration != null) __obj.updateDynamic("versioningConfiguration")(versioningConfiguration)
    __obj.asInstanceOf[Dataset]
  }
}

