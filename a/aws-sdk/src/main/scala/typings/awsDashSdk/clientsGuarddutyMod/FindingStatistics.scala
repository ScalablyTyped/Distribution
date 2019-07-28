package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingStatistics extends js.Object {
  /**
    * Represents a map of severity to count statistic for a set of findings
    */
  var CountBySeverity: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.CountBySeverity] = js.undefined
}

object FindingStatistics {
  @scala.inline
  def apply(CountBySeverity: CountBySeverity = null): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    if (CountBySeverity != null) __obj.updateDynamic("CountBySeverity")(CountBySeverity)
    __obj.asInstanceOf[FindingStatistics]
  }
}

