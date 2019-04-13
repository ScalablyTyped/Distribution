package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractOpenOptions extends AbstractOptions {
  var createIfMissing: js.UndefOr[scala.Boolean] = js.undefined
  var errorIfExists: js.UndefOr[scala.Boolean] = js.undefined
}

object AbstractOpenOptions {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    createIfMissing: js.UndefOr[scala.Boolean] = js.undefined,
    errorIfExists: js.UndefOr[scala.Boolean] = js.undefined
  ): AbstractOpenOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(createIfMissing)) __obj.updateDynamic("createIfMissing")(createIfMissing)
    if (!js.isUndefined(errorIfExists)) __obj.updateDynamic("errorIfExists")(errorIfExists)
    __obj.asInstanceOf[AbstractOpenOptions]
  }
}

