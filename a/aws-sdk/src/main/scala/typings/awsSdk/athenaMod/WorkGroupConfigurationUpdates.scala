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
  def apply(): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
  @scala.inline
  implicit class WorkGroupConfigurationUpdatesOps[Self <: WorkGroupConfigurationUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = this.set("BytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesScannedCutoffPerQuery: Self = this.set("BytesScannedCutoffPerQuery", js.undefined)
    @scala.inline
    def setEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = this.set("EnforceWorkGroupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceWorkGroupConfiguration: Self = this.set("EnforceWorkGroupConfiguration", js.undefined)
    @scala.inline
    def setPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = this.set("PublishCloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishCloudWatchMetricsEnabled: Self = this.set("PublishCloudWatchMetricsEnabled", js.undefined)
    @scala.inline
    def setRemoveBytesScannedCutoffPerQuery(value: BoxedBoolean): Self = this.set("RemoveBytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveBytesScannedCutoffPerQuery: Self = this.set("RemoveBytesScannedCutoffPerQuery", js.undefined)
    @scala.inline
    def setRequesterPaysEnabled(value: BoxedBoolean): Self = this.set("RequesterPaysEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPaysEnabled: Self = this.set("RequesterPaysEnabled", js.undefined)
    @scala.inline
    def setResultConfigurationUpdates(value: ResultConfigurationUpdates): Self = this.set("ResultConfigurationUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultConfigurationUpdates: Self = this.set("ResultConfigurationUpdates", js.undefined)
  }
  
}

