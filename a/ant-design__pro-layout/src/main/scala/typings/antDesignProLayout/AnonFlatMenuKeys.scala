package typings.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String]
  var flatMenus: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]]
  var setFlatMenus: Dispatch[SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]]]
}

object AnonFlatMenuKeys {
  @scala.inline
  def apply(
    flatMenuKeys: js.Array[String],
    setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit,
    setFlatMenus: SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]] => Unit,
    flatMenus: StringDictionary[MenuDataItem] = null
  ): AnonFlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys), setFlatMenus = js.Any.fromFunction1(setFlatMenus))
    if (flatMenus != null) __obj.updateDynamic("flatMenus")(flatMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlatMenuKeys]
  }
}

