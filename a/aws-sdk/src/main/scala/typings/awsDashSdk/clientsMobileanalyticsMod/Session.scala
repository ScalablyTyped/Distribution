package typings.awsDashSdk.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The duration of the session.
    */
  var duration: js.UndefOr[Long] = js.native
  /**
    * A unique identifier for the session
    */
  var id: js.UndefOr[String50Chars] = js.native
  /**
    * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
  /**
    * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
}

object Session {
  @scala.inline
  def apply(
    duration: Int | scala.Double = null,
    id: String50Chars = null,
    startTimestamp: ISO8601Timestamp = null,
    stopTimestamp: ISO8601Timestamp = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp.asInstanceOf[js.Any])
    if (stopTimestamp != null) __obj.updateDynamic("stopTimestamp")(stopTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

