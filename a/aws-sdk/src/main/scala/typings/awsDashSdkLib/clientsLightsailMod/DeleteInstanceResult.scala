package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your delete instance request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DeleteInstanceResult {
  @scala.inline
  def apply(operations: OperationList = null): DeleteInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DeleteInstanceResult]
  }
}

