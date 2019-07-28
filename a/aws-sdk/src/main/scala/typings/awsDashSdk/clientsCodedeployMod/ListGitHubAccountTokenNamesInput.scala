package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGitHubAccountTokenNamesInput extends js.Object {
  /**
    * An identifier returned from the previous ListGitHubAccountTokenNames call. It can be used to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListGitHubAccountTokenNamesInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListGitHubAccountTokenNamesInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListGitHubAccountTokenNamesInput]
  }
}

