package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProtectionResponse extends js.Object {
  /**
    * The Protection object that is described.
    */
  var Protection: js.UndefOr[Protection] = js.undefined
}

object DescribeProtectionResponse {
  @scala.inline
  def apply(Protection: Protection = null): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Protection != null) __obj.updateDynamic("Protection")(Protection)
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
}

