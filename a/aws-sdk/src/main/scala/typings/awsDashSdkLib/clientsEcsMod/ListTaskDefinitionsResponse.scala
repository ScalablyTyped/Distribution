package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTaskDefinitionsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListTaskDefinitions request. When the results of a ListTaskDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The list of task definition Amazon Resource Name (ARN) entries for the ListTaskDefinitions request.
    */
  var taskDefinitionArns: js.UndefOr[StringList] = js.undefined
}

object ListTaskDefinitionsResponse {
  @scala.inline
  def apply(nextToken: String = null, taskDefinitionArns: StringList = null): ListTaskDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (taskDefinitionArns != null) __obj.updateDynamic("taskDefinitionArns")(taskDefinitionArns)
    __obj.asInstanceOf[ListTaskDefinitionsResponse]
  }
}

