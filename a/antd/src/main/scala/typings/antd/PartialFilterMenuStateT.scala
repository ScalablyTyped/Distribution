package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.libTableInterfaceMod.FilterMenuProps
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/table/interface.FilterMenuState<T>> */
trait PartialFilterMenuStateT[T] extends js.Object {
  var keyPathOfSelectedItem: js.UndefOr[StringDictionary[js.Array[Key]]] = js.undefined
  var prevProps: js.UndefOr[FilterMenuProps[T]] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var valueKeys: js.UndefOr[StringDictionary[String]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialFilterMenuStateT {
  @scala.inline
  def apply[T](
    keyPathOfSelectedItem: StringDictionary[js.Array[Key]] = null,
    prevProps: FilterMenuProps[T] = null,
    selectedKeys: js.Array[Key] = null,
    valueKeys: StringDictionary[String] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialFilterMenuStateT[T] = {
    val __obj = js.Dynamic.literal()
    if (keyPathOfSelectedItem != null) __obj.updateDynamic("keyPathOfSelectedItem")(keyPathOfSelectedItem.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (valueKeys != null) __obj.updateDynamic("valueKeys")(valueKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFilterMenuStateT[T]]
  }
}

