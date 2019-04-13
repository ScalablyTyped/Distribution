package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStartedEventDetails extends js.Object {
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
}

object TaskStartedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskStartedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource, resourceType = resourceType)
  
    __obj.asInstanceOf[TaskStartedEventDetails]
  }
}

