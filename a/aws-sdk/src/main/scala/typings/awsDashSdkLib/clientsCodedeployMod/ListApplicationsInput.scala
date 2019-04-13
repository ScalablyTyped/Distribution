package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsInput extends js.Object {
  /**
    * An identifier returned from the previous list applications call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListApplicationsInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListApplicationsInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListApplicationsInput]
  }
}

