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

