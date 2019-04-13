package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractGetOptions extends AbstractOptions {
  var asBuffer: js.UndefOr[scala.Boolean] = js.undefined
}

object AbstractGetOptions {
  @scala.inline
  def apply(
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    asBuffer: js.UndefOr[scala.Boolean] = js.undefined
  ): AbstractGetOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer)
    __obj.asInstanceOf[AbstractGetOptions]
  }
}

