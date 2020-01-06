package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetGroupsResponse extends js.Object {
  /**
    * The list of your dataset groups.
    */
  var datasetGroups: js.UndefOr[DatasetGroups] = js.native
  /**
    * A token for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(datasetGroups: DatasetGroups = null, nextToken: NextToken = null): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroups != null) __obj.updateDynamic("datasetGroups")(datasetGroups.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
}

