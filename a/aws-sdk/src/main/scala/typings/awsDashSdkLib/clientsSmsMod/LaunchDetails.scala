package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchDetails extends js.Object {
  /**
    * Latest time this application was launched successfully.
    */
  var latestLaunchTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Identifier of the latest stack launched for this application.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
  /**
    * Name of the latest stack launched for this application.
    */
  var stackName: js.UndefOr[StackName] = js.undefined
}

object LaunchDetails {
  @scala.inline
  def apply(latestLaunchTime: Timestamp = null, stackId: StackId = null, stackName: StackName = null): LaunchDetails = {
    val __obj = js.Dynamic.literal()
    if (latestLaunchTime != null) __obj.updateDynamic("latestLaunchTime")(latestLaunchTime)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId)
    if (stackName != null) __obj.updateDynamic("stackName")(stackName)
    __obj.asInstanceOf[LaunchDetails]
  }
}

