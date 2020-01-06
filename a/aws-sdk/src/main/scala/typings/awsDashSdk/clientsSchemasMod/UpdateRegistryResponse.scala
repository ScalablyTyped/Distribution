package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRegistryResponse extends js.Object {
  /**
    * The description of the registry.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[__string] = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[__string] = js.native
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Tags] = js.native
}

object UpdateRegistryResponse {
  @scala.inline
  def apply(
    Description: __string = null,
    RegistryArn: __string = null,
    RegistryName: __string = null,
    Tags: Tags = null
  ): UpdateRegistryResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (RegistryArn != null) __obj.updateDynamic("RegistryArn")(RegistryArn.asInstanceOf[js.Any])
    if (RegistryName != null) __obj.updateDynamic("RegistryName")(RegistryName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistryResponse]
  }
}

