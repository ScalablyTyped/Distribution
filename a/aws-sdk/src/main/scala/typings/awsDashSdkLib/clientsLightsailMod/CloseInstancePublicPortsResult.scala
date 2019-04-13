package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseInstancePublicPortsResult extends js.Object {
  /**
    * An array of key-value pairs that contains information about the operation.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object CloseInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): CloseInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[CloseInstancePublicPortsResult]
  }
}

