package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the static IP address you allocated.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object AllocateStaticIpResult {
  @scala.inline
  def apply(operations: OperationList = null): AllocateStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[AllocateStaticIpResult]
  }
}

