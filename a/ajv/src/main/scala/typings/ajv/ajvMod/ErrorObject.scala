package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObject extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var dataPath: String
  var keyword: String
  // Excluded if messages set to false.
  var message: js.UndefOr[String] = js.undefined
  var params: ErrorParameters
  var parentSchema: js.UndefOr[js.Object] = js.undefined
  // Added to validation errors of propertyNames keyword schema
  var propertyName: js.UndefOr[String] = js.undefined
  // These are added with the `verbose` option.
  var schema: js.UndefOr[js.Any] = js.undefined
  var schemaPath: String
}

object ErrorObject {
  @scala.inline
  def apply(
    dataPath: String,
    keyword: String,
    params: ErrorParameters,
    schemaPath: String,
    data: js.Any = null,
    message: String = null,
    parentSchema: js.Object = null,
    propertyName: String = null,
    schema: js.Any = null
  ): ErrorObject = {
    val __obj = js.Dynamic.literal(dataPath = dataPath, keyword = keyword, params = params, schemaPath = schemaPath)
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parentSchema != null) __obj.updateDynamic("parentSchema")(parentSchema)
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ErrorObject]
  }
}

