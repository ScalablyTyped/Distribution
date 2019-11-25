package typings.atlassianDashCrowdDashClient.libModelsValidationDashFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationFactors extends js.Object {
  val validationFactors: js.Any
  def toCrowd(): ValidationFactorsObj
}

object ValidationFactors {
  @scala.inline
  def apply(toCrowd: () => ValidationFactorsObj, validationFactors: js.Any): ValidationFactors = {
    val __obj = js.Dynamic.literal(toCrowd = js.Any.fromFunction0(toCrowd), validationFactors = validationFactors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationFactors]
  }
}

