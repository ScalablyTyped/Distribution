package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your delete key pair request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object DeleteKeyPairResult {
  @scala.inline
  def apply(operation: Operation = null): DeleteKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[DeleteKeyPairResult]
  }
}

