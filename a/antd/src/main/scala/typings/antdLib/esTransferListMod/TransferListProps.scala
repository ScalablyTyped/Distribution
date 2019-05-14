package typings
package antdLib.esTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNode]] = js.undefined
  var checkedKeys: js.Array[java.lang.String]
  var dataSource: js.Array[antdLib.esTransferMod.TransferItem]
  var direction: antdLib.esTransferMod.TransferDirection
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filterOption: js.UndefOr[
    js.Function2[
      /* filterText */ java.lang.String, 
      /* item */ antdLib.esTransferMod.TransferItem, 
      scala.Boolean
    ]
  ] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNode]] = js.undefined
  var itemUnit: java.lang.String
  var itemsUnit: java.lang.String
  var `lazy`: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var notFoundContent: reactLib.reactMod.ReactNode
  var onScroll: js.Function
  var prefixCls: java.lang.String
  var render: js.UndefOr[
    js.Function1[/* item */ antdLib.esTransferMod.TransferItem, antdLib.esTransferMod.RenderResult]
  ] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var searchPlaceholder: java.lang.String
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var showSelectAll: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var titleText: java.lang.String
  def handleClear(): scala.Unit
  def handleFilter(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit
  def handleSelect(selectedItem: antdLib.esTransferMod.TransferItem, checked: scala.Boolean): scala.Unit
  /** [Legacy] Only used when `body` prop used. */
  def handleSelectAll(dataSource: js.Array[antdLib.esTransferMod.TransferItem], checkAll: scala.Boolean): scala.Unit
  def onItemSelect(key: java.lang.String, check: scala.Boolean): scala.Unit
  def onItemSelectAll(dataSource: js.Array[java.lang.String], checkAll: scala.Boolean): scala.Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[java.lang.String],
    dataSource: js.Array[antdLib.esTransferMod.TransferItem],
    direction: antdLib.esTransferMod.TransferDirection,
    handleClear: () => scala.Unit,
    handleFilter: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement] => scala.Unit,
    handleSelect: (antdLib.esTransferMod.TransferItem, scala.Boolean) => scala.Unit,
    handleSelectAll: (js.Array[antdLib.esTransferMod.TransferItem], scala.Boolean) => scala.Unit,
    itemUnit: java.lang.String,
    itemsUnit: java.lang.String,
    notFoundContent: reactLib.reactMod.ReactNode,
    onItemSelect: (java.lang.String, scala.Boolean) => scala.Unit,
    onItemSelectAll: (js.Array[java.lang.String], scala.Boolean) => scala.Unit,
    onScroll: js.Function,
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    titleText: java.lang.String,
    body: /* props */ TransferListProps => reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filterOption: (/* filterText */ java.lang.String, /* item */ antdLib.esTransferMod.TransferItem) => scala.Boolean = null,
    footer: /* props */ TransferListProps => reactLib.reactMod.ReactNode = null,
    `lazy`: scala.Boolean | js.Object = null,
    render: /* item */ antdLib.esTransferMod.TransferItem => antdLib.esTransferMod.RenderResult = null,
    renderList: RenderListFunction = null,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    showSelectAll: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
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

