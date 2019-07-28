package typings.antd.esTableTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.Anon_Arg
import typings.antd.Anon_Filters
import typings.antd.Anon_SortColumn
import typings.antd.antdStrings.checkbox
import typings.antd.antdStrings.radio
import typings.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import typings.antd.esTableCreateStoreMod.Store
import typings.antd.esTableInterfaceMod.ColumnProps
import typings.antd.esTableInterfaceMod.PrepareParamsArgumentsReturn
import typings.antd.esTableInterfaceMod.SelectionInfo
import typings.antd.esTableInterfaceMod.SelectionItemSelectFn
import typings.antd.esTableInterfaceMod.TableComponents
import typings.antd.esTableInterfaceMod.TableLocale
import typings.antd.esTableInterfaceMod.TableProps
import typings.antd.esTableInterfaceMod.TableState
import typings.antd.esTableInterfaceMod.TableStateFilters
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[T]
  extends Component[TableProps[T], TableState[T], js.Any] {
  var CheckboxPropsCache: StringDictionary[js.Any] = js.native
  var columns: js.Array[ColumnProps[T]] = js.native
  var components: TableComponents = js.native
  var row: ComponentType[_] = js.native
  var store: Store = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTable(nextProps: TableProps[T]): Unit = js.native
  def createComponents(): Unit = js.native
  def createComponents(components: TableComponents): Unit = js.native
  def createComponents(components: TableComponents, prevComponents: TableComponents): Unit = js.native
  def findColumn(myKey: String): js.UndefOr[scala.Nothing] = js.native
  def findColumn(myKey: Double): js.UndefOr[scala.Nothing] = js.native
  def generatePopupContainerFunc(): js.UndefOr[js.Function0[HTMLElement]] = js.native
  def getCheckboxPropsByItem(item: T, index: Double): js.Any = js.native
  def getColumnKey(column: ColumnProps[T]): js.UndefOr[String | Double] = js.native
  def getColumnKey(column: ColumnProps[T], index: Double): js.UndefOr[String | Double] = js.native
  def getCurrentPageData(): js.Array[T] = js.native
  def getDefaultPagination(props: TableProps[T]): js.Object = js.native
  def getDefaultSelection(): js.Array[_] = js.native
  def getDefaultSortOrder(): Anon_SortColumn = js.native
  def getDefaultSortOrder(columns: js.Array[ColumnProps[T]]): Anon_SortColumn = js.native
  def getFilteredValueColumns(): js.Any = js.native
  def getFilteredValueColumns(columns: js.Array[ColumnProps[T]]): js.Any = js.native
  def getFiltersFromColumns(): js.Any = js.native
  def getFiltersFromColumns(columns: js.Array[ColumnProps[T]]): js.Any = js.native
  def getFlatCurrentPageData(): js.Array[_] = js.native
  def getFlatData(): js.Array[_] = js.native
  def getLocalData(): js.Array[T] = js.native
  def getLocalData(state: Null, filter: Boolean): js.Array[T] = js.native
  def getLocalData(state: TableState[T]): js.Array[T] = js.native
  def getLocalData(state: TableState[T], filter: Boolean): js.Array[T] = js.native
  def getMaxCurrent(total: Double): js.UndefOr[Double] = js.native
  def getPopupContainer(): HTMLElement = js.native
  def getRecordKey(record: T, index: Double): js.Any = js.native
  def getSortOrderColumns(): js.Any = js.native
  def getSortOrderColumns(columns: js.Array[ColumnProps[T]]): js.Any = js.native
  def getSortStateFromColumns(): Anon_SortColumn = js.native
  def getSortStateFromColumns(columns: js.Array[ColumnProps[T]]): Anon_SortColumn = js.native
  def getSorterFn(state: TableState[T]): js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.native
  def handleFilter(column: ColumnProps[T], nextFilters: js.Array[String]): Unit = js.native
  def handlePageChange(current: Double, otherArguments: js.Any*): Unit = js.native
  def handleRadioSelect(record: T, rowIndex: Double, e: RadioChangeEvent): Unit = js.native
  def handleSelect(record: T, rowIndex: Double, e: CheckboxChangeEvent): Unit = js.native
  def handleSelectRow(selectionKey: String, index: Double, onSelectFunc: SelectionItemSelectFn): Unit = js.native
  def handleShowSizeChange(current: Double, pageSize: Double): Unit = js.native
  def hasPagination(): Boolean = js.native
  def hasPagination(props: js.Any): Boolean = js.native
  def isFiltersChanged(filters: TableStateFilters): Boolean = js.native
  def isSameColumn(): js.Any = js.native
  def isSameColumn(a: Null, b: ColumnProps[T]): js.Any = js.native
  def isSameColumn(a: ColumnProps[T]): js.Any = js.native
  def isSameColumn(a: ColumnProps[T], b: ColumnProps[T]): js.Any = js.native
  def isSortColumn(column: ColumnProps[T]): Boolean = js.native
  def onRow(prefixCls: String, record: T, index: Double): Anon_Arg = js.native
  def prepareParamsArguments(state: js.Any): PrepareParamsArgumentsReturn[T] = js.native
  def recursiveSort(data: js.Array[T], sorterFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): js.Array[T] = js.native
  def renderColumnTitle(): ReactNode = js.native
  def renderColumnTitle(title: js.Function1[/* options */ Anon_Filters, ReactNode]): ReactNode = js.native
  def renderColumnTitle(title: ReactNode): ReactNode = js.native
  def renderColumnsDropdown(
    prefixCls: String,
    dropdownPrefixCls: String,
    columns: js.Array[ColumnProps[T]],
    locale: TableLocale
  ): js.Array[_] = js.native
  def renderComponent(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
  def renderPagination(prefixCls: String, paginationPosition: String): Element | Null = js.native
  def renderRowSelection(prefixCls: String, locale: TableLocale): js.Array[ColumnProps[T]] = js.native
  def renderSelectionBox(): js.Function3[/* _ */ js.Any, /* record */ T, /* index */ Double, Element] = js.native
  @JSName("renderSelectionBox")
  def renderSelectionBox_checkbox(`type`: checkbox): js.Function3[/* _ */ js.Any, /* record */ T, /* index */ Double, Element] = js.native
  @JSName("renderSelectionBox")
  def renderSelectionBox_radio(`type`: radio): js.Function3[/* _ */ js.Any, /* record */ T, /* index */ Double, Element] = js.native
  def renderTable(
    prefixCls: String,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], ReactNode],
    dropdownPrefixCls: String,
    contextLocale: TableLocale
  ): Element = js.native
  def setSelectedRowKeys(selectedRowKeys: js.Array[String], selectionInfo: SelectionInfo[T]): Unit = js.native
  def toggleSortOrder(column: ColumnProps[T]): Unit = js.native
}

