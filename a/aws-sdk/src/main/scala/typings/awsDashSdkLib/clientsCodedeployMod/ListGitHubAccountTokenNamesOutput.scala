package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGitHubAccountTokenNamesOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent ListGitHubAccountTokenNames call to return the next set of names in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of names of connections to GitHub accounts.
    */
  var tokenNameList: js.UndefOr[GitHubAccountTokenNameList] = js.undefined
}

object ListGitHubAccountTokenNamesOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, tokenNameList: GitHubAccountTokenNameList = null): ListGitHubAccountTokenNamesOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (tokenNameList != null) __obj.updateDynamic("tokenNameList")(tokenNameList)
    __obj.asInstanceOf[ListGitHubAccountTokenNamesOutput]
  }
}

