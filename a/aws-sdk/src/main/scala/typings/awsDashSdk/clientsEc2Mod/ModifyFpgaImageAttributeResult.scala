package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyFpgaImageAttributeResult extends js.Object {
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.FpgaImageAttribute] = js.native
}

object ModifyFpgaImageAttributeResult {
  @scala.inline
  def apply(FpgaImageAttribute: FpgaImageAttribute = null): ModifyFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageAttribute != null) __obj.updateDynamic("FpgaImageAttribute")(FpgaImageAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFpgaImageAttributeResult]
  }
}

