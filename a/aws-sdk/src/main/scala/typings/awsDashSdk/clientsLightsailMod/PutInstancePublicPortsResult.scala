package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsResult extends js.Object {
  /**
    * Describes metadata about the operation you just executed.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object PutInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): PutInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsResult]
  }
}

