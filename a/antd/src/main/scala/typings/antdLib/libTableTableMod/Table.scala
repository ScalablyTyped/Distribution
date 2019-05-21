package typings
package antdLib.libTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table[T]
  extends reactLib.reactMod.Component[
      antdLib.libTableInterfaceMod.TableProps[T], 
      antdLib.libTableInterfaceMod.TableState[T], 
      js.Any
    ] {
  var CheckboxPropsCache: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]] = js.native
  var components: antdLib.libTableInterfaceMod.TableComponents = js.native
  var row: reactLib.reactMod.ComponentType[_] = js.native
  var store: antdLib.libTableCreateStoreMod.Store = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTable(nextProps: antdLib.libTableInterfaceMod.TableProps[T]): scala.Unit = js.native
  def createComponents(): scala.Unit = js.native
  def createComponents(components: antdLib.libTableInterfaceMod.TableComponents): scala.Unit = js.native
  def createComponents(
    components: antdLib.libTableInterfaceMod.TableComponents,
    prevComponents: antdLib.libTableInterfaceMod.TableComponents
  ): scala.Unit = js.native
  def findColumn(myKey: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def findColumn(myKey: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def generatePopupContainerFunc(): js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.native
  def getCheckboxPropsByItem(item: T, index: scala.Double): js.Any = js.native
  def getColumnKey(column: antdLib.libTableInterfaceMod.ColumnProps[T]): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getColumnKey(column: antdLib.libTableInterfaceMod.ColumnProps[T], index: scala.Double): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getCurrentPageData(): js.Array[T] = js.native
  def getDefaultPagination(props: antdLib.libTableInterfaceMod.TableProps[T]): js.Object = js.native
  def getDefaultSelection(): js.Array[_] = js.native
  def getDefaultSortOrder(): antdLib.Anon_SortColumn = js.native
  def getDefaultSortOrder(columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]]): antdLib.Anon_SortColumn = js.native
  def getFilteredValueColumns(): js.Any = js.native
  def getFilteredValueColumns(columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]]): js.Any = js.native
  def getFiltersFromColumns(): js.Any = js.native
  def getFiltersFromColumns(columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]]): js.Any = js.native
  def getFlatCurrentPageData(): js.Array[_] = js.native
  def getFlatData(): js.Array[_] = js.native
  def getLocalData(): js.Array[T] = js.native
  def getLocalData(state: antdLib.libTableInterfaceMod.TableState[T]): js.Array[T] = js.native
  def getLocalData(state: antdLib.libTableInterfaceMod.TableState[T], filter: scala.Boolean): js.Array[T] = js.native
  def getLocalData(state: scala.Null, filter: scala.Boolean): js.Array[T] = js.native
  def getMaxCurrent(total: scala.Double): js.UndefOr[scala.Double] = js.native
  def getPopupContainer(): stdLib.HTMLElement = js.native
  def getRecordKey(record: T, index: scala.Double): js.Any = js.native
  def getSortOrderColumns(): js.Any = js.native
  def getSortOrderColumns(columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]]): js.Any = js.native
  def getSortStateFromColumns(): antdLib.Anon_SortColumn = js.native
  def getSortStateFromColumns(columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]]): antdLib.Anon_SortColumn = js.native
  def getSorterFn(state: antdLib.libTableInterfaceMod.TableState[T]): js.UndefOr[js.Function2[/* a */ T, /* b */ T, scala.Double]] = js.native
  def handleFilter(column: antdLib.libTableInterfaceMod.ColumnProps[T], nextFilters: js.Array[java.lang.String]): scala.Unit = js.native
  def handlePageChange(current: scala.Double, otherArguments: js.Any*): scala.Unit = js.native
  def handleRadioSelect(record: T, rowIndex: scala.Double, e: antdLib.libRadioInterfaceMod.RadioChangeEvent): scala.Unit = js.native
  def handleSelect(record: T, rowIndex: scala.Double, e: antdLib.libCheckboxCheckboxMod.CheckboxChangeEvent): scala.Unit = js.native
  def handleSelectRow(
    selectionKey: java.lang.String,
    index: scala.Double,
    onSelectFunc: antdLib.libTableInterfaceMod.SelectionItemSelectFn
  ): js.Any = js.native
  def handleShowSizeChange(current: scala.Double, pageSize: scala.Double): scala.Unit = js.native
  def hasPagination(): scala.Boolean = js.native
  def hasPagination(props: js.Any): scala.Boolean = js.native
  def isFiltersChanged(filters: antdLib.libTableInterfaceMod.TableStateFilters): scala.Boolean = js.native
  def isSameColumn(): js.Any = js.native
  def isSameColumn(a: antdLib.libTableInterfaceMod.ColumnProps[T]): js.Any = js.native
  def isSameColumn(a: antdLib.libTableInterfaceMod.ColumnProps[T], b: antdLib.libTableInterfaceMod.ColumnProps[T]): js.Any = js.native
  def isSameColumn(a: scala.Null, b: antdLib.libTableInterfaceMod.ColumnProps[T]): js.Any = js.native
  def isSortColumn(column: antdLib.libTableInterfaceMod.ColumnProps[T]): scala.Boolean = js.native
  def onRow(prefixCls: java.lang.String, record: T, index: scala.Double): js.Any = js.native
  def prepareParamsArguments(state: js.Any): antdLib.libTableInterfaceMod.PrepareParamsArgumentsReturn[T] = js.native
  def recursiveSort(data: js.Array[T], sorterFn: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double]): js.Array[T] = js.native
  def renderColumnTitle(): reactLib.reactMod.ReactNode = js.native
  def renderColumnTitle(title: js.Function1[/* options */ antdLib.Anon_FiltersSortOrder, reactLib.reactMod.ReactNode]): reactLib.reactMod.ReactNode = js.native
  def renderColumnTitle(title: reactLib.reactMod.ReactNode): reactLib.reactMod.ReactNode = js.native
  def renderColumnsDropdown(
    prefixCls: java.lang.String,
    dropdownPrefixCls: java.lang.String,
    columns: js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]],
    locale: antdLib.libTableInterfaceMod.TableLocale
  ): js.Array[_] = js.native
  def renderComponent(hasGetPrefixClsRenderEmpty: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderPagination(prefixCls: java.lang.String, paginationPosition: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderRowSelection(prefixCls: java.lang.String, locale: antdLib.libTableInterfaceMod.TableLocale): js.Array[antdLib.libTableInterfaceMod.ColumnProps[T]] = js.native
  def renderSelectionBox(): js.Function3[
    /* _ */ js.Any, 
    /* record */ T, 
    /* index */ scala.Double, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  @JSName("renderSelectionBox")
  def renderSelectionBox_checkbox(`type`: antdLib.antdLibStrings.checkbox): js.Function3[
    /* _ */ js.Any, 
    /* record */ T, 
    /* index */ scala.Double, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  @JSName("renderSelectionBox")
  def renderSelectionBox_radio(`type`: antdLib.antdLibStrings.radio): js.Function3[
    /* _ */ js.Any, 
    /* record */ T, 
    /* index */ scala.Double, 
    reactLib.reactMod.Global.JSXNs.Element
  ] = js.native
  def renderTable(
    prefixCls: java.lang.String,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[java.lang.String], reactLib.reactMod.ReactNode],
    dropdownPrefixCls: java.lang.String,
    contextLocale: antdLib.libTableInterfaceMod.TableLocale
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setSelectedRowKeys(
    selectedRowKeys: js.Array[java.lang.String],
    selectionInfo: antdLib.libTableInterfaceMod.SelectionInfo[T]
  ): scala.Unit = js.native
  def toggleSortOrder(column: antdLib.libTableInterfaceMod.ColumnProps[T]): scala.Unit = js.native
}

