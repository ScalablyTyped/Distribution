package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingCriteria extends js.Object {
  /**
    * Represents a map of finding properties that match specified conditions and values when querying findings.
    */
  var Criterion: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Criterion] = js.undefined
}

object FindingCriteria {
  @scala.inline
  def apply(Criterion: Criterion = null): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    if (Criterion != null) __obj.updateDynamic("Criterion")(Criterion)
    __obj.asInstanceOf[FindingCriteria]
  }
}

