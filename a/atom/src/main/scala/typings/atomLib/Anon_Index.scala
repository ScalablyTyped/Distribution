package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, pending: js.UndefOr[scala.Boolean] = js.undefined): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[Anon_Index]
  }
}

