package typings
package antdLib.libTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var checkedKeys: js.Array[java.lang.String]
  var dataSource: js.Array[antdLib.libTransferMod.TransferItem]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filter: java.lang.String
  var filterOption: js.UndefOr[js.Function2[/* filterText */ js.Any, /* item */ js.Any, scala.Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var itemUnit: java.lang.String
  var itemsUnit: java.lang.String
  var `lazy`: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var notFoundContent: reactLib.reactMod.ReactNs.ReactNode
  var onScroll: js.Function
  var prefixCls: java.lang.String
  var render: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
  var searchPlaceholder: java.lang.String
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var titleText: java.lang.String
  def handleClear(): scala.Unit
  def handleFilter(e: js.Any): scala.Unit
  def handleSelect(selectedItem: js.Any, checked: scala.Boolean): scala.Unit
  def handleSelectAll(dataSource: js.Array[_], checkAll: scala.Boolean): scala.Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[java.lang.String],
    dataSource: js.Array[antdLib.libTransferMod.TransferItem],
    filter: java.lang.String,
    handleClear: js.Function0[scala.Unit],
    handleFilter: js.Function1[js.Any, scala.Unit],
    handleSelect: js.Function2[js.Any, scala.Boolean, scala.Unit],
    handleSelectAll: js.Function2[js.Array[_], scala.Boolean, scala.Unit],
    itemUnit: java.lang.String,
    itemsUnit: java.lang.String,
    notFoundContent: reactLib.reactMod.ReactNs.ReactNode,
    onScroll: js.Function,
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    titleText: java.lang.String,
    body: js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filterOption: js.Function2[/* filterText */ js.Any, /* item */ js.Any, scala.Boolean] = null,
    footer: js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    `lazy`: scala.Boolean | js.Object = null,
    render: js.Function1[/* item */ js.Any, _] = null,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkedKeys")(checkedKeys)
    __obj.updateDynamic("dataSource")(dataSource)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("handleClear")(handleClear)
    __obj.updateDynamic("handleFilter")(handleFilter)
    __obj.updateDynamic("handleSelect")(handleSelect)
    __obj.updateDynamic("handleSelectAll")(handleSelectAll)
    __obj.updateDynamic("itemUnit")(itemUnit)
    __obj.updateDynamic("itemsUnit")(itemsUnit)
    __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    __obj.updateDynamic("titleText")(titleText)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (filterOption != null) __obj.updateDynamic("filterOption")(filterOption)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TransferListProps]
  }
}

