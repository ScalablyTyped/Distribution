package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var Name: GroupName
  /**
    * The organization under which the group is to be created.
    */
  var OrganizationId: awsDashSdkLib.clientsWorkmailMod.OrganizationId
}

object CreateGroupRequest {
  @scala.inline
  def apply(Name: GroupName, OrganizationId: OrganizationId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name, OrganizationId = OrganizationId)
  
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

