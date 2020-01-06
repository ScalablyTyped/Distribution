package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}

object ProvisioningParameter {
  @scala.inline
  def apply(Key: ParameterKey = null, Value: ParameterValue = null): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningParameter]
  }
}

