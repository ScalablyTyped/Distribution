package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCode extends js.Object {
  /**
    * Product code information.
    */
  var Code: js.UndefOr[__string] = js.undefined
  /**
    * Product code type.
    */
  var ProductType: js.UndefOr[__string] = js.undefined
}

object ProductCode {
  @scala.inline
  def apply(Code: __string = null, ProductType: __string = null): ProductCode = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType)
    __obj.asInstanceOf[ProductCode]
  }
}

