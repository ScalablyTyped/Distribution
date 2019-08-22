package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalParameterRange extends js.Object {
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: typings.awsDashSdk.clientsForecastserviceMod.Name
  /**
    * A list of the tunable categories for the hyperparameter.
    */
  var Values: typings.awsDashSdk.clientsForecastserviceMod.Values
}

object CategoricalParameterRange {
  @scala.inline
  def apply(Name: Name, Values: Values): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name, Values = Values)
  
    __obj.asInstanceOf[CategoricalParameterRange]
  }
}

