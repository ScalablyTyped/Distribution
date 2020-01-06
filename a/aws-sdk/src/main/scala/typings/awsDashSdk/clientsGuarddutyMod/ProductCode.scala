package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCode extends js.Object {
  /**
    * Product code information.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * Product code type.
    */
  var ProductType: js.UndefOr[String] = js.native
}

object ProductCode {
  @scala.inline
  def apply(Code: String = null, ProductType: String = null): ProductCode = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (ProductType != null) __obj.updateDynamic("ProductType")(ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCode]
  }
}

