package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorStateSummary extends js.Object {
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.undefined
}

object DetectorStateSummary {
  @scala.inline
  def apply(stateName: StateName = null): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    if (stateName != null) __obj.updateDynamic("stateName")(stateName)
    __obj.asInstanceOf[DetectorStateSummary]
  }
}

