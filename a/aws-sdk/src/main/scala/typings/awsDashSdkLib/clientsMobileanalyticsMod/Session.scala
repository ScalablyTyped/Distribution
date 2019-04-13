package typings
package awsDashSdkLib.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * The duration of the session.
    */
  var duration: js.UndefOr[Long] = js.undefined
  /**
    * A unique identifier for the session
    */
  var id: js.UndefOr[String50Chars] = js.undefined
  /**
    * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
  /**
    * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    duration: js.UndefOr[Long] = js.undefined,
    id: String50Chars = null,
    startTimestamp: ISO8601Timestamp = null,
    stopTimestamp: ISO8601Timestamp = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (id != null) __obj.updateDynamic("id")(id)
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp)
    if (stopTimestamp != null) __obj.updateDynamic("stopTimestamp")(stopTimestamp)
    __obj.asInstanceOf[Session]
  }
}

