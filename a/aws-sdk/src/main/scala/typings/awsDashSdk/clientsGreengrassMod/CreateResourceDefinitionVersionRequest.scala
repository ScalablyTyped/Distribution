package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[__listOfResource] = js.undefined
}

object CreateResourceDefinitionVersionRequest {
  @scala.inline
  def apply(
    ResourceDefinitionId: __string,
    AmznClientToken: __string = null,
    Resources: __listOfResource = null
  ): CreateResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    __obj.asInstanceOf[CreateResourceDefinitionVersionRequest]
  }
}

