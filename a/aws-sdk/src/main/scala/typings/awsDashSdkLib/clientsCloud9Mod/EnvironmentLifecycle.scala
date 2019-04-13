package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentLifecycle extends js.Object {
  /**
    * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
    */
  var failureResource: js.UndefOr[String] = js.undefined
  /**
    * Any informational message about the lifecycle state of the environment.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * The current creation or deletion lifecycle state of the environment.    CREATED: The environment was successfully created.    DELETE_FAILED: The environment failed to delete.    DELETING: The environment is in the process of being deleted.  
    */
  var status: js.UndefOr[EnvironmentLifecycleStatus] = js.undefined
}

object EnvironmentLifecycle {
  @scala.inline
  def apply(failureResource: String = null, reason: String = null, status: EnvironmentLifecycleStatus = null): EnvironmentLifecycle = {
    val __obj = js.Dynamic.literal()
    if (failureResource != null) __obj.updateDynamic("failureResource")(failureResource)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentLifecycle]
  }
}

