package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterContainerInstanceResponse extends js.Object {
  /**
    * The container instance that was registered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}

object RegisterContainerInstanceResponse {
  @scala.inline
  def apply(containerInstance: ContainerInstance = null): RegisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterContainerInstanceResponse]
  }
}

