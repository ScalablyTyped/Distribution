package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddAttributesToFindingsResponse extends js.Object {
  /**
    * Attribute details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object AddAttributesToFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems): AddAttributesToFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems)
  
    __obj.asInstanceOf[AddAttributesToFindingsResponse]
  }
}

