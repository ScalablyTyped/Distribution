package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRootsResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.NextToken] = js.undefined
  /**
    * A list of roots that are defined in an organization.
    */
  var Roots: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Roots] = js.undefined
}

object ListRootsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Roots: Roots = null): ListRootsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Roots != null) __obj.updateDynamic("Roots")(Roots)
    __obj.asInstanceOf[ListRootsResponse]
  }
}

