package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseEventsRequest extends js.Object {
  /**
    * The number of minutes in the past from which to retrieve events. For example, to get all events from the past 2 hours, enter 120. Default: 60  The minimum is 1 and the maximum is 14 days (20160 minutes).
    */
  var durationInMinutes: js.UndefOr[integer] = js.native
  /**
    * A token used for advancing to a specific page of results from for get relational database events request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the database from which to get events.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseEventsRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    durationInMinutes: Int | Double = null,
    pageToken: String = null
  ): GetRelationalDatabaseEventsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    if (durationInMinutes != null) __obj.updateDynamic("durationInMinutes")(durationInMinutes.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseEventsRequest]
  }
}

