package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in to delete.
    */
  var cluster: String
  /**
    * If true, this allows you to delete a task set even if it hasn't been scaled down to zero.
    */
  var force: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that hosts the task set to delete.
    */
  var service: String
  /**
    * The task set ID or full Amazon Resource Name (ARN) of the task set to delete.
    */
  var taskSet: String
}

object DeleteTaskSetRequest {
  @scala.inline
  def apply(cluster: String, service: String, taskSet: String, force: js.UndefOr[scala.Boolean] = js.undefined): DeleteTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster, service = service, taskSet = taskSet)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DeleteTaskSetRequest]
  }
}

