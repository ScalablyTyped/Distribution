package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseEventsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get relational database events request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * An object describing the result of your get relational database events request.
    */
  var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.undefined
}

object GetRelationalDatabaseEventsResult {
  @scala.inline
  def apply(nextPageToken: String = null, relationalDatabaseEvents: RelationalDatabaseEventList = null): GetRelationalDatabaseEventsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (relationalDatabaseEvents != null) __obj.updateDynamic("relationalDatabaseEvents")(relationalDatabaseEvents)
    __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
  }
}

