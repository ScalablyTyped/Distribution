package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsItemRequest extends js.Object {
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: typings.awsDashSdk.clientsSsmMod.OpsItemId = js.native
}

object GetOpsItemRequest {
  @scala.inline
  def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOpsItemRequest]
  }
}

