package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTrackerSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the event tracker was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix time) that the event tracker was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the event tracker.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the event tracker. An event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object EventTrackerSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    eventTrackerArn: Arn = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null
  ): EventTrackerSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (eventTrackerArn != null) __obj.updateDynamic("eventTrackerArn")(eventTrackerArn.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTrackerSummary]
  }
}

