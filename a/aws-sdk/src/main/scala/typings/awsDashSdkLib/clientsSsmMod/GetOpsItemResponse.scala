package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpsItemResponse extends js.Object {
  /**
    * The OpsItem.
    */
  var OpsItem: js.UndefOr[OpsItem] = js.undefined
}

object GetOpsItemResponse {
  @scala.inline
  def apply(OpsItem: OpsItem = null): GetOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    if (OpsItem != null) __obj.updateDynamic("OpsItem")(OpsItem)
    __obj.asInstanceOf[GetOpsItemResponse]
  }
}

