package typings.antd.esCascaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderOptionType
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[CascaderOptionType]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CascaderOptionType {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: js.Array[CascaderOptionType] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): CascaderOptionType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CascaderOptionType]
  }
}

