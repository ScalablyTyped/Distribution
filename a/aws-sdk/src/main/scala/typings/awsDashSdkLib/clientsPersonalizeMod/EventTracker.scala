package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTracker extends js.Object {
  /**
    * The Amazon AWS account that owns the event tracker.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The date and time (in Unix format) that the event tracker was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.undefined
  /**
    * The date and time (in Unix time) that the event tracker was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the event tracker.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the event tracker. An event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.undefined
}

object EventTracker {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    creationDateTime: _Date = null,
    datasetGroupArn: Arn = null,
    eventTrackerArn: Arn = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null,
    trackingId: TrackingId = null
  ): EventTracker = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (eventTrackerArn != null) __obj.updateDynamic("eventTrackerArn")(eventTrackerArn)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId)
    __obj.asInstanceOf[EventTracker]
  }
}

