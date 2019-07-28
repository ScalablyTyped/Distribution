package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceDefinitionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * Information about the initial version of the resource definition.
    */
  var InitialVersion: js.UndefOr[ResourceDefinitionVersion] = js.undefined
  /**
    * The name of the resource definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateResourceDefinitionRequest {
  @scala.inline
  def apply(
    AmznClientToken: __string = null,
    InitialVersion: ResourceDefinitionVersion = null,
    Name: __string = null,
    tags: Tags = null
  ): CreateResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (InitialVersion != null) __obj.updateDynamic("InitialVersion")(InitialVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateResourceDefinitionRequest]
  }
}

