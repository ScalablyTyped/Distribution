package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerParameterRangeSpecification extends js.Object {
  /**
    * The maximum integer value allowed.
    */
  var MaxValue: ParameterValue
  /**
    * The minimum integer value allowed.
    */
  var MinValue: ParameterValue
}

object IntegerParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): IntegerParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue, MinValue = MinValue)
  
    __obj.asInstanceOf[IntegerParameterRangeSpecification]
  }
}

