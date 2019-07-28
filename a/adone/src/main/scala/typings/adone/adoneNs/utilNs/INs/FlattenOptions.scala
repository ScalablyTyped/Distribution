package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var depth: js.UndefOr[Double] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(depth: Int | Double = null): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenOptions]
  }
}

