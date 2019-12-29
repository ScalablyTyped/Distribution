package typings.atAntDashDesignProDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.react.reactMod.Dispatch
import typings.react.reactMod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String]
  var flatMenus: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]]
  var setFlatMenus: Dispatch[SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]]]
}

object Anon_FlatMenuKeys {
  @scala.inline
  def apply(
    flatMenuKeys: js.Array[String],
    setFlatMenuKeys: SetStateAction[js.Array[String]] => Unit,
    setFlatMenus: SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]] => Unit,
    flatMenus: StringDictionary[MenuDataItem] = null
  ): Anon_FlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1(setFlatMenuKeys), setFlatMenus = js.Any.fromFunction1(setFlatMenus))
    if (flatMenus != null) __obj.updateDynamic("flatMenus")(flatMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlatMenuKeys]
  }
}

