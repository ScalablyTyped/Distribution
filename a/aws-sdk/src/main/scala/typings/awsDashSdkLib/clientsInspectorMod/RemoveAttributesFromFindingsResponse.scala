package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributesFromFindingsResponse extends js.Object {
  /**
    * Attributes details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object RemoveAttributesFromFindingsResponse {
  @scala.inline
  def apply(failedItems: FailedItems): RemoveAttributesFromFindingsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems)
  
    __obj.asInstanceOf[RemoveAttributesFromFindingsResponse]
  }
}

