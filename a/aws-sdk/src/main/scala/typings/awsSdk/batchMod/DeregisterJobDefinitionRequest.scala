package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterJobDefinitionRequest extends js.Object {
  /**
    * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister.
    */
  var jobDefinition: String = js.native
}

object DeregisterJobDefinitionRequest {
  @scala.inline
  def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterJobDefinitionRequest]
  }
}

