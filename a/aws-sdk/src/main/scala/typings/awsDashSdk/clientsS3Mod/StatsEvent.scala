package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsEvent extends js.Object {
  /**
    * The Stats event details.
    */
  var Details: js.UndefOr[Stats] = js.undefined
}

object StatsEvent {
  @scala.inline
  def apply(Details: Stats = null): StatsEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    __obj.asInstanceOf[StatsEvent]
  }
}

