package typings.antd.transferListMod

import typings.antd.listBodyMod.TransferListBodyProps
import typings.antd.transferInterfaceMod.PaginationType
import typings.antd.transferMod.RenderResult
import typings.antd.transferMod.SelectAllLabel
import typings.antd.transferMod.TransferDirection
import typings.antd.transferMod.TransferItem
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
import scala.scalajs.js.annotation._

trait TransferListProps extends TransferLocale {
  var checkedKeys: js.Array[String]
  var dataSource: js.Array[TransferItem]
  var direction: TransferDirection
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.undefined
  var pagination: js.UndefOr[PaginationType] = js.undefined
  var prefixCls: String
  /** render item */
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var selectAllLabel: js.UndefOr[SelectAllLabel] = js.undefined
  var showRemove: js.UndefOr[Boolean] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleText: String
  def handleClear(): Unit
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit
  def onItemSelect(key: String, check: Boolean): Unit
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
  def onScroll(e: UIEvent[HTMLUListElement, NativeUIEvent]): Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String],
    dataSource: js.Array[TransferItem],
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
    titles: js.Array[String],
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* filterText */ String, /* item */ TransferItem) => Boolean = null,
    footer: /* props */ TransferListProps => ReactNode = null,
    notFoundContent: ReactNode = null,
    onItemRemove: /* keys */ js.Array[String] => Unit = null,
    pagination: PaginationType = null,
    render: /* item */ TransferItem => RenderResult = null,
    renderList: /* props */ TransferListBodyProps => ReactNode = null,
    selectAllLabel: SelectAllLabel = null,
    showRemove: js.UndefOr[Boolean] = js.undefined,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onItemRemove != null) __obj.updateDynamic("onItemRemove")(js.Any.fromFunction1(onItemRemove))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderList != null) __obj.updateDynamic("renderList")(js.Any.fromFunction1(renderList))
    if (selectAllLabel != null) __obj.updateDynamic("selectAllLabel")(selectAllLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemove)) __obj.updateDynamic("showRemove")(showRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListProps]
  }
}

