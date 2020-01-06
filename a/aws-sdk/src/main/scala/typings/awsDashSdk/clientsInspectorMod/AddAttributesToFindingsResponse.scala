package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAttributesToFindingsResponse extends js.Object {
  /**
    * Attribute details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object AddAttributesToFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems): AddAttributesToFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddAttributesToFindingsResponse]
  }
}

