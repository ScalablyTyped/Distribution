package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetGroupsResponse extends js.Object {
  /**
    * The list of your dataset groups.
    */
  var datasetGroups: js.UndefOr[DatasetGroups] = js.undefined
  /**
    * A token for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(datasetGroups: DatasetGroups = null, nextToken: NextToken = null): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroups != null) __obj.updateDynamic("datasetGroups")(datasetGroups)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
}

