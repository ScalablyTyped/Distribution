package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenInstancePublicPortsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object OpenInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): OpenInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsResult]
  }
}

