package typings
package atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationFactorsObj extends js.Object {
  var validationFactors: js.Array[_]
}

object ValidationFactorsObj {
  @scala.inline
  def apply(validationFactors: js.Array[_]): ValidationFactorsObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validationFactors")(validationFactors)
    __obj.asInstanceOf[ValidationFactorsObj]
  }
}

