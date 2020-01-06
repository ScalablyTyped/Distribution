package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterConstraints extends js.Object {
  /**
    * A list of values that are permitted for a parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.AllowedValues] = js.native
}

object ParameterConstraints {
  @scala.inline
  def apply(AllowedValues: AllowedValues = null): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterConstraints]
  }
}

