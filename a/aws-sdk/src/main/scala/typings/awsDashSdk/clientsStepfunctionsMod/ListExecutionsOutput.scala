package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExecutionsOutput extends js.Object {
  /**
    * The list of matching executions.
    */
  var executions: ExecutionList
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[ListExecutionsPageToken] = js.undefined
}

object ListExecutionsOutput {
  @scala.inline
  def apply(executions: ExecutionList, nextToken: ListExecutionsPageToken = null): ListExecutionsOutput = {
    val __obj = js.Dynamic.literal(executions = executions)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListExecutionsOutput]
  }
}

