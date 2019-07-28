package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSucceededEventDetails extends js.Object {
  /**
    * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related task.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
}

object TaskSucceededEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name, output: SensitiveData = null): TaskSucceededEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource, resourceType = resourceType)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[TaskSucceededEventDetails]
  }
}

