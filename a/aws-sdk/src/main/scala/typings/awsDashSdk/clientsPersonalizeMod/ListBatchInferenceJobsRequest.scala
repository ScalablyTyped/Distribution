package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBatchInferenceJobsRequest extends js.Object {
  /**
    * The maximum number of batch inference job results to return in each page. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version from which the batch inference jobs were created.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object ListBatchInferenceJobsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null, solutionVersionArn: Arn = null): ListBatchInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBatchInferenceJobsRequest]
  }
}

