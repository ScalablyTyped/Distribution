package typings.antd.transferListMod

import typings.antd.anon.SelectedCount
import typings.antd.listBodyMod.TransferListBodyProps
import typings.antd.transferInterfaceMod.PaginationType
import typings.antd.transferMod.RenderResult
import typings.antd.transferMod.SelectAllLabel
import typings.antd.transferMod.TransferDirection
import typings.antd.transferMod.TransferLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactNode
import typings.react.mod.UIEvent
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferListProps[RecordType] extends TransferLocale {
  
  var checkedKeys: js.Array[String] = js.native
  
  var dataSource: js.Array[RecordType] = js.native
  
  var direction: TransferDirection = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ RecordType, Boolean]] = js.native
  
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps[RecordType], ReactNode]] = js.native
  
  def handleClear(): Unit = js.native
  
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.native
  
  def onItemSelect(key: String, check: Boolean): Unit = js.native
  
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit = js.native
  
  def onScroll(e: UIEvent[HTMLUListElement, NativeUIEvent]): Unit = js.native
  
  var pagination: js.UndefOr[PaginationType] = js.native
  
  var prefixCls: String = js.native
  
  /** render item */
  var render: js.UndefOr[js.Function1[/* item */ RecordType, RenderResult]] = js.native
  
  var renderList: js.UndefOr[RenderListFunction[RecordType]] = js.native
  
  var selectAllLabel: js.UndefOr[SelectAllLabel] = js.native
  
  var showRemove: js.UndefOr[Boolean] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var showSelectAll: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var titleText: String = js.native
}
object TransferListProps {
  
  @scala.inline
  def apply[RecordType](
    checkedKeys: js.Array[String],
    dataSource: js.Array[RecordType],
    direction: TransferDirection,
    handleClear: () => Unit,
    handleFilter: ChangeEvent[HTMLInputElement] => Unit,
    itemUnit: String,
    itemsUnit: String,
    onItemSelect: (String, Boolean) => Unit,
    onItemSelectAll: (js.Array[String], Boolean) => Unit,
    onScroll: UIEvent[HTMLUListElement, NativeUIEvent] => Unit,
    prefixCls: String,
    remove: String,
    removeAll: String,
    removeCurrent: String,
    searchPlaceholder: String,
    selectAll: String,
    selectCurrent: String,
    selectInvert: String,
    titleText: String,
    titles: js.Array[String]
  ): TransferListProps[RecordType] = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListProps[RecordType]]
  }
  
  @scala.inline
  implicit class TransferListPropsOps[Self <: TransferListProps[_], RecordType] (val x: Self with TransferListProps[RecordType]) extends AnyVal {
    
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
    def setCheckedKeysVarargs(value: String*): Self = this.set("checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def setCheckedKeys(value: js.Array[String]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceVarargs(value: RecordType*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[RecordType]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: TransferDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleClear(value: () => Unit): Self = this.set("handleClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleFilter(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("handleFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelect(value: (String, Boolean) => Unit): Self = this.set("onItemSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnItemSelectAll(value: (js.Array[String], Boolean) => Unit): Self = this.set("onItemSelectAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnScroll(value: UIEvent[HTMLUListElement, NativeUIEvent] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilterOption(value: (/* filterText */ String, /* item */ RecordType) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    
    @scala.inline
    def setFooter(value: /* props */ TransferListProps[RecordType] => ReactNode): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setOnItemRemove(value: /* keys */ js.Array[String] => Unit): Self = this.set("onItemRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemRemove: Self = this.set("onItemRemove", js.undefined)
    
    @scala.inline
    def setPagination(value: PaginationType): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setRender(value: /* item */ RecordType => RenderResult): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRenderList(value: /* props */ TransferListBodyProps[RecordType] => ReactNode): Self = this.set("renderList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderList: Self = this.set("renderList", js.undefined)
    
    @scala.inline
    def setSelectAllLabelFunction1(value: /* info */ SelectedCount => ReactNode): Self = this.set("selectAllLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAllLabel(value: SelectAllLabel): Self = this.set("selectAllLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllLabel: Self = this.set("selectAllLabel", js.undefined)
    
    @scala.inline
    def setShowRemove(value: Boolean): Self = this.set("showRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRemove: Self = this.set("showRemove", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    
    @scala.inline
    def setShowSelectAll(value: Boolean): Self = this.set("showSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectAll: Self = this.set("showSelectAll", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
