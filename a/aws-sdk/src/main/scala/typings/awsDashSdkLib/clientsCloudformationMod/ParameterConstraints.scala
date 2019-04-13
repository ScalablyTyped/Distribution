package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterConstraints extends js.Object {
  /**
    * A list of values that are permitted for a parameter.
    */
  var AllowedValues: js.UndefOr[AllowedValues] = js.undefined
}

object ParameterConstraints {
  @scala.inline
  def apply(AllowedValues: AllowedValues = null): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues)
    __obj.asInstanceOf[ParameterConstraints]
  }
}

