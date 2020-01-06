package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceLinkedRoleResponse extends js.Object {
  /**
    * The deletion task identifier that you can use to check the status of the deletion. This identifier is returned in the format task/aws-service-role/&lt;service-principal-name&gt;/&lt;role-name&gt;/&lt;task-uuid&gt;.
    */
  var DeletionTaskId: DeletionTaskIdType = js.native
}

object DeleteServiceLinkedRoleResponse {
  @scala.inline
  def apply(DeletionTaskId: DeletionTaskIdType): DeleteServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal(DeletionTaskId = DeletionTaskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteServiceLinkedRoleResponse]
  }
}

