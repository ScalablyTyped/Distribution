package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMitigationActionsResponse extends js.Object {
  /**
    * A set of actions that matched the specified filter criteria.
    */
  var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListMitigationActionsResponse {
  @scala.inline
  def apply(actionIdentifiers: MitigationActionIdentifierList = null, nextToken: NextToken = null): ListMitigationActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (actionIdentifiers != null) __obj.updateDynamic("actionIdentifiers")(actionIdentifiers.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMitigationActionsResponse]
  }
}

