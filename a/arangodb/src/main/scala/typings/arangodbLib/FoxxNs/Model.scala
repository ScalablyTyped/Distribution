package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var fromClient: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var schema: Schema
}

object Model {
  @scala.inline
  def apply(
    schema: Schema,
    forClient: js.Function1[/* value */ js.Any, _] = null,
    fromClient: js.Function1[/* value */ js.Any, _] = null
  ): Model = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (forClient != null) __obj.updateDynamic("forClient")(forClient)
    if (fromClient != null) __obj.updateDynamic("fromClient")(fromClient)
    __obj.asInstanceOf[Model]
  }
}

