package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentGroupsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * An identifier returned from the previous list deployment groups call. It can be used to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDeploymentGroupsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, nextToken: NextToken = null): ListDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDeploymentGroupsInput]
  }
}

