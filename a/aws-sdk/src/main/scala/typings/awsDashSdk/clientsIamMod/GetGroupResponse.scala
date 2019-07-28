package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResponse extends js.Object {
  /**
    * A structure that contains details about the group.
    */
  var Group: typings.awsDashSdk.clientsIamMod.Group
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  /**
    * A list of users in the group.
    */
  var Users: userListType
}

object GetGroupResponse {
  @scala.inline
  def apply(
    Group: Group,
    Users: userListType,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null
  ): GetGroupResponse = {
    val __obj = js.Dynamic.literal(Group = Group, Users = Users)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[GetGroupResponse]
  }
}

