package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneStackResult extends js.Object {
  /**
    * The cloned stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object CloneStackResult {
  @scala.inline
  def apply(StackId: String = null): CloneStackResult = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CloneStackResult]
  }
}

