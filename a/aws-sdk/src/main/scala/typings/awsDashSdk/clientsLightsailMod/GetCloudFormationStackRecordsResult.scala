package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFormationStackRecordsResult extends js.Object {
  /**
    * A list of objects describing the CloudFormation stack records.
    */
  var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.native
  /**
    * A token used for advancing to the next page of results of your get relational database bundles request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetCloudFormationStackRecordsResult {
  @scala.inline
  def apply(cloudFormationStackRecords: CloudFormationStackRecordList = null, nextPageToken: String = null): GetCloudFormationStackRecordsResult = {
    val __obj = js.Dynamic.literal()
    if (cloudFormationStackRecords != null) __obj.updateDynamic("cloudFormationStackRecords")(cloudFormationStackRecords.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFormationStackRecordsResult]
  }
}

