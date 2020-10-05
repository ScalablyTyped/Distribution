package typings.antd.transferListMod

import typings.antd.anon.BodyContent
import typings.antd.anon.FilteredItems
import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.all
import typings.antd.antdStrings.none
import typings.antd.antdStrings.part
import typings.antd.listBodyMod.TransferListBodyProps
import typings.antd.transferMod.TransferItem
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
trait TransferList
  extends Component[TransferListProps, TransferListState, js.Any] {
  var defaultListBodyRef: RefObject[typings.antd.listBodyMod.default] = js.native
  var timer: Double = js.native
  var triggerScrollTimer: Double = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): Unit = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit]
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean,
    disabled: Boolean
  ): `false` | Element = js.native
  def getCheckStatus(filteredItems: js.Array[TransferItem]): none | all | part = js.native
  def getCurrentPageItems(): Unit = js.native
  def getFilteredItems(dataSource: js.Array[TransferItem], filterValue: String): FilteredItems = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String]
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: js.UndefOr[scala.Nothing],
    showSearch: Boolean,
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: js.UndefOr[scala.Nothing],
    disabled: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean
  ): ReactNode = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: ReactNode,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean,
    disabled: Boolean
  ): ReactNode = js.native
  def getSelectAllLabel(selectedCount: Double, totalCount: Double): ReactNode = js.native
  def handleClear(): Unit = js.native
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def matchFilter(text: String, item: TransferItem): Boolean = js.native
  def renderItem(item: TransferItem): RenderedItem = js.native
  def renderListBody(renderList: js.UndefOr[scala.Nothing], props: TransferListBodyProps): BodyContent = js.native
  def renderListBody(renderList: RenderListFunction, props: TransferListBodyProps): BodyContent = js.native
}

