package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseLogEventsResult extends js.Object {
  /**
    * A token used for advancing to the previous page of results from your get relational database log events request.
    */
  var nextBackwardToken: js.UndefOr[String] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get relational database log events request.
    */
  var nextForwardToken: js.UndefOr[String] = js.undefined
  /**
    * An object describing the result of your get relational database log events request.
    */
  var resourceLogEvents: js.UndefOr[LogEventList] = js.undefined
}

object GetRelationalDatabaseLogEventsResult {
  @scala.inline
  def apply(
    nextBackwardToken: String = null,
    nextForwardToken: String = null,
    resourceLogEvents: LogEventList = null
  ): GetRelationalDatabaseLogEventsResult = {
    val __obj = js.Dynamic.literal()
    if (nextBackwardToken != null) __obj.updateDynamic("nextBackwardToken")(nextBackwardToken)
    if (nextForwardToken != null) __obj.updateDynamic("nextForwardToken")(nextForwardToken)
    if (resourceLogEvents != null) __obj.updateDynamic("resourceLogEvents")(resourceLogEvents)
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsResult]
  }
}

