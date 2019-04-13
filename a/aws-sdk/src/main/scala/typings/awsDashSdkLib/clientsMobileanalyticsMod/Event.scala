package typings
package awsDashSdkLib.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * A collection of key-value pairs that give additional context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var attributes: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A name signifying an event that occurred in your app. This is used for grouping and aggregating like events together for reporting purposes.
    */
  var eventType: String50Chars
  /**
    * A collection of key-value pairs that gives additional, measurable context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
    */
  var metrics: js.UndefOr[MapOfStringToNumber] = js.undefined
  /**
    * The session the event occured within. 
    */
  var session: js.UndefOr[Session] = js.undefined
  /**
    * The time the event occurred in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var timestamp: ISO8601Timestamp
  /**
    * The version of the event.
    */
  var version: js.UndefOr[String10Chars] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    eventType: String50Chars,
    timestamp: ISO8601Timestamp,
    attributes: MapOfStringToString = null,
    metrics: MapOfStringToNumber = null,
    session: Session = null,
    version: String10Chars = null
  ): Event = {
    val __obj = js.Dynamic.literal(eventType = eventType, timestamp = timestamp)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (session != null) __obj.updateDynamic("session")(session)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Event]
  }
}

