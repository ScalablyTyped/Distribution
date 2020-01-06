package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceDefinitionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string = js.native
}

object GetResourceDefinitionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string): GetResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResourceDefinitionRequest]
  }
}

