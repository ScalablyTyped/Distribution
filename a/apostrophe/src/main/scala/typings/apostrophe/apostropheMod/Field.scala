package typings.apostrophe.apostropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var choices: js.UndefOr[js.Array[SelectChoice]] = js.undefined
  var help: js.UndefOr[String] = js.undefined
  var label: String
  var name: String
  var options: js.UndefOr[AposObject] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[js.Array[Field]] = js.undefined
  var titleField: js.UndefOr[String] = js.undefined
  var `type`: String
  var widgetType: js.UndefOr[String] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    label: String,
    name: String,
    `type`: String,
    choices: js.Array[SelectChoice] = null,
    help: String = null,
    options: AposObject = null,
    required: js.UndefOr[Boolean] = js.undefined,
    schema: js.Array[Field] = null,
    titleField: String = null,
    widgetType: String = null
  ): Field = {
    val __obj = js.Dynamic.literal(label = label, name = name)
    __obj.updateDynamic("type")(`type`)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (help != null) __obj.updateDynamic("help")(help)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (titleField != null) __obj.updateDynamic("titleField")(titleField)
    if (widgetType != null) __obj.updateDynamic("widgetType")(widgetType)
    __obj.asInstanceOf[Field]
  }
}

