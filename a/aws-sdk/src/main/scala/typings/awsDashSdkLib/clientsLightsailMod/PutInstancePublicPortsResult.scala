package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutInstancePublicPortsResult extends js.Object {
  /**
    * Describes metadata about the operation you just executed.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object PutInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): PutInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[PutInstancePublicPortsResult]
  }
}

