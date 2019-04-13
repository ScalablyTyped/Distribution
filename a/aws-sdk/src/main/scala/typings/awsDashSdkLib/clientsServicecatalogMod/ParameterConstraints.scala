package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterConstraints extends js.Object {
  /**
    * The values that the administrator has allowed for the parameter.
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

