package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSchemaRequest extends js.Object {
  /**
    * The ID of the client token.
    */
  var ClientTokenId: js.UndefOr[__stringMin0Max36] = js.native
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[__stringMin1Max100000] = js.native
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[__stringMin0Max256] = js.native
  var RegistryName: __string = js.native
  var SchemaName: __string = js.native
  /**
    * The schema type for the events schema.
    */
  var Type: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Type] = js.native
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(
    RegistryName: __string,
    SchemaName: __string,
    ClientTokenId: __stringMin0Max36 = null,
    Content: __stringMin1Max100000 = null,
    Description: __stringMin0Max256 = null,
    Type: Type = null
  ): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (ClientTokenId != null) __obj.updateDynamic("ClientTokenId")(ClientTokenId.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
}

