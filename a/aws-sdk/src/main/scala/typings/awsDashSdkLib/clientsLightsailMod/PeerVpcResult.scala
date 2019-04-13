package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerVpcResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object PeerVpcResult {
  @scala.inline
  def apply(operation: Operation = null): PeerVpcResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[PeerVpcResult]
  }
}

