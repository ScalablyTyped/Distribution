package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkGroupConfiguration extends js.Object {
  /**
    * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and the encryption option, if any, used for query results.
    */
  var ResultConfiguration: js.UndefOr[ResultConfiguration] = js.undefined
}

object WorkGroupConfiguration {
  @scala.inline
  def apply(
    BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined,
    EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined,
    PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined,
    ResultConfiguration: ResultConfiguration = null
  ): WorkGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesScannedCutoffPerQuery)) __obj.updateDynamic("BytesScannedCutoffPerQuery")(BytesScannedCutoffPerQuery)
    if (!js.isUndefined(EnforceWorkGroupConfiguration)) __obj.updateDynamic("EnforceWorkGroupConfiguration")(EnforceWorkGroupConfiguration)
    if (!js.isUndefined(PublishCloudWatchMetricsEnabled)) __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(PublishCloudWatchMetricsEnabled)
    if (ResultConfiguration != null) __obj.updateDynamic("ResultConfiguration")(ResultConfiguration)
    __obj.asInstanceOf[WorkGroupConfiguration]
  }
}

