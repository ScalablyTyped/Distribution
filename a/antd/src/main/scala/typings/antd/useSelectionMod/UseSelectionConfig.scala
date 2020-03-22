package typings.antd.useSelectionMod

import typings.antd.tableInterfaceMod.ExpandType
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.rcTable.interfaceMod.GetRowKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectionConfig[RecordType] extends js.Object {
  var childrenColumnName: String
  var data: js.Array[RecordType]
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandType: ExpandType
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
    expandIconColumnIndex: Int | Double = null,
    expandType: ExpandType = null
  ): UseSelectionConfig[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (expandType != null) __obj.updateDynamic("expandType")(expandType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectionConfig[RecordType]]
  }
}

