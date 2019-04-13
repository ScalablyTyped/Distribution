package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterJobDefinitionRequest extends js.Object {
  /**
    * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister. 
    */
  var jobDefinition: String
}

object DeregisterJobDefinitionRequest {
  @scala.inline
  def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition)
  
    __obj.asInstanceOf[DeregisterJobDefinitionRequest]
  }
}

