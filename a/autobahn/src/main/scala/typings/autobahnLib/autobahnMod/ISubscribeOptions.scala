package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscribeOptions extends js.Object {
  var get_retained: js.UndefOr[scala.Boolean] = js.undefined
  var `match`: js.UndefOr[java.lang.String] = js.undefined
}

object ISubscribeOptions {
  @scala.inline
  def apply(get_retained: js.UndefOr[scala.Boolean] = js.undefined, `match`: java.lang.String = null): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(get_retained)) __obj.updateDynamic("get_retained")(get_retained)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[ISubscribeOptions]
  }
}

