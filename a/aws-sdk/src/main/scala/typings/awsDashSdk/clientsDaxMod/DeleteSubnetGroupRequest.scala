package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubnetGroupRequest extends js.Object {
  /**
    * The name of the subnet group to delete.
    */
  var SubnetGroupName: String
}

object DeleteSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String): DeleteSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName)
  
    __obj.asInstanceOf[DeleteSubnetGroupRequest]
  }
}

