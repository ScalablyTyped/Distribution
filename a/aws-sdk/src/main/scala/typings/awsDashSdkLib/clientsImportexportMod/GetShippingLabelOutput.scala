package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetShippingLabelOutput extends js.Object {
  var ShippingLabelURL: js.UndefOr[GenericString] = js.undefined
  var Warning: js.UndefOr[GenericString] = js.undefined
}

object GetShippingLabelOutput {
  @scala.inline
  def apply(ShippingLabelURL: GenericString = null, Warning: GenericString = null): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    if (ShippingLabelURL != null) __obj.updateDynamic("ShippingLabelURL")(ShippingLabelURL)
    if (Warning != null) __obj.updateDynamic("Warning")(Warning)
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
}

