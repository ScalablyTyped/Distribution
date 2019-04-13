package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.undefined
  /**
    * If set to true, Value is ignored and the previous parameter value is kept.
    */
  var UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.undefined
}

object UpdateProvisioningParameter {
  @scala.inline
  def apply(
    Key: ParameterKey = null,
    UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined,
    Value: ParameterValue = null
  ): UpdateProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (!js.isUndefined(UsePreviousValue)) __obj.updateDynamic("UsePreviousValue")(UsePreviousValue)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[UpdateProvisioningParameter]
  }
}

