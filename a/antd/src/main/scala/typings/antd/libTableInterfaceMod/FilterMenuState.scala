package typings.antd.libTableInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuState[T] extends js.Object {
  var keyPathOfSelectedItem: StringDictionary[js.Array[Key]]
  var prevProps: FilterMenuProps[T]
  var selectedKeys: js.Array[Key]
  var valueKeys: StringDictionary[String]
  var visible: js.UndefOr[Boolean] = js.undefined
}

object FilterMenuState {
  @scala.inline
  def apply[T](
    keyPathOfSelectedItem: StringDictionary[js.Array[Key]],
    prevProps: FilterMenuProps[T],
    selectedKeys: js.Array[Key],
    valueKeys: StringDictionary[String],
    visible: js.UndefOr[Boolean] = js.undefined
  ): FilterMenuState[T] = {
    val __obj = js.Dynamic.literal(keyPathOfSelectedItem = keyPathOfSelectedItem, prevProps = prevProps, selectedKeys = selectedKeys, valueKeys = valueKeys)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[FilterMenuState[T]]
  }
}

