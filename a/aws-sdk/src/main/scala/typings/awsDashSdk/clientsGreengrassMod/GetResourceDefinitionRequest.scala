package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceDefinitionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
}

object GetResourceDefinitionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string): GetResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId)
  
    __obj.asInstanceOf[GetResourceDefinitionRequest]
  }
}

