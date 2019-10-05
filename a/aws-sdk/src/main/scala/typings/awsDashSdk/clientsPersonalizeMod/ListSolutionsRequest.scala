package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSolutionsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The maximum number of solutions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListSolutions for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListSolutionsRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn = null, maxResults: Int | Double = null, nextToken: NextToken = null): ListSolutionsRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSolutionsRequest]
  }
}

