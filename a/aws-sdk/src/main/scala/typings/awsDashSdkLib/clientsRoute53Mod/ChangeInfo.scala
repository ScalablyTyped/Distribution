package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeInfo extends js.Object {
  /**
    * A complex type that describes change information about changes made to your hosted zone. This element contains an ID that you use when performing a GetChange action to get detailed information about the change.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * The ID of the request.
    */
  var Id: ResourceId
  /**
    * The current state of the request. PENDING indicates that this request has not yet been applied to all Amazon Route 53 DNS servers.
    */
  var Status: ChangeStatus
  /**
    * The date and time that the change request was submitted in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var SubmittedAt: TimeStamp
}

object ChangeInfo {
  @scala.inline
  def apply(Id: ResourceId, Status: ChangeStatus, SubmittedAt: TimeStamp, Comment: ResourceDescription = null): ChangeInfo = {
    val __obj = js.Dynamic.literal(Id = Id, Status = Status.asInstanceOf[js.Any], SubmittedAt = SubmittedAt)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[ChangeInfo]
  }
}

