package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterContainerInstanceResponse extends js.Object {
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.undefined
}

object DeregisterContainerInstanceResponse {
  @scala.inline
  def apply(containerInstance: ContainerInstance = null): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance)
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
}

