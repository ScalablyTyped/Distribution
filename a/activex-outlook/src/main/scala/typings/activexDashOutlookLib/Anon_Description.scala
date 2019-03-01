package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val Description: java.lang.String
  val Max: scala.Double
  val State: activexDashOutlookLib.OutlookNs.OlSyncState
  val Value: scala.Double
}

object Anon_Description {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Max: scala.Double,
    State: activexDashOutlookLib.OutlookNs.OlSyncState,
    Value: scala.Double
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Anon_Description]
  }
}

