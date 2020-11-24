package typings.antd.transferListMod

import typings.antd.anon.BodyContent
import typings.antd.anon.FilteredItems
import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.all
import typings.antd.antdStrings.none
import typings.antd.antdStrings.part
import typings.antd.listBodyMod.TransferListBodyProps
import typings.antd.transferMod.KeyWiseTransferItem
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferList[RecordType /* <: KeyWiseTransferItem */]
  extends Component[TransferListProps[RecordType], TransferListState, js.Any] {
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): Unit = js.native
  
  var defaultListBodyRef: RefObject[typings.antd.listBodyMod.default[RecordType]] = js.native
  
  def getCheckBox(
    filteredItems: js.Array[RecordType],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit]
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[RecordType],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[RecordType],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[RecordType],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean,
    disabled: Boolean
  ): `false` | Element = js.native
  
  def getCheckStatus(filteredItems: js.Array[RecordType]): none | all | part = js.native
  
  def getCurrentPageItems(): Unit = js.native
  
  def getFilteredItems(dataSource: js.Array[RecordType], filterValue: String): FilteredItems[RecordType] = js.native
  
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String]
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: Boolean,
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction[RecordType]
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction[RecordType],
    showSearch: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction[RecordType],
    showSearch: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[RecordType],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction[RecordType],
    showSearch: Boolean,
    disabled: Boolean
  ): ReactNode = js.native
  
  def getSelectAllLabel(selectedCount: Double, totalCount: Double): ReactNode = js.native
  
  def handleClear(): Unit = js.native
  
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  def matchFilter(text: String, item: RecordType): Boolean = js.native
  
  def renderItem(item: RecordType): RenderedItem[RecordType] = js.native
  
  def renderListBody(renderList: js.UndefOr[scala.Nothing], props: TransferListBodyProps[RecordType]): BodyContent = js.native
  def renderListBody(renderList: RenderListFunction[RecordType], props: TransferListBodyProps[RecordType]): BodyContent = js.native
  
  var timer: Double = js.native
  
  var triggerScrollTimer: Double = js.native
}
