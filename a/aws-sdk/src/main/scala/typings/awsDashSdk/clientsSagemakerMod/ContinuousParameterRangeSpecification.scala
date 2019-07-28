package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousParameterRangeSpecification extends js.Object {
  /**
    * The maximum floating-point value allowed.
    */
  var MaxValue: ParameterValue
  /**
    * The minimum floating-point value allowed.
    */
  var MinValue: ParameterValue
}

object ContinuousParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue, MinValue = MinValue)
  
    __obj.asInstanceOf[ContinuousParameterRangeSpecification]
  }
}

