package typings.antd.tableInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Key
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
    val __obj = js.Dynamic.literal(keyPathOfSelectedItem = keyPathOfSelectedItem.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], valueKeys = valueKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterMenuState[T]]
  }
}

