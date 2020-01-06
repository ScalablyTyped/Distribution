package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaRequest extends js.Object {
  var Content: __stringMin1Max100000 = js.native
  /**
    * A description of the schema.
    */
  var Description: js.UndefOr[__stringMin0Max256] = js.native
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
  /**
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Tags] = js.native
  var Type: typings.awsDashSdk.clientsSchemasMod.Type = js.native
}

object CreateSchemaRequest {
  @scala.inline
  def apply(
    Content: __stringMin1Max100000,
    RegistryName: __string,
    SchemaName: __string,
    Type: Type,
    Description: __stringMin0Max256 = null,
    Tags: Tags = null
  ): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
}

