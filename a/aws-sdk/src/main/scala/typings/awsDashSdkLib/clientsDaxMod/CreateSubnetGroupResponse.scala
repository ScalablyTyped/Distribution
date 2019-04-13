package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubnetGroupResponse extends js.Object {
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
}

object CreateSubnetGroupResponse {
  @scala.inline
  def apply(SubnetGroup: SubnetGroup = null): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SubnetGroup != null) __obj.updateDynamic("SubnetGroup")(SubnetGroup)
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
}

