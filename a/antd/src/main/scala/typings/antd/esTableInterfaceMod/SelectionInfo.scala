package typings.antd.esTableInterfaceMod

import typings.react.reactMod.Key
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInfo[T] extends js.Object {
  var changeRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var nativeEvent: js.UndefOr[Event] = js.undefined
  var record: js.UndefOr[T] = js.undefined
  var selectWay: TableSelectWay
}

object SelectionInfo {
  @scala.inline
  def apply[T](
    selectWay: TableSelectWay,
    changeRowKeys: js.Array[Key] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    nativeEvent: Event = null,
    record: T = null
  ): SelectionInfo[T] = {
    val __obj = js.Dynamic.literal(selectWay = selectWay.asInstanceOf[js.Any])
    if (changeRowKeys != null) __obj.updateDynamic("changeRowKeys")(changeRowKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionInfo[T]]
  }
}

