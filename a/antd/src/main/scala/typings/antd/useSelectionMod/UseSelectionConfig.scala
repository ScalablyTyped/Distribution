package typings.antd.useSelectionMod

import typings.antd.tableInterfaceMod.ExpandType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.rcTable.interfaceMod.GetRowKey
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectionConfig[RecordType] extends js.Object {
  var childrenColumnName: String = js.native
  var data: js.Array[RecordType] = js.native
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  var expandType: ExpandType = js.native
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var locale: TableLocale = js.native
  var pageData: js.Array[RecordType] = js.native
  var prefixCls: String = js.native
  def getRecordByKey(key: Key): RecordType = js.native
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
    prefixCls: String
  ): UseSelectionConfig[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectionConfig[RecordType]]
  }
  @scala.inline
  implicit class UseSelectionConfigOps[Self <: UseSelectionConfig[_], RecordType] (val x: Self with UseSelectionConfig[RecordType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenColumnName(value: String): Self = this.set("childrenColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: RecordType*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[RecordType]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRecordByKey(value: Key => RecordType): Self = this.set("getRecordByKey", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.interfaceMod.Key): Self = this.set("getRowKey", js.Any.fromFunction2(value))
    @scala.inline
    def setLocale(value: TableLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDataVarargs(value: RecordType*): Self = this.set("pageData", js.Array(value :_*))
    @scala.inline
    def setPageData(value: js.Array[RecordType]): Self = this.set("pageData", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = this.set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIconColumnIndex: Self = this.set("expandIconColumnIndex", js.undefined)
    @scala.inline
    def setExpandType(value: ExpandType): Self = this.set("expandType", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandTypeNull: Self = this.set("expandType", null)
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
  }
  
}

