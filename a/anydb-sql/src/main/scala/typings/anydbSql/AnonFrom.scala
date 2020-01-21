package typings.anydbSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: String
  var many: js.UndefOr[Boolean] = js.undefined
}

object AnonFrom {
  @scala.inline
  def apply(from: String, many: js.UndefOr[Boolean] = js.undefined): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

