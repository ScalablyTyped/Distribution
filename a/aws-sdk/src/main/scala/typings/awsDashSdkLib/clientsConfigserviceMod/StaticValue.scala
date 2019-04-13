package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticValue extends js.Object {
  /**
    * A list of values. For example, the ARN of the assumed role. 
    */
  var Values: js.UndefOr[StaticParameterValues] = js.undefined
}

object StaticValue {
  @scala.inline
  def apply(Values: StaticParameterValues = null): StaticValue = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[StaticValue]
  }
}

