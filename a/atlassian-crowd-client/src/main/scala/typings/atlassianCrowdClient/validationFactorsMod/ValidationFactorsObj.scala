package typings.atlassianCrowdClient.validationFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationFactorsObj extends js.Object {
  var validationFactors: js.Array[_]
}

object ValidationFactorsObj {
  @scala.inline
  def apply(validationFactors: js.Array[_]): ValidationFactorsObj = {
    val __obj = js.Dynamic.literal(validationFactors = validationFactors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationFactorsObj]
  }
}

