package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreUndefined extends js.Object {
  /**
    * Whether to ignore undefined values. Default: true
    */
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to serialize javascript functions. Default: false
    */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnoreUndefined {
  @scala.inline
  def apply(
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IgnoreUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    __obj.asInstanceOf[Anon_IgnoreUndefined]
  }
}

