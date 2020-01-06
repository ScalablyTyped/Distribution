package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShippingLabelOutput extends js.Object {
  var ShippingLabelURL: js.UndefOr[GenericString] = js.native
  var Warning: js.UndefOr[GenericString] = js.native
}

object GetShippingLabelOutput {
  @scala.inline
  def apply(ShippingLabelURL: GenericString = null, Warning: GenericString = null): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    if (ShippingLabelURL != null) __obj.updateDynamic("ShippingLabelURL")(ShippingLabelURL.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
}

