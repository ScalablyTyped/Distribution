package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * A listing of the dataset group's properties.
    */
  var datasetGroup: js.UndefOr[DatasetGroup] = js.undefined
}

object DescribeDatasetGroupResponse {
  @scala.inline
  def apply(datasetGroup: DatasetGroup = null): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroup != null) __obj.updateDynamic("datasetGroup")(datasetGroup)
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
}

