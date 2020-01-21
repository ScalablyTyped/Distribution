package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobDefinitionsResponse extends js.Object {
  /**
    * The list of job definitions.
    */
  var jobDefinitions: js.UndefOr[JobDefinitionList] = js.native
  /**
    * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeJobDefinitionsResponse {
  @scala.inline
  def apply(jobDefinitions: JobDefinitionList = null, nextToken: String = null): DescribeJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobDefinitions != null) __obj.updateDynamic("jobDefinitions")(jobDefinitions.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobDefinitionsResponse]
  }
}

