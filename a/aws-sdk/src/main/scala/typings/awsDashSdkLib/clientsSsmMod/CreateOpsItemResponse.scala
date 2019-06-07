package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOpsItemResponse extends js.Object {
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.undefined
}

object CreateOpsItemResponse {
  @scala.inline
  def apply(OpsItemId: String = null): CreateOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    if (OpsItemId != null) __obj.updateDynamic("OpsItemId")(OpsItemId)
    __obj.asInstanceOf[CreateOpsItemResponse]
  }
}

