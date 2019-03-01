package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexNotOptions extends js.Object {
  var contains: js.UndefOr[scala.Boolean] = js.undefined
}

object RegexNotOptions {
  @scala.inline
  def apply(contains: js.UndefOr[scala.Boolean] = js.undefined): RegexNotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains)
    __obj.asInstanceOf[RegexNotOptions]
  }
}

