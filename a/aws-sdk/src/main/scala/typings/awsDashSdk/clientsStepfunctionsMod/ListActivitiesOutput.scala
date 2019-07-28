package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActivitiesOutput extends js.Object {
  /**
    * The list of activities.
    */
  var activities: ActivityList
  /**
    * If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[PageToken] = js.undefined
}

object ListActivitiesOutput {
  @scala.inline
  def apply(activities: ActivityList, nextToken: PageToken = null): ListActivitiesOutput = {
    val __obj = js.Dynamic.literal(activities = activities)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListActivitiesOutput]
  }
}

