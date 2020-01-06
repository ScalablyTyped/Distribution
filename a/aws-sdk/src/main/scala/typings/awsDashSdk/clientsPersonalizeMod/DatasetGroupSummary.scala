package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetGroupSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the dataset group was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * If creating a dataset group fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix time) that the dataset group was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the dataset group.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the dataset group. A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING  
    */
  var status: js.UndefOr[Status] = js.native
}

object DatasetGroupSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetGroupArn: Arn = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null
  ): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetGroupSummary]
  }
}

