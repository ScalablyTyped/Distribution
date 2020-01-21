package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkGroupConfigurationUpdates extends js.Object {
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.native
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.native
  /**
    * If set to true, allows members assigned to a workgroup to specify Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typings.awsSdk.athenaMod.ResultConfigurationUpdates] = js.native
}

object WorkGroupConfigurationUpdates {
  @scala.inline
  def apply(
    BytesScannedCutoffPerQuery: Int | Double = null,
    EnforceWorkGroupConfiguration: js.UndefOr[scala.Boolean] = js.undefined,
    PublishCloudWatchMetricsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    RemoveBytesScannedCutoffPerQuery: js.UndefOr[scala.Boolean] = js.undefined,
    RequesterPaysEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ResultConfigurationUpdates: ResultConfigurationUpdates = null
  ): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    if (BytesScannedCutoffPerQuery != null) __obj.updateDynamic("BytesScannedCutoffPerQuery")(BytesScannedCutoffPerQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(EnforceWorkGroupConfiguration)) __obj.updateDynamic("EnforceWorkGroupConfiguration")(EnforceWorkGroupConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(PublishCloudWatchMetricsEnabled)) __obj.updateDynamic("PublishCloudWatchMetricsEnabled")(PublishCloudWatchMetricsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveBytesScannedCutoffPerQuery)) __obj.updateDynamic("RemoveBytesScannedCutoffPerQuery")(RemoveBytesScannedCutoffPerQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterPaysEnabled)) __obj.updateDynamic("RequesterPaysEnabled")(RequesterPaysEnabled.asInstanceOf[js.Any])
    if (ResultConfigurationUpdates != null) __obj.updateDynamic("ResultConfigurationUpdates")(ResultConfigurationUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
}

