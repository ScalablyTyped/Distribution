package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModelRequest extends js.Object {
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
    * The name of the model. Must be alphanumeric.
    */
  var Name: StringWithLengthBetween1And128
  /**
    * The schema for the model. For application/json models, this should be JSON schema
    draft 4 model.
    */
  var Schema: StringWithLengthBetween0And32K
}

object CreateModelRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    Name: StringWithLengthBetween1And128,
    Schema: StringWithLengthBetween0And32K,
    ContentType: StringWithLengthBetween1And256 = null,
    Description: StringWithLengthBetween0And1024 = null
  ): CreateModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, Name = Name, Schema = Schema)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateModelRequest]
  }
}

