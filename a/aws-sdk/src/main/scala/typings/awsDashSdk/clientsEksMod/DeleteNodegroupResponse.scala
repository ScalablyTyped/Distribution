package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNodegroupResponse extends js.Object {
  /**
    * The full description of your deleted node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}

object DeleteNodegroupResponse {
  @scala.inline
  def apply(nodegroup: Nodegroup = null): DeleteNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    if (nodegroup != null) __obj.updateDynamic("nodegroup")(nodegroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodegroupResponse]
  }
}

