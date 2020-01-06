package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListParentsResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.NextToken] = js.native
  /**
    * A list of parents for the specified child account or OU.
    */
  var Parents: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Parents] = js.native
}

object ListParentsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Parents: Parents = null): ListParentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListParentsResponse]
  }
}

