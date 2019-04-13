package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentManagedActionsRequest extends js.Object {
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.undefined
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.undefined
  /**
    * To show only actions with a particular status, specify a status.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
}

object DescribeEnvironmentManagedActionsRequest {
  @scala.inline
  def apply(EnvironmentId: String = null, EnvironmentName: String = null, Status: ActionStatus = null): DescribeEnvironmentManagedActionsRequest = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsRequest]
  }
}

