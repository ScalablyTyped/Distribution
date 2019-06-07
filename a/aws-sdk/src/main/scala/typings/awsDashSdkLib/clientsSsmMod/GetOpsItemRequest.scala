package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpsItemRequest extends js.Object {
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: awsDashSdkLib.clientsSsmMod.OpsItemId
}

object GetOpsItemRequest {
  @scala.inline
  def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId)
  
    __obj.asInstanceOf[GetOpsItemRequest]
  }
}

