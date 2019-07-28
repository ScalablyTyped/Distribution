package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The model identifier.
    */
  var ModelId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the model. Must be alphanumeric.
    */
  var Name: StringWithLengthBetween1And128
  /**
    * The schema for the model. For application/json models, this should be JSON schema
    draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    Name: StringWithLengthBetween1And128,
    ContentType: StringWithLengthBetween1And256 = null,
    Description: StringWithLengthBetween0And1024 = null,
    ModelId: Id = null,
    Schema: StringWithLengthBetween0And32K = null
  ): Model = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ModelId != null) __obj.updateDynamic("ModelId")(ModelId)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    __obj.asInstanceOf[Model]
  }
}

