package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerRecordedEventAttributes extends js.Object {
  /**
    * The ID of the DecisionTaskCompleted event corresponding to the decision task that resulted in the RecordMarker decision that requested this marker. This information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
    */
  var decisionTaskCompletedEventId: EventId
  /**
    * The details of the marker.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    * The name of the marker.
    */
  var markerName: MarkerName
}

object MarkerRecordedEventAttributes {
  @scala.inline
  def apply(decisionTaskCompletedEventId: EventId, markerName: MarkerName, details: Data = null): MarkerRecordedEventAttributes = {
    val __obj = js.Dynamic.literal(decisionTaskCompletedEventId = decisionTaskCompletedEventId, markerName = markerName)
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[MarkerRecordedEventAttributes]
  }
}

