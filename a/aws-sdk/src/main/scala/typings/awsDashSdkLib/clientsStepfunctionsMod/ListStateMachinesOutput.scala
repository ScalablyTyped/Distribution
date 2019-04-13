package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStateMachinesOutput extends js.Object {
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
  var stateMachines: StateMachineList
}

object ListStateMachinesOutput {
  @scala.inline
  def apply(stateMachines: StateMachineList, nextToken: PageToken = null): ListStateMachinesOutput = {
    val __obj = js.Dynamic.literal(stateMachines = stateMachines)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListStateMachinesOutput]
  }
}

