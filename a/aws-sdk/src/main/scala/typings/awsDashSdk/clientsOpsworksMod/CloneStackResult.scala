package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneStackResult extends js.Object {
  /**
    * The cloned stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object CloneStackResult {
  @scala.inline
  def apply(StackId: String = null): CloneStackResult = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneStackResult]
  }
}

