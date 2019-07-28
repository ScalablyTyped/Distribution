package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterTaskDefinitionRequest extends js.Object {
  /**
    * The family and revision (family:revision) or full Amazon Resource Name (ARN) of the task definition to deregister. You must specify a revision.
    */
  var taskDefinition: String
}

object DeregisterTaskDefinitionRequest {
  @scala.inline
  def apply(taskDefinition: String): DeregisterTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition)
  
    __obj.asInstanceOf[DeregisterTaskDefinitionRequest]
  }
}

