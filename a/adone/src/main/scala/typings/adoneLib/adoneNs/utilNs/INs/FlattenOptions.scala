package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var depth: js.UndefOr[scala.Double] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(depth: scala.Int | scala.Double = null): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenOptions]
  }
}

