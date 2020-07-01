package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackendEnvironmentsResult extends js.Object {
  /**
    *  The list of backend environments for an Amplify app. 
    */
  var backendEnvironments: BackendEnvironments = js.native
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBackendEnvironmentsResult {
  @scala.inline
  def apply(backendEnvironments: BackendEnvironments, nextToken: NextToken = null): ListBackendEnvironmentsResult = {
    val __obj = js.Dynamic.literal(backendEnvironments = backendEnvironments.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsResult]
  }
}

