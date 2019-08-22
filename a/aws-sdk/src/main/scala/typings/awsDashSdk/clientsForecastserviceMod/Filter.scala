package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The condition to apply.
    */
  var Condition: FilterConditionString
  /**
    * The name of the parameter to filter on.
    */
  var Key: String
  /**
    * A valid value for Key.
    */
  var Value: Arn
}

object Filter {
  @scala.inline
  def apply(Condition: FilterConditionString, Key: String, Value: Arn): Filter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Key = Key, Value = Value)
  
    __obj.asInstanceOf[Filter]
  }
}

