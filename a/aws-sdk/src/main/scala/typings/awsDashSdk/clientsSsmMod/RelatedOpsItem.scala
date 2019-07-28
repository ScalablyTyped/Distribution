package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedOpsItem extends js.Object {
  /**
    * The ID of an OpsItem related to the current OpsItem.
    */
  var OpsItemId: String
}

object RelatedOpsItem {
  @scala.inline
  def apply(OpsItemId: String): RelatedOpsItem = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId)
  
    __obj.asInstanceOf[RelatedOpsItem]
  }
}

