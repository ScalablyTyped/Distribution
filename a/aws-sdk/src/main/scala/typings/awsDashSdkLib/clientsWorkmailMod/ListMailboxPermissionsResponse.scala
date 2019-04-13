package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMailboxPermissionsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * One page of the user, group, or resource mailbox permissions.
    */
  var Permissions: js.UndefOr[Permissions] = js.undefined
}

object ListMailboxPermissionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Permissions: Permissions = null): ListMailboxPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    __obj.asInstanceOf[ListMailboxPermissionsResponse]
  }
}

