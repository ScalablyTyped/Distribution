package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInfo[T] extends js.Object {
  var changeRowKeys: js.UndefOr[js.Array[reactLib.reactMod.Key]] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var nativeEvent: js.UndefOr[stdLib.Event] = js.undefined
  var record: js.UndefOr[T] = js.undefined
  var selectWay: TableSelectWay
}

object SelectionInfo {
  @scala.inline
  def apply[T](
    selectWay: TableSelectWay,
    changeRowKeys: js.Array[reactLib.reactMod.Key] = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    nativeEvent: stdLib.Event = null,
    record: T = null
  ): SelectionInfo[T] = {
    val __obj = js.Dynamic.literal(selectWay = selectWay)
    if (changeRowKeys != null) __obj.updateDynamic("changeRowKeys")(changeRowKeys)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent)
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionInfo[T]]
  }
}

