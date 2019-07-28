package typings.anydbDashSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: String
  var many: js.UndefOr[Boolean] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: String, many: js.UndefOr[Boolean] = js.undefined): Anon_From = {
    val __obj = js.Dynamic.literal(from = from)
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many)
    __obj.asInstanceOf[Anon_From]
  }
}

