package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.Anon_X
import typings.antd.RecordkeyofTArraystring
import typings.antd.antdNumbers.`false`
import typings.antd.esPaginationPaginationMod.PaginationConfig
import typings.antd.esSpinMod.SpinProps
import typings.antd.esTableInterfaceMod.ColumnProps
import typings.antd.esTableInterfaceMod.ExpandIconProps
import typings.antd.esTableInterfaceMod.SortOrder
import typings.antd.esTableInterfaceMod.SorterResult
import typings.antd.esTableInterfaceMod.TableComponents
import typings.antd.esTableInterfaceMod.TableCurrentDataSource
import typings.antd.esTableInterfaceMod.TableEventListeners
import typings.antd.esTableInterfaceMod.TableLocale
import typings.antd.esTableInterfaceMod.TableProps
import typings.antd.esTableInterfaceMod.TableRowSelection
import typings.antd.esTableInterfaceMod.TableSize
import typings.antd.esTableMod.default
import typings.react.reactMod.CSSProperties
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Table
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esTableMod.default[js.Any]].asInstanceOf[String | js.Object]
  def apply[T](
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    childrenColumnName: String = null,
    columns: js.Array[ColumnProps[T]] = null,
    components: TableComponents = null,
    dataSource: js.Array[T] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Double | String] = null,
    dropdownPrefixCls: String = null,
    expandIcon: /* props */ ExpandIconProps[T] => TagMod[Any] = null,
    expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[Double | String] = null,
    expandedRowRender: (/* record */ T, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => TagMod[Any] = null,
    footer: /* currentPageData */ js.Array[T] => TagMod[Any] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    indentSize: Int | Double = null,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ PaginationConfig, /* filters */ RecordkeyofTArraystring, /* sorter */ SorterResult[T], /* extra */ TableCurrentDataSource[T]) => Unit = null,
    onExpand: (/* expanded */ Boolean, /* record */ T) => Unit = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[Double | String] => Unit = null,
    onHeaderRow: /* columns */ js.Array[ColumnProps[T]] => TableEventListeners = null,
    onRow: (/* record */ T, /* index */ Double) => TableEventListeners = null,
    onRowClick: (/* record */ T, /* index */ Double, /* event */ Event) => Unit = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    rowClassName: (/* record */ T, /* index */ Double) => String = null,
    rowKey: String | (js.Function2[/* record */ T, /* index */ Double, String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: Anon_X = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    title: /* currentPageData */ js.Array[T] => TagMod[Any] = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (components != null) __obj.updateDynamic("components")(components)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows)
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys)
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell)
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick)
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys)
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction1(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction2(rowClassName))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (size != null) __obj.updateDynamic("size")(size)
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections)
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.antd.esTableMod.default[js.Any]]]
  }
  type Props = TableProps[js.Any]
}

