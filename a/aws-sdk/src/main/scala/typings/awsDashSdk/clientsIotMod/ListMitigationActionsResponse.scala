package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMitigationActionsResponse extends js.Object {
  /**
    * A set of actions that matched the specified filter criteria.
    */
  var actionIdentifiers: js.UndefOr[MitigationActionIdentifierList] = js.undefined
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListMitigationActionsResponse {
  @scala.inline
  def apply(actionIdentifiers: MitigationActionIdentifierList = null, nextToken: NextToken = null): ListMitigationActionsResponse = {
    val __obj = js.Dynamic.literal()
    if (actionIdentifiers != null) __obj.updateDynamic("actionIdentifiers")(actionIdentifiers)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListMitigationActionsResponse]
  }
}

