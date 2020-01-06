package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentLifecycle extends js.Object {
  /**
    * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
    */
  var failureResource: js.UndefOr[String] = js.native
  /**
    * Any informational message about the lifecycle state of the environment.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The current creation or deletion lifecycle state of the environment.    CREATING: The environment is in the process of being created.    CREATED: The environment was successfully created.    CREATE_FAILED: The environment failed to be created.    DELETING: The environment is in the process of being deleted.    DELETE_FAILED: The environment failed to delete.  
    */
  var status: js.UndefOr[EnvironmentLifecycleStatus] = js.native
}

object EnvironmentLifecycle {
  @scala.inline
  def apply(failureResource: String = null, reason: String = null, status: EnvironmentLifecycleStatus = null): EnvironmentLifecycle = {
    val __obj = js.Dynamic.literal()
    if (failureResource != null) __obj.updateDynamic("failureResource")(failureResource.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentLifecycle]
  }
}

