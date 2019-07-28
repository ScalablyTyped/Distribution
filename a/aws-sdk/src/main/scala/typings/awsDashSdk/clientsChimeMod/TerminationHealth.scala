package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminationHealth extends js.Object {
  /**
    * The source IP address.
    */
  var Source: js.UndefOr[String] = js.undefined
  /**
    * The timestamp, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
}

object TerminationHealth {
  @scala.inline
  def apply(Source: String = null, Timestamp: Iso8601Timestamp = null): TerminationHealth = {
    val __obj = js.Dynamic.literal()
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[TerminationHealth]
  }
}

