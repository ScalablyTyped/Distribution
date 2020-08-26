package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaValidateFunction extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorObject]] = js.native
  def apply(
    schema: js.Any,
    data: js.Any,
    parentSchema: js.UndefOr[js.Object],
    dataPath: js.UndefOr[String],
    parentData: js.UndefOr[js.Object | js.Array[_]],
    parentDataProperty: js.UndefOr[String | Double],
    rootData: js.UndefOr[js.Object | js.Array[_]]
  ): Boolean | js.Thenable[_] = js.native
}

