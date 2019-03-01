package typings
package adoneLib.adoneNs.dataNs.bsonNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeOptions extends js.Object {
  /**
    * Whether to check if keys are valid. Default: false
    */
  var checkKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to ignore undefined values. Default: true
    */
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to serialize javascript functions. Default: false
    */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

object SerializeOptions {
  @scala.inline
  def apply(
    checkKeys: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
  ): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkKeys)) __obj.updateDynamic("checkKeys")(checkKeys)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    __obj.asInstanceOf[SerializeOptions]
  }
}

