package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFpgaImageAttributeResult extends js.Object {
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[FpgaImageAttribute] = js.undefined
}

object DescribeFpgaImageAttributeResult {
  @scala.inline
  def apply(FpgaImageAttribute: FpgaImageAttribute = null): DescribeFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImageAttribute != null) __obj.updateDynamic("FpgaImageAttribute")(FpgaImageAttribute)
    __obj.asInstanceOf[DescribeFpgaImageAttributeResult]
  }
}

