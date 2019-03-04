package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: java.lang.String
  var many: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_From {
  @scala.inline
  def apply(from: java.lang.String, many: js.UndefOr[scala.Boolean] = js.undefined): Anon_From = {
    val __obj = js.Dynamic.literal(from = from)
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many)
    __obj.asInstanceOf[Anon_From]
  }
}

