package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.undefined
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.undefined
}

object ProvisioningParameter {
  @scala.inline
  def apply(Key: ParameterKey = null, Value: ParameterValue = null): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ProvisioningParameter]
  }
}

