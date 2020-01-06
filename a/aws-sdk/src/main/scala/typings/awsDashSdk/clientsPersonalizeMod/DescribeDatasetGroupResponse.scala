package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * A listing of the dataset group's properties.
    */
  var datasetGroup: js.UndefOr[DatasetGroup] = js.native
}

object DescribeDatasetGroupResponse {
  @scala.inline
  def apply(datasetGroup: DatasetGroup = null): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroup != null) __obj.updateDynamic("datasetGroup")(datasetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
}

