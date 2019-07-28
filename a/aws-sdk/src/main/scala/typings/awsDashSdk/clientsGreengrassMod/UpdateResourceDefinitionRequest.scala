package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceDefinitionRequest extends js.Object {
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
}

object UpdateResourceDefinitionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string, Name: __string = null): UpdateResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateResourceDefinitionRequest]
  }
}

