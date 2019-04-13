package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
  /**
    * The ID of the resource definition version.
    */
  var ResourceDefinitionVersionId: __string
}

object GetResourceDefinitionVersionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string, ResourceDefinitionVersionId: __string): GetResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId, ResourceDefinitionVersionId = ResourceDefinitionVersionId)
  
    __obj.asInstanceOf[GetResourceDefinitionVersionRequest]
  }
}

