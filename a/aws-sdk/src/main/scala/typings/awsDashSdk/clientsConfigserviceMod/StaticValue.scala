package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticValue extends js.Object {
  /**
    * A list of values. For example, the ARN of the assumed role. 
    */
  var Values: StaticParameterValues = js.native
}

object StaticValue {
  @scala.inline
  def apply(Values: StaticParameterValues): StaticValue = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticValue]
  }
}

