package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: String
  var many: js.UndefOr[Boolean] = js.undefined
}

object From {
  @scala.inline
  def apply(from: String, many: js.UndefOr[Boolean] = js.undefined): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

