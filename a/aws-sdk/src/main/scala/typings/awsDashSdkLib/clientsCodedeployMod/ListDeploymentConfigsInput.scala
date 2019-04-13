package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentConfigsInput extends js.Object {
  /**
    * An identifier returned from the previous ListDeploymentConfigs call. It can be used to return the next set of deployment configurations in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentConfigsInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListDeploymentConfigsInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentConfigsInput]
  }
}

