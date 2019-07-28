package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseEventsRequest extends js.Object {
  /**
    * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2 hours, enter 120. Default: 60  The minimum is 1 and the maximum is 14 days (20160 minutes).
    */
  var durationInMinutes: js.UndefOr[integer] = js.undefined
  /**
    * A token used for advancing to a specific page of results from for get relational database events request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the database from which to get events.
    */
  var relationalDatabaseName: ResourceName
}

object GetRelationalDatabaseEventsRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    durationInMinutes: js.UndefOr[integer] = js.undefined,
    pageToken: String = null
  ): GetRelationalDatabaseEventsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (!js.isUndefined(durationInMinutes)) __obj.updateDynamic("durationInMinutes")(durationInMinutes)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetRelationalDatabaseEventsRequest]
  }
}

