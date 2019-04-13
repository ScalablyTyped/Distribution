package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentInstancesOutput extends js.Object {
  /**
    * A list of instance IDs.
    */
  var instancesList: js.UndefOr[InstancesList] = js.undefined
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment instances call to return the next set of deployment instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentInstancesOutput {
  @scala.inline
  def apply(instancesList: InstancesList = null, nextToken: NextToken = null): ListDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (instancesList != null) __obj.updateDynamic("instancesList")(instancesList)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentInstancesOutput]
  }
}

