package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubnetGroupResponse extends js.Object {
  /**
    * The subnet group that has been modified.
    */
  var SubnetGroup: js.UndefOr[SubnetGroup] = js.undefined
}

object UpdateSubnetGroupResponse {
  @scala.inline
  def apply(SubnetGroup: SubnetGroup = null): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SubnetGroup != null) __obj.updateDynamic("SubnetGroup")(SubnetGroup)
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
}

