package typings.abstractDashLeveldown.abstractDashLeveldownMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractOpenOptions extends AbstractOptions {
  var createIfMissing: js.UndefOr[Boolean] = js.undefined
  var errorIfExists: js.UndefOr[Boolean] = js.undefined
}

object AbstractOpenOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    createIfMissing: js.UndefOr[Boolean] = js.undefined,
    errorIfExists: js.UndefOr[Boolean] = js.undefined
  ): AbstractOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(createIfMissing)) __obj.updateDynamic("createIfMissing")(createIfMissing.asInstanceOf[js.Any])
    if (!js.isUndefined(errorIfExists)) __obj.updateDynamic("errorIfExists")(errorIfExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractOpenOptions]
  }
}

