package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetRequest extends js.Object {
  /**
    * A list of actions that create the data set contents.
    */
  var actions: DatasetActions
  /**
    * When data set contents are created they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
  /**
    * The name of the data set.
    */
  var datasetName: DatasetName
  /**
    * [Optional] How long, in days, versions of data set contents are kept for the data set. If not specified or set to null, versions of data set contents are retained for at most 90 days. The number of versions of data set contents retained is determined by the versioningConfiguration parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  /**
    * Metadata which can be used to manage the data set.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * A list of triggers. A trigger causes data set contents to be populated at a specified time interval or when another data set's contents are created. The list of triggers can be empty or contain up to five DataSetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
  /**
    * [Optional] How many versions of data set contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the "retentionPeriod" parameter. (For more information, see https://docs.aws.amazon.com/iotanalytics/latest/userguide/getting-started.html#aws-iot-analytics-dataset-versions)
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
}

object CreateDatasetRequest {
  @scala.inline
  def apply(
    actions: DatasetActions,
    datasetName: DatasetName,
    contentDeliveryRules: DatasetContentDeliveryRules = null,
    retentionPeriod: RetentionPeriod = null,
    tags: TagList = null,
    triggers: DatasetTriggers = null,
    versioningConfiguration: VersioningConfiguration = null
  ): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions, datasetName = datasetName)
    if (contentDeliveryRules != null) __obj.updateDynamic("contentDeliveryRules")(contentDeliveryRules)
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    if (versioningConfiguration != null) __obj.updateDynamic("versioningConfiguration")(versioningConfiguration)
    __obj.asInstanceOf[CreateDatasetRequest]
  }
}

