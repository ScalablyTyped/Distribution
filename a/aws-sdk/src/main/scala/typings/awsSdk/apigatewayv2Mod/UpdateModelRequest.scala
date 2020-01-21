package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateModelRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.native
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The model ID.
    */
  var ModelId: string = js.native
  /**
    * The name of the model.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.native
}

object UpdateModelRequest {
  @scala.inline
  def apply(
    ApiId: string,
    ModelId: string,
    ContentType: StringWithLengthBetween1And256 = null,
    Description: StringWithLengthBetween0And1024 = null,
    Name: StringWithLengthBetween1And128 = null,
    Schema: StringWithLengthBetween0And32K = null
  ): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelRequest]
  }
}

