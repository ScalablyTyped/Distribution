package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateModelRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The model ID.
    */
  var ModelId: __string
  /**
    * The name of the model.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * The schema for the model. For application/json models, this should be JSON schema
    draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
}

object UpdateModelRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    ModelId: __string,
    ContentType: StringWithLengthBetween1And256 = null,
    Description: StringWithLengthBetween0And1024 = null,
    Name: StringWithLengthBetween1And128 = null,
    Schema: StringWithLengthBetween0And32K = null
  ): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, ModelId = ModelId)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    __obj.asInstanceOf[UpdateModelRequest]
  }
}

