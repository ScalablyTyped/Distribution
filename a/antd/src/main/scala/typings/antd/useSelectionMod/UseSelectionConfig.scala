package typings.antd.useSelectionMod

import typings.antd.tableInterfaceMod.ExpandType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.rcTable.interfaceMod.GetRowKey
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectionConfig[RecordType] extends js.Object {
  var childrenColumnName: String
  var data: js.Array[RecordType]
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandType: ExpandType
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var getRowKey: GetRowKey[RecordType]
  var locale: TableLocale
  var pageData: js.Array[RecordType]
  var prefixCls: String
  def getRecordByKey(key: Key): RecordType
}

object UseSelectionConfig {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    getRecordByKey: Key => RecordType,
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.interfaceMod.Key,
    locale: TableLocale,
    pageData: js.Array[RecordType],
    prefixCls: String,
    expandIconColumnIndex: js.UndefOr[Double] = js.undefined,
    expandType: ExpandType = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null
  ): UseSelectionConfig[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], expandType = expandType.asInstanceOf[js.Any])
    if (!js.isUndefined(expandIconColumnIndex)) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.get.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[UseSelectionConfig[RecordType]]
  }
}

