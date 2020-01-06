package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubnetGroupResponse extends js.Object {
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[typings.awsDashSdk.clientsDaxMod.SubnetGroup] = js.native
}

object CreateSubnetGroupResponse {
  @scala.inline
  def apply(SubnetGroup: SubnetGroup = null): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SubnetGroup != null) __obj.updateDynamic("SubnetGroup")(SubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
}

