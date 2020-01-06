package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegistryRequest extends js.Object {
  /**
    * A description of the registry to be created.
    */
  var Description: js.UndefOr[__stringMin0Max256] = js.native
  var RegistryName: __string = js.native
  /**
    * Tags to associate with the registry.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Tags] = js.native
}

object CreateRegistryRequest {
  @scala.inline
  def apply(RegistryName: __string, Description: __stringMin0Max256 = null, Tags: Tags = null): CreateRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegistryRequest]
  }
}

