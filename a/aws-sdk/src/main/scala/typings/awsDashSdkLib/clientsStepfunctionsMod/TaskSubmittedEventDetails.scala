package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskSubmittedEventDetails extends js.Object {
  /**
    * The response from a resource when a task has started.
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

object TaskSubmittedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name, output: SensitiveData = null): TaskSubmittedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource, resourceType = resourceType)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[TaskSubmittedEventDetails]
  }
}

