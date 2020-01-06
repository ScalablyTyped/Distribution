package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string = js.native
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[__listOfResource] = js.native
}

object CreateResourceDefinitionVersionRequest {
  @scala.inline
  def apply(
    ResourceDefinitionId: __string,
    AmznClientToken: __string = null,
    Resources: __listOfResource = null
  ): CreateResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDefinitionVersionRequest]
  }
}

