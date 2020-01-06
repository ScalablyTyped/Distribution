package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousParameterRangeSpecification extends js.Object {
  /**
    * The maximum floating-point value allowed.
    */
  var MaxValue: ParameterValue = js.native
  /**
    * The minimum floating-point value allowed.
    */
  var MinValue: ParameterValue = js.native
}

object ContinuousParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContinuousParameterRangeSpecification]
  }
}

