package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalParameterRange extends js.Object {
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: ParameterKey
  /**
    * A list of the categories for the hyperparameter.
    */
  var Values: ParameterValues
}

object CategoricalParameterRange {
  @scala.inline
  def apply(Name: ParameterKey, Values: ParameterValues): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name, Values = Values)
  
    __obj.asInstanceOf[CategoricalParameterRange]
  }
}

