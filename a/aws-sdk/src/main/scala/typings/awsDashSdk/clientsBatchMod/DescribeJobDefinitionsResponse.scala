package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobDefinitionsResponse extends js.Object {
  /**
    * The list of job definitions. 
    */
  var jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined
  /**
    * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object DescribeJobDefinitionsResponse {
  @scala.inline
  def apply(jobDefinitions: JobDefinitionList = null, nextToken: String = null): DescribeJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobDefinitions != null) __obj.updateDynamic("jobDefinitions")(jobDefinitions)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeJobDefinitionsResponse]
  }
}

