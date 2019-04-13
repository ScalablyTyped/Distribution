package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalParameterRangeSpecification extends js.Object {
  /**
    * The allowed categories for the hyperparameter.
    */
  var Values: ParameterValues
}

object CategoricalParameterRangeSpecification {
  @scala.inline
  def apply(Values: ParameterValues): CategoricalParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(Values = Values)
  
    __obj.asInstanceOf[CategoricalParameterRangeSpecification]
  }
}

