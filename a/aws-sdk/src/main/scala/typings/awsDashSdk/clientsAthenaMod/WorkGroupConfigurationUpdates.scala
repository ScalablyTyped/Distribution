package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkGroupConfigurationUpdates extends js.Object {
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.ResultConfigurationUpdates] = js.undefined
}

object WorkGroupConfigurationUpdates {
  @scala.inline
  def apply(
    BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
    EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
    PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
    RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined,
    ResultConfigurationUpdates: ResultConfigurationUpdates = null
  ): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesScannedCutoffPerQuery)) __obj.updateDynamic("BytesScannedCutoffPerQuery")(BytesScannedCutoffPerQuery)
    if (!js.isUndefined(EnforceWorkGroupConfiguration)) __obj.updateDynamic("EnforceWorkGroupConfiguration")(EnforceWorkGroupConfiguration)
    if (!js.isUndefined(PublishCloudWatchMetricsEnabled)) __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(PublishCloudWatchMetricsEnabled)
    if (!js.isUndefined(RemoveBytesScannedCutoffPerQuery)) __obj.updateDynamic("RemoveBytesScannedCutoffPerQuery")(RemoveBytesScannedCutoffPerQuery)
    if (ResultConfigurationUpdates != null) __obj.updateDynamic("ResultConfigurationUpdates")(ResultConfigurationUpdates)
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
}

