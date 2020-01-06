package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentStatusResult extends js.Object {
  /**
    * Any informational message about the status of the environment.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The status of the environment. Available values include:    connecting: The environment is connecting.    creating: The environment is being created.    deleting: The environment is being deleted.    error: The environment is in an error state.    ready: The environment is ready.    stopped: The environment is stopped.    stopping: The environment is stopping.  
    */
  var status: js.UndefOr[EnvironmentStatus] = js.native
}

object DescribeEnvironmentStatusResult {
  @scala.inline
  def apply(message: String = null, status: EnvironmentStatus = null): DescribeEnvironmentStatusResult = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentStatusResult]
  }
}

