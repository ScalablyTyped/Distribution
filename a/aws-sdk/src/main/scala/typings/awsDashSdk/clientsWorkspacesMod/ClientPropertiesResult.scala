package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPropertiesResult extends js.Object {
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.ClientProperties] = js.undefined
  /**
    * The resource identifier, in the form of a directory ID.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
}

object ClientPropertiesResult {
  @scala.inline
  def apply(ClientProperties: ClientProperties = null, ResourceId: NonEmptyString = null): ClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    if (ClientProperties != null) __obj.updateDynamic("ClientProperties")(ClientProperties)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[ClientPropertiesResult]
  }
}

