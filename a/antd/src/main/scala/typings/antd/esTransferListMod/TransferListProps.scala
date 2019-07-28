package typings.antd.esTransferListMod

import typings.antd.esTransferMod.RenderResult
import typings.antd.esTransferMod.TransferDirection
import typings.antd.esTransferMod.TransferItem
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var checkedKeys: js.Array[String]
  var dataSource: js.Array[TransferItem]
  var direction: TransferDirection
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, ReactNode]] = js.undefined
  var itemUnit: String
  var itemsUnit: String
  var `lazy`: js.UndefOr[Boolean | js.Object] = js.undefined
  var notFoundContent: ReactNode
  var onScroll: js.Function
  var prefixCls: String
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var searchPlaceholder: String
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleText: String
  def handleClear(): Unit
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit
  def handleSelect(selectedItem: TransferItem, checked: Boolean): Unit
  /** [Legacy] Only used when `body` prop used. */
  def handleSelectAll(dataSource: js.Array[TransferItem], checkAll: Boolean): Unit
  def onItemSelect(key: String, check: Boolean): Unit
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String],
    dataSource: js.Array[TransferItem],
    direction: TransferDirection,
    handleClear: () => Unit,
    handleFilter: ChangeEvent[HTMLInputElement] => Unit,
    handleSelect: (TransferItem, Boolean) => Unit,
    handleSelectAll: (js.Array[TransferItem], Boolean) => Unit,
    itemUnit: String,
    itemsUnit: String,
    notFoundContent: ReactNode,
    onItemSelect: (String, Boolean) => Unit,
    onItemSelectAll: (js.Array[String], Boolean) => Unit,
    onScroll: js.Function,
    prefixCls: String,
    searchPlaceholder: String,
    titleText: String,
    body: /* props */ TransferListProps => ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* filterText */ String, /* item */ TransferItem) => Boolean = null,
    footer: /* props */ TransferListProps => ReactNode = null,
    `lazy`: Boolean | js.Object = null,
    render: /* item */ TransferItem => RenderResult = null,
    renderList: RenderListFunction = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys, dataSource = dataSource, direction = direction, handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), handleSelect = js.Any.fromFunction2(handleSelect), handleSelectAll = js.Any.fromFunction2(handleSelectAll), itemUnit = itemUnit, itemsUnit = itemsUnit, notFoundContent = notFoundContent.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = onScroll, prefixCls = prefixCls, searchPlaceholder = searchPlaceholder, titleText = titleText)
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1(body))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderList != null) __obj.updateDynamic("renderList")(renderList)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TransferListProps]
  }
}

