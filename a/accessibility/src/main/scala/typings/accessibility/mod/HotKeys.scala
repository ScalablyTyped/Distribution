package typings.accessibility.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeys extends js.Object {
  /** @default false */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** @default true */
  var helpTitles: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[StringDictionary[HotKeyDefinition]] = js.undefined
}

object HotKeys {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    helpTitles: js.UndefOr[Boolean] = js.undefined,
    keys: StringDictionary[HotKeyDefinition] = null
  ): HotKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(helpTitles)) __obj.updateDynamic("helpTitles")(helpTitles.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotKeys]
  }
}

