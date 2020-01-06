package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceDefinitionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string = js.native
}

object DeleteResourceDefinitionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string): DeleteResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResourceDefinitionRequest]
  }
}

