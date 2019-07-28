package typings.abstractDashLeveldown.abstractDashLeveldownMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractGetOptions extends AbstractOptions {
  var asBuffer: js.UndefOr[Boolean] = js.undefined
}

object AbstractGetOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, asBuffer: js.UndefOr[Boolean] = js.undefined): AbstractGetOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer)
    __obj.asInstanceOf[AbstractGetOptions]
  }
}

