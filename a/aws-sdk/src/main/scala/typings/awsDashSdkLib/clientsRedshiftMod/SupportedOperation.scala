package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedOperation extends js.Object {
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.undefined
}

object SupportedOperation {
  @scala.inline
  def apply(OperationName: String = null): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    if (OperationName != null) __obj.updateDynamic("OperationName")(OperationName)
    __obj.asInstanceOf[SupportedOperation]
  }
}

